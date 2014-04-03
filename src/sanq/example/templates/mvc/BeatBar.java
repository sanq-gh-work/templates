package sanq.example.templates.mvc;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 03.04.14
 * Time: 11:44
 */
public class BeatBar extends JProgressBar implements Runnable {
    JProgressBar progressBar;
    Thread thread;


    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        for (; ; ) {
            int value = getValue();
            value = (int) (value * .75);
            setValue(value);
            repaint();
            try {

                Thread.sleep(50);

            } catch (Exception e) {

            }
        }
    }
}
