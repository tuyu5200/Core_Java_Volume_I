package clone;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 18:40 .
 */
public class cloneTest  {
    public static void main(String[] args) {
        try {
            cloneEmployee a = new cloneEmployee("tuyu", 9000);
            a.setHireDay(2016, 4, 26);
            cloneEmployee b = (cloneEmployee) a.clone();
            b.raiseSalary(50);
            b.setHireDay(2012, 3, 2);
            System.out.println("a=" + a);
            System.out.println("b=" + b);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
