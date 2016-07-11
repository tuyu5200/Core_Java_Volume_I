package EffectiveMethodDemo;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 16:55 .
 */
public class Method {
    /**
     * @方法描述 "变参”方法
     */
    public static double maxNum(double... values) {
        double maxNum=0;
        for (double v:values){

            if (v>maxNum)
                maxNum=v;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println("the first array's maxNum is "+maxNum(1,2,3,4,5,6));
    }
}
