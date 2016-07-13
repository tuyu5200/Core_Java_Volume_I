package interfaces;

import java.util.Arrays;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 17:16 .
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("tuyu", 8000,2016,6,6);
        employees[1] = new Employee("张三", 2000,2015,1,2);
        employees[2] = new Employee("历史", 200.22,2013,1,26);
        //调用sort方法必须实现接口
        Arrays.sort(employees);


        /**
         * 鉴于历史原因，getName方法在应用于数组类型的时候会返回一个很奇怪的名字
         */
        System.out.println(employees.getClass().getName());


        for (Employee e : employees) {

            System.out.println("name= " + e.getName() + " salary is : " + e.getSalary());
        }
    }
}
