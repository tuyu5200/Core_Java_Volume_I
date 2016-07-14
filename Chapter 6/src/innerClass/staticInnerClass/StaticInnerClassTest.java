package innerClass.staticInnerClass;

import java.util.Arrays;

/**
 * Program is use
 * Version: 2016/7/14
 * Author: Tuyu
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (100*Math.random());
        }
        MaxAndMinOfArray.Pair maxandmin = MaxAndMinOfArray.MinAndMax(array);
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("min= " + maxandmin.getMinNumber());
        System.out.println("max= " + maxandmin.getMaxNumber());
    }
}

