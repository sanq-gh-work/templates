package sanq.example.templates.observer.swing;

import com.sun.javafx.scene.layout.region.Border;

import javax.swing.*;
import javax.xml.ws.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 11.03.14
 * Time: 17:24
 */
public class SwingObserverExample {
    JFrame jframe;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    private void go() {
        jframe = new JFrame();
        JButton cmd = new JButton("Should i do it?");
        cmd.addActionListener(new AngelListener());
        cmd.addActionListener(new DevilListener());
        jframe.getContentPane().add(BorderLayout.CENTER, cmd);
        jframe.setBounds(0,0,400,400);
        jframe.setVisible(true);
    }


    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }


}
