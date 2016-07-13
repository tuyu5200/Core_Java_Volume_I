package testDemo.UseReflectionToChangeFields;

import java.util.Scanner;

/**
 * Version: ${Date}
 * Author: Tuyu
 */
public class testReflection {
    public static void main(String[] args) {
        Students student = new Students("tuyu", "man", 20);
        System.out.println(student);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the new name to change:");
        String newName = in.next();
        try {
            student.changeFields(student, newName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println(student);

    }
}
