package interfaces;

import java.util.Arrays;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 17:16 .
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("tuyu", 8000);
        employees[1] = new Employee("张三", 2000);
        employees[2] = new Employee("历史", 200.22);
        //调用sort方法必须实现接口
        Arrays.sort(employees);
        for (Employee e : employees) {
            System.out.println("name= " + e.getName() + " salary is : " + e.getSalary());
        }
    }
}
