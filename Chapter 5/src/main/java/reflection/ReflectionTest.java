package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Scanner;

/**
 * 利用反射分析类的能力--检查类的结构
 * 方法用途： use reflection to print all feature of a class
 * Created by Tuyu on 2016/7/12 15:54 .
 */
public class ReflectionTest {
    public static void main(String[] args) {
        //read class name from command line args or user input
        String name;
        if (args.length>0)
            name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a class name to print it's feature: (e.g. java.util.Date)=");
            name = in.next();
        }

        try {
            //print class name and superclass name(if !Object)
            Class cl = Class.forName(name);
            Class supercl=cl.getSuperclass();
            String modifier = Modifier.toString(cl.getModifiers());
            if (modifier.length() > 0) {
                System.out.print(modifier + " ");
            }
            System.out.print("class" + name);
            if (supercl != null && supercl != Objects.class) {
                System.out.print(" extends " + supercl.getName());
            }
            System.out.println(" {");
            printFields(cl);
            System.out.println();
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println(" }");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //System.exit(0);

    }



    /**
     * Print all methods of a class
     * @param cl a class
     */
    private static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods(); //method类用于描述类的方法
        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name=m.getName();
            System.out.print("  ");
            //print modifiers ,return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + " (");
            //print parameter types
            Class[] parameters = m.getParameterTypes();
            for (int i = 0; i < parameters.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                    System.out.print(parameters[i].getName());
                }
                System.out.println(" )");

            }
        }


    }

    /**
     * Prints all fields of a class
     * @param cl a class
     */
    private static void printFields(Class cl) {

        Field[] fields=cl.getDeclaredFields();  //field类用于描述类的域
        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }

    /**
     * Prints all constructors of a class
     * @param cl a class
     */
    private static void printConstructors(Class cl) {

        Constructor[] constructors = cl.getDeclaredConstructors(); //constructor类用于描述类的构造器
        for (Constructor C : constructors) {
            String name = C.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(C.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + " (");

            //print parameters types
            Class[] parameters = C.getParameterTypes();
            for (int i = 0; i < parameters.length; i++) {
                if (i > 0) {
                    System.out.print(" , ");
                    System.out.print(parameters[i].getName());
                }
                System.out.println(" )");
            }
        }
    }

}
