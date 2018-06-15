package com.lv.test;

import com.lv.pojo.Student;
import com.lv.pojo.Teacher;
import com.lv.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HibernateManyToManayTest {

    private Session session;

    /**
     * 测试前置，完成session 配置
     */
    @Before
    public void init() {
        session = HibernateUtil.getSession();
        session.beginTransaction();
    }

    /**
     * 测试后置，提交事务
     */
    @After
    public void close() {
        session.getTransaction().commit();
    }


    /**
     * 保存多对多关系，先把不维护关系的存了，在把维护关系的存了
     * 如果双向保存，则会报错，因为关联关系会重复，只能让其中一端放弃关系维护
     */
    @Test
    public void saveTestCase() {
        Student student = new Student();
        student.setName("student 3");
        Student student2 = new Student();
        student2.setName("student 4");

        Teacher teacher = new Teacher();
        teacher.setName("teacher 3");
        Teacher teacher2 = new Teacher();
        teacher2.setName("teacher 4");

        Set<Teacher> teacherSet = new HashSet<>();
        teacherSet.add(teacher);
        teacherSet.add(teacher2);

        student.setTeachers(teacherSet);
        student2.setTeachers(teacherSet);

        //在配置文件中让Teacher 放弃关系维护,下面的代码是无效的
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);
        studentSet.add(student2);

        teacher.setStudents(studentSet);
        teacher2.setStudents(studentSet);


        session.save(teacher);
        session.save(teacher2);

        session.save(student);
        session.save(student2);
    }


    /**
     * 根据学生查询老师信息
     * 延迟加载，会查两次，第一次查出全部学生信息，第二次需要Student 中的Set 再去查一次
     */
    @Test
    public void selectInfoByStudentId() {
        Student student = (Student) session.get(Student.class, 7);

        System.out.println("学生姓名：" + student.getName());

        Set<Teacher> teachers = student.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println("关联老师姓名： " + teacher.getName());
        }
    }

}
