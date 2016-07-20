package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Program is use
 * Version: 2016/7/20
 * Author: Tuyu
 */
public class hashSetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>(); //HashSet implement Set
        long totalTime=0;

        Scanner in = new Scanner(System.in);
        System.out.println("enter exit 结束输入");
        while (true) {
            String word=in.next();

            if (word.equals("exit")) {
                System.out.println("quit!");
                break;
            }
            long callTime=System.currentTimeMillis();
            words.add(word);
            callTime=System.currentTimeMillis()-callTime;
            totalTime+=callTime;
        }

        Iterator<String> iterator=words.iterator();
        System.out.println("words= ");
        for (int i = 0; i < 20 && iterator.hasNext(); i++) {
            System.out.print(iterator.next());
            System.out.print("  ");

        }
        System.out.println("...");

        System.out.println(words.size()+" distinct words "+totalTime+" milliseconds.");
    }
}
