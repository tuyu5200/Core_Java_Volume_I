package commonSign.superTypeBound;

/**
 * Program is use
 * Version: 2016/7/16
 * Author: Tuyu
 */
public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, double salary) {
        this.name=name;
        this.salary = salary;
    }

}
