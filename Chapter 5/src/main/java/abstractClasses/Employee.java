package abstractClasses;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 16:26 .
 */
public class Employee extends Person {
    private double salary;
    private Date hireDay;

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }


    public Employee(String name, double salary, int year,int month,int day) {
        super(name);
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay=calendar.getTime();
    }

    @Override
    public String Description() {
        String description="This is a employee salary is " + salary + " and the hireday is " + hireDay;
        return description;
    }
}
