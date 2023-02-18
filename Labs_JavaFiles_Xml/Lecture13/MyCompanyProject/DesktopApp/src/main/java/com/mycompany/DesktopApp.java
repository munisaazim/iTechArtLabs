package com.mycompany;

import javax.swing.*;
import java.awt.*;

public class DesktopApp extends JFrame {
    String appName;
    public DesktopApp(){
        //super(appName);
        appName = CommonUtility.getAppName();
        setLayout(new FlowLayout());
        add(new JLabel("Welcome to " + appName));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopApp().setVisible(true);
            }
        });
    }
}
