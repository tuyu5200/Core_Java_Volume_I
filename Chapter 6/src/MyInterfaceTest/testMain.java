package MyInterfaceTest;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 17:50 .
 */
public class testMain extends setNameAndSchoolImpl {

    public static void main(String[] args) {
        testMain test=new testMain();
        String name = test.setName("涂宇");
        String school = test.setSchool("CDUT");
        System.out.println("name: " + name + " school: " + school);
        System.out.println(schoolName);//输出接口中的常量

    }
}
