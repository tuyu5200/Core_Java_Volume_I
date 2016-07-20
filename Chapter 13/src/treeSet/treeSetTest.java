package treeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Program 创建了两个Item对象的树集，第一个按照部件编号排序，这是对Item对象的默认排序，第二个通过使用一个定制的比较器按照描述信息来排序
 * Version: 2016/7/20
 * Author: Tuyu
 */
public class treeSetTest {
    public static void main(String[] args) {

        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("a", 1234));
        parts.add(new Item("b", 456));
        parts.add(new Item("c", 999));
        System.out.print("1--原始数据排序= ");
        System.out.println(parts);

        SortedSet<Item> sortByDescription=new TreeSet<>(new Comparator<Item>() //构造一个带比较器的树
        { //匿名内部类
            @Override
            public int compare(Item o1, Item o2) {
                String desA=o1.getDescription();
                String desB=o2.getDescription();
                return desA.compareTo(desB);

            }
        });
        sortByDescription.addAll(parts);
        System.out.print("2--sortByDescription= ");
        System.out.println(sortByDescription);

    }
}
