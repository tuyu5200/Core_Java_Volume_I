package innerClass.anonymousInnerClass;

import javax.swing.*;

/**
 * Program is use 匿名内部类测试
 * Version: 2016/7/14
 * Author: Tuyu
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock=new TalkingClock();
        clock.start(5000, true);
        JOptionPane.showConfirmDialog(null, "结束程序？");
        System.exit(0);

    }

}

//class TalkingClock {
//
//
//}
