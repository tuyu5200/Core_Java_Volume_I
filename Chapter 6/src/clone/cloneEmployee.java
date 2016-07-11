package clone;


import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 方法用途：如果clone的子对象可变，则必须实现深拷贝，重新定义clone方法。反之则使用浅拷贝
 * Created by Tuyu on 2016/7/11 18:20 .
 */
public class cloneEmployee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public cloneEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    /**
     * @方法描述 为了实现深拷贝，必须clone所有可变的实例域。
     * @return clone的对象
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        //call Object.clone()
        cloneEmployee cloned = (cloneEmployee) super.clone();
        //clone 可变的实例域
        cloned.hireDay=(Date) hireDay.clone();
        return cloned;
    }

    /**
     * @方法描述 设置薪水发放日期
     * @param year 年
     * @param month 月
     * @param day 日
     */
    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());

    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee ｛ name= " + name + "    salary=" + salary + "    hireDay=" + hireDay + "}";
    }
}
