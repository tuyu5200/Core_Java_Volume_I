package abstractClasses;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 16:40 .
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Student("tuyu", "大二", "成都理工大学");
        persons[1] = new Employee("zhangsan", 3000, 2016, 6, 12);
        for (Person p:persons){
            System.out.println(p.getName()+","+p.Description());
        }
    }
}
