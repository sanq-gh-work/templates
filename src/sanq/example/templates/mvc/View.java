package sanq.example.templates.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 03.04.14
 * Time: 11:31
 */

public class View implements ActionListener, IBeatObserver, IBPMObserver {
    IBeatModel model;
    IController controller;
    JFrame viewFrame;
    JPanel viewPanel;
    BeatBar beatBar;
    JLabel bpmOutputLabel;
    JPanel controlPanel;
    JFrame controlFrame;
    JLabel bpmLabel;
    JTextField bpmTextField;
    JButton setBpmButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

    public View(IBeatModel model, IController controller) {
        this.model = model;
        this.controller = controller;
        model.registerObserver((IBeatObserver) this);
        model.registerObserver((IBPMObserver) this);
    }

    public void createView() {
        viewPanel = new JPanel(new GridLayout(1, 2));
        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(100, 80));
        bpmOutputLabel = new JLabel("offLine", SwingConstants.CENTER);
        beatBar = new BeatBar();
        beatBar.setValue(0);
        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputLabel);
        viewPanel.add(bpmPanel);
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);
    }

    public void createControls() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100, 80));
        controlPanel = new JPanel(new GridLayout(1, 2));
        menuBar = new JMenuBar();
        menu = new JMenu("DJ Control");

        startMenuItem = new JMenuItem("Start");
        startMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.start();
            }
        });

        stopMenuItem = new JMenuItem("Stop");
        stopMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.stop();
            }
        });

        JMenuItem exitMeuItem = new JMenuItem("Quit");
        exitMeuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menu.add(startMenuItem);
        menu.add(stopMenuItem);
        menu.add(exitMeuItem);
        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);

        setBpmButton = new JButton("Set");
        setBpmButton.setSize(new Dimension(10, 40));
        increaseBPMButton = new JButton(">>");
        decreaseBPMButton = new JButton("<<");


        setBpmButton.addActionListener(this);
        decreaseBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        buttonPanel.add(decreaseBPMButton);
        buttonPanel.add(increaseBPMButton);

        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);

        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBpmButton);
        insideControlPanel.add(buttonPanel);
        controlPanel.add(insideControlPanel);

        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        controlFrame.getRootPane().setDefaultButton(setBpmButton);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

        controlFrame.pack();
        controlFrame.setVisible(true);
    }


    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== setBpmButton){
            int bpm =  Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        } else if (e.getSource() ==  increaseBPMButton){
            controller.increaseBPM();
        } else if (e.getSource() ==  decreaseBPMButton){
            controller.decreaseBPM();
        }
    }

    @Override
    public void updateBPM() {
         int bpm = model.getBPM();
        if (bpm == 0) {
                bpmOutputLabel.setText("off Line");
        }else {
            bpmOutputLabel.setText("Current BPM:" + model.getBPM());
        }
    }

    @Override
    public void updateBeat() {
        beatBar.setValue(100);
    }
}
