package commonSign.pair3;

import commonSign.superTypeBound.Employee;
import commonSign.superTypeBound.Manager;
import commonSign.superTypeBound.Pair;

/**
 * Program is use 通配符类型
 * Version: 2016/7/16
 * Author: Tuyu
 */
public class PairTest3 {
    public static void main(String[] args) {
        Manager ceo = new Manager("tuyu", 5000, 4000);
        Manager cfo = new Manager("toom", 4000, 4023);
        Manager a = new Manager("bob", 3000, 2145);

        Pair<Manager> buddies = new Pair<>(ceo, cfo);
        printBuddies(buddies);

        Manager[] managers = {ceo, cfo,a};
        //得到不同类型的Pair （注意和下面的方法做对比）
        Pair<Employee> minmaxBouns = (Pair<Employee>) minmaxBouns(managers);
        Pair<Manager> managerPair = (Pair<Manager>) minmaxBouns(managers);
        if (PairAlg.hasNulls(managerPair)) {
            System.out.println("there is no managers");
        }else {
            System.out.println("min : " + managerPair.getMin().getName() + " " + managerPair.getMin().getSalary());
            System.out.println("min: " + minmaxBouns.getMin().getSalary() + "  name: " + minmaxBouns.getMin().getName() + "  max: " + minmaxBouns.getMax().getSalary() + " name: " + minmaxBouns.getMax().getName());
        }
        //貌似比上面的方法好一点
        Pair<Employee> result = new Pair<>();
        minmaxBouns(managers, result);
        System.out.println("min: " + result.getMin().getName()+"  "+result.getMin().getSalary() + " max: " + result.getMax().getName()+"  "+result.getMax().getSalary());
        maxminBouns(managers, result);
        System.out.println("min: " + result.getMin().getName()+"  "+result.getMin().getSalary() + " max: " + result.getMax().getName()+"  "+result.getMax().getSalary());

    }

    /**
     * 输出对象的类型
     * @param p 一对继承与Employee的对象
     */
    private static void printBuddies(Pair<? extends Employee> p) {
        Employee min=p.getMin();
        Employee max=p.getMax();
        System.out.println("min's: " +min.getName() + " and max's: " + max.getName() + " are buddies.");

    }

    /**
     *得到经理数组里工资最高者和最低者
     * @param managers 数组
     * @return a pair of manager
     */
    private static Pair<? super Manager> minmaxBouns(Manager[] managers) {
        if (managers == null || managers.length == 0) {
            return null;
        }

        Manager min = managers[0];
        Manager max = managers[0];
        for (int i = 0; i < managers.length; i++) {
            if (min.getBouns() > managers[i].getBouns()) {
                min = managers[i];
            }
            if (max.getBouns() < managers[i].getBouns()) {
                max = managers[i];

            }
        }
        return new Pair<>(min, max);
    }

    /**
     * 方法签名不同
     * @param managers 数组
     * @param result a pair of manager
     */
    private static void minmaxBouns(Manager[] managers, Pair<? super Manager> result) {
        if (managers == null || managers.length == 0) {
            return;
        }
        Manager min = managers[0];
        Manager max = managers[0];
        for (int i = 0; i < managers.length; i++) {
            if (min.getBouns() > managers[i].getBouns()) {
                min = managers[i];
            }
            if (max.getBouns() < managers[i].getBouns()) {
                max = managers[i];

            }
        }
        result.setMin(min);
        result.setMax(max);
    }

    /**
     * 得到工资最高者和最低者
     * @param managers 数组
     * @param result
     */
    public static void maxminBouns(Manager[] managers, Pair<? super Manager> result) {
        minmaxBouns(managers, result);
        PairAlg.swap(result);

    }



    static class PairAlg{
        /**
         *
         * @param pair pair对象 （<?> 通配符捕获）
         * @return  true or false
         */
        public static boolean hasNulls(Pair<?> pair) {
            return pair.getMin()==null||pair.getMax()==null;
        }

        /**
         *通配符不是类型变量，因此在交换数据时可以写一个辅助方法swapHelper
         * @param pair pair对象
         */
        public static void swap(Pair<?> pair) {
            swapHelper(pair);
        }
        /**
         *swap的辅助方法
         * @param pair pair对象
         * @param <T> 固定的 <?> 类型的参数
         */
        public static  <T> void swapHelper(Pair<T> pair) {
            T t=pair.getMin();
            pair.setMin(pair.getMax());
            pair.setMax(t);

        }

    }
}
