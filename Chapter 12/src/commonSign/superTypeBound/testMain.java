package commonSign.superTypeBound;

import static commonSign.superTypeBound.Pair.minAndMaxBouns;

/**
 * Program is use
 * Version: 2016/7/16
 * Author: Tuyu
 */
public class testMain {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        Manager[] managers = new Manager[4];
        for (int i = 0; i < managers.length; i++) {
            managers[i] = new Manager("tuyu"+i, 5000*Math.random(), 500*i);
            employees[i] = managers[i];
        }
        Pair<Employee> employeePair = (Pair<Employee>) minAndMaxBouns(managers);
        Pair<Manager> minmax = (Pair<Manager>) minAndMaxBouns(managers);
        Manager min=minmax.getMin();
        Manager max=minmax.getMax();
        Employee mine=employeePair.getMin();
        Employee emax=employeePair.getMax();
        System.out.println("Emax=" + emax);
        System.out.println("emin= " + mine);
        System.out.println("min= " + min.getSalary() + "   name:" + min.getName());
        System.out.println("max= " + max.getSalary() + "   name:" + max.getName());

    }
}
