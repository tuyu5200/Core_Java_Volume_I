package innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Program is use of inner classes
 * Version: 2016/7/14
 * Author: Tuyu
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(5000, true);
        clock.start();
        //让用户选择是否结束程序
        JOptionPane.showConfirmDialog(null, "Quit program?");
        System.exit(0);

    }
}

/**
 * 通过给定的时间打印并铃响
 */
class TalkingClock {
        private int interval;
        private boolean beep;

    /**
     * construct a talking clock
      * @param interval 铃响间隔
     * @param beep 是否铃响
     */
        public TalkingClock(int interval, boolean beep) {
            this.interval = interval;
            this.beep = beep;
        }

    /**
     * start the clock
     */
        public void start() {

            /**
             * 局部内部类
             * 局部类不能用private或public进行声明
             * 对外部世界完全隐藏起来，只能start进行访问
             * 打印时间并铃响
             */
            class TimePrinter implements ActionListener {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Date now = new Date();
                    System.out.println("At the tone , the time is: " + now);
                    //可以直接范围外围类的私有数据
                    if (beep) {
                        Toolkit.getDefaultToolkit().beep();
                    }
                }
            }
            ActionListener listener=new TimePrinter();
            Timer timer = new Timer(interval, listener);
            timer.start();
        }
    /**
     * 内部类 TimePrinter------outer 为TalkingClock
     * 打印时间并铃响
     */
   /* public class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("At the tone , the time is: " + now);
            //可以直接访问外围类的私有数据
            //if(beep)
            if (TalkingClock.this.beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
*/
}
