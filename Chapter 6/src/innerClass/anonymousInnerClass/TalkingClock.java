package innerClass.anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Program is use 匿名内部类
 * Version: 2016/7/14
 * Author: Tuyu
 */

/**
 * 匿名内部类是局部内部类的深入，他们不仅都可以访问它们的外部类，还可以访问局部变量，但是局部变量必须声明为final
 * 假如只创建这个类的一个对象，就不必命名了。因此称匿名内部类
 */
public class TalkingClock {
    public void start(int interval, final boolean beep) {


        ActionListener listener=new ActionListener()
            //匿名内部类实现接口ActionListener-------注意格式 {...};
        //也可以实现对类的扩展
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("at the tone , the time is: " + now);
                if (beep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };

        Timer timer = new Timer(interval, listener);
        timer.start();
    }

}
