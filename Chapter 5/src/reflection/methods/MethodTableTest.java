package reflection.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Program is show how to invoke methods through reflection
 * Version: 2016/7/13
 * Author: Tuyu
 */
public class MethodTableTest {
    public static void main(String[] args) throws Exception {
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        //print table of x- and y-values
        printTable(1, 10, sqrt);
        printTable(1, 10, square);
    }

    /**
     * 计算x的平方
     * @param x a number
     * @return x square
     */
    public static double square(double x) {
        return x * x;
    }

    /**
     * 调用一个方法计算x并以表格的形式打印出来
     * @param from x的最小值
     * @param to x的最大值
     * @param method 调用的方法
     */
    public static void printTable(double from, double to,  Method method) {
        //print the method name
        System.out.println(method);
        int row= (int) (to-from);
        double dx = (to - from) / row;
        for (double x=from;x<=to;x+=dx) {
            try {
                double y = (double) method.invoke(null, x);
                System.out.printf("%10.4f|%10.4f%n", x, y);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
