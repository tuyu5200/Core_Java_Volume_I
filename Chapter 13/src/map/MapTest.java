package map;

import abstractClasses.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Program is use 映射表（map）
 * Version: 2016/7/21
 * Author: Tuyu
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("1-1", new Employee("aim", 2000, 2016, 6, 6));
        staff.put("1-3", new Employee("bob", 3000, 2016, 2, 3));
        staff.put("1-2", new Employee("come", 2000.26, 2015, 3, 15));
        staff.put("1-4", new Employee("dave", 3004, 2014, 7, 2));

        Map<String, Employee> treeStaff = new TreeMap<>();
        treeStaff.putAll(staff);

        //print all entries
        System.out.println("<HashMap> all staff is:");
        System.out.println(staff);
        System.out.println("<TreeMap> all staff is:");
        System.out.println(treeStaff);

        //remove an entry
        staff.remove("1-3");

        //replace an entry
        staff.put("1-2", new Employee("change-b", 500, 2014, 5, 8));

        //look up a entry
        System.out.println("the changed staff 1-2 is:");
        System.out.println(staff.get("1-2"));

        //迭代所有staff
        for (Map.Entry<String, Employee> entry : staff.entrySet()) {
            String key=entry.getKey();
            Employee value=entry.getValue();
            System.out.println("key=" + key + ", vlaue= " + value);
        }
    }
}
