package LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Program is use 链表操作
 * Version: 2016/7/20
 * Author: Tuyu
 */
public class linkListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("aom");
        a.add("bob");
        a.add("cack");
        System.out.println("a=: "+a);

        List<String> b = new LinkedList<>();
        b.add("bob");
        b.add("doug");
        b.add("min");
        b.add("mary");
        System.out.println("b=: "+b);
        //merge the words from b into a
        ListIterator<String> aIter=a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) {
                aIter.next();
            }
            aIter.add(bIter.next());

        }
        System.out.println("a+b=: "+a);

        //remove every second words from b (移除b中所有偶数项）
        bIter=b.iterator();
        while (bIter.hasNext()) {
            bIter.next(); //skip one element
            if (bIter.hasNext()) {
                bIter.next(); //skip next element
                bIter.remove(); //remove that element
            }
        }

        System.out.println(b);
        //
        a.removeAll(b);
        System.out.println("a-b=: "+a);

    }
}
