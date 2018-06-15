package com.lv.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "addressname")
    private String addressname;
    private String tel;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressname='" + addressname + '\'' +
                ", tel='" + tel + '\'' +
                ", user=" + user +
                '}';
    }

    public Address() { }

    public Address(String addressname, String tel, User user) {
        this.addressname = addressname;
        this.tel = tel;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressname() {
        return addressname;
    }

    public void setAddressname(String addressname) {
        this.addressname = addressname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
