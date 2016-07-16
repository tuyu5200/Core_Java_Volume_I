package commonSign.superTypeBound;

/**
 * Program is use
 * Version: 2016/7/16
 * Author: Tuyu
 */
public class Manager extends Employee{
    private double bouns;

    public Manager(String name, double salary,double bouns) {
        super(name, salary);
        this.bouns=bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    @Override
    public double getSalary() {
        double baseSalary=super.getSalary();
        return baseSalary+bouns;
    }
}
