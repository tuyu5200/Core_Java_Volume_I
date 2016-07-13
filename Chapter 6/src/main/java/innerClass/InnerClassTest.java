package innerClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 22:33 .
 */
 public class InnerClassTest {
    public static void main(String[] args) {

    }
    class TalkingClock{

        private Integer interval;
        private boolean beep;

        public TalkingClock(int interval, boolean beep) {
            this.interval = interval;
            this.beep = beep;
        }

        public void start() {
            ActionListener listener=new TimePrinter();
            //Timer t = new Timer(interval, listener);

        }

        private class TimePrinter implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("At the tone , the time is: " + now);
                if (beep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
    }
}
