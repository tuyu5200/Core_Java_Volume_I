package innerClass.staticInnerClass;

/**
 * Program is use
 * Version: 2016/7/14
 * Author: Tuyu
 */
public class MaxAndMinOfArray {


    //静态内部类，不需要访问外围类的对象时，应该使用静态内部类
   static class Pair{
       private int minNumber;
       private int maxNumber;

        public Pair(int minNumber, int maxNumber) {
            this.minNumber = minNumber;
            this.maxNumber = maxNumber;
        }

        public int getMinNumber() {
            return minNumber;
        }

        public int getMaxNumber() {
            return maxNumber;
        }
    }

    /**
     * 得到数组里的最大值和最小值
     * @param values 数组
     * @return 一对（pair）数，包含数组的最大值和最小值
     */
    public static Pair MinAndMax(int[] values) {
        //int min=values[0];
        //int max=values[0];

        //注意min--->MAX_value
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int v : values) {
            if (max < v) {
                max = v;
            }
            if (min>v) min = v;
        }
        return new Pair(min, max);
    }
}
