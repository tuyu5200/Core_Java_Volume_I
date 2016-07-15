package Generic;

/**
 * Program is use
 * Version: 2016/7/15
 * Author: Tuyu
 */
public class MinAndMaxOfArrays {

    //静态内部类Pair  基本泛型类 Pair<T>
    static class Pair<T> {
        private T first;
        private T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }
    }

    /**
     * 通用泛型方法，用于计算数组的最大值和最小值
     * 通过 U extends Comparable 对变量类型U设置限定，从而确保U 所属的类有compareTo方法
     * @param array 任意数组
     * @param <U> 数组类型
     * @param <T> 返回类型
     * @return 最大值和最小值（Pair对象）
     */

    public static <U extends Comparable,T> Pair<T> maxAndMin(U[] array) {
        if (array==null||array.length==0) return null;
        U min = array[0];
        U max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min.compareTo(array[i])>0) min = array[i];
            if (max.compareTo(array[i])<0) max = array[i];
        }
        return (Pair<T>) new Pair<>(min, max);
    }
//******************************************一般的方法***************************************
    /**
     * 对字符串的比较
     * @param arr 字符串数组
     * @return 一对比较后值（最长|最短）
     */
    public static Pair<String> maxminOfString(String[] arr){

        if (arr == null || arr.length == 0) {
            return null;
        }
        String min = arr[0];
        String max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.compareTo(arr[i])<0) max = arr[i];
            if (min.compareTo(arr[i])>0) min = arr[i];
        }
        return new Pair<>(min, max);
    }

    /**
     *
     * @param arr
     * @return
     */
    public static Pair<Double> maxminOfNumber(double[] arr) {
        if (arr==null||arr.length==0) return null;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max<arr[i]) max = arr[i];
        }
        return new Pair<Double>(min, max);

    }
//******************************************************************************************



}
