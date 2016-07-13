package interfaces;

import java.util.Date;

/**
 * 方法用途： 对employees进行排序，必须实现comparable接口的compare方法
 * Created by Tuyu on 2016/7/11 17:10 .
 */
public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {

        this.name = name;
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;

    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

}
