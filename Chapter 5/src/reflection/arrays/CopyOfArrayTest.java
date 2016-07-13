package reflection.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 使用反射编写泛型数组代码
 * Use reflection to copy a array or extends the array's length
 * Version: 2016/7/13
 * Author: Tuyu
 */
public class CopyOfArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] b = (int[]) goodCopyOf(arr, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(b));
        String[] strings = {"tom ", "jack", "tuyu"};
        System.out.println(Arrays.toString(strings));
        String[] c = (String[]) goodCopyOf(strings, 10);
        System.out.println(Arrays.toString(c));


        String[] d = (String[]) badCopyOf(strings, 10);
        System.out.println(Arrays.toString(d));

    }

    /**
     * This method is grow a array by allocating a new array and copying all elements
     * @param obj the array to grow
     * @param newLength the new length
     * @return a large array that contains all elements of obj
     */
    //注意声明为Object类型而不是Object[] 类型   --P207
    private static Object goodCopyOf(Object obj, int newLength) {
        //1.首先获得obj'数组的类对象
        Class cl=obj.getClass();
        //确认它是一个数组
        if (!cl.isArray()) return null;
        //通过Class类返回数组的类型
        Class componentType = cl.getComponentType();

        int length = Array.getLength(obj);
        //通过array的newInstance 构造一个新数组
        Object newArray = Array.newInstance(componentType, newLength);
        //将原数组里的对象复制到新数组里面
        System.arraycopy(obj, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }

    /**
     * This method is attempts to grow an array by allocting a new array and copying all elements of obj
     * @param objects the array to grow
     * @param newLength new length
     * @return a large array that contains all elements of objects. 类型为Objects[] ，和复制前的数组类型不同
     */
    public static Object[] badCopyOf(Object[] objects, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(objects, 0, newArray, 0, newLength);
        return newArray;
    }
}
