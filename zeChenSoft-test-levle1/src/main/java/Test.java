public class Test {
    public int climbStairs(int n) {
        int i=1;
        if(n<=0)
            return 0;
        if(n==1){
            return i;
        }
        if(n==2){
            i++;
            return i;
        }
        else
            return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String []args){
        Test cs=new Test();
        int a =cs.climbStairs(4);
        System.out.println(a);
    }

    /**
     * climbStairs(4-1) + climbStairs(2)
     * climbStairs(3) + climbStairs(2)
     * climbStairs(2) + climbStairs(1) + climbStairs(2)
     * 2 + 1 + 2
     * 5
     */

}
