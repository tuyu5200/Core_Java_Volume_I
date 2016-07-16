package GenericClassAndMethod;

import static GenericClassAndMethod.MinAndMaxOfArrays.maxAndMin;

/**
 * Program is use 简单泛型类+泛型方法+静态内部类
 * Version: 2016/7/15
 * Author: Tuyu
 */
public class PairTest {
    public static void main(String[] args) {
        String[] words = {"marya", "tom", "a", "tuyu"};
        Integer[] ints = {1, 3, 234, 54, -6, 76};

        // TODO: 2016/7/15 为什么Double[] 数据后有d
        Double[] number = {1d, 2d, 3d, 4d, 5d, -6.26d, 7d};

        //调用静态内部类Pair的方法计算最大值和最小值
        //MinAndMaxOfArray.Pair<String> num = maxminOfString(number);
        //MinAndMaxOfArray.Pair<Integer> integerPair = maxminOfNumber(number);
        //MinAndMaxOfArrays.Pair<String> stringPair = maxminOfString(words);

        //调用静态内部泛型类Pair的泛型方法计算最大值和最小值
        //调用泛型方法时，在方法名前的尖括号放入具体类型，但实际可以省略<String>
        MinAndMaxOfArrays.Pair<String> stringPair = MinAndMaxOfArrays.<String,String>maxAndMin(words);
        MinAndMaxOfArrays.Pair<Integer> integerPair = maxAndMin(ints);
        MinAndMaxOfArrays.Pair<Double> doublePair = maxAndMin(number);
        System.out.println("minStr=" + stringPair.getFirst());
        System.out.println("maxStr=" + stringPair.getSecond());
        System.out.println("minNumber=" + integerPair.getSecond()+"--------- double:  "+doublePair.getFirst());
        System.out.println("maxNumber=" + integerPair.getFirst() + "------- double：  " + doublePair.getSecond());
    }
}
