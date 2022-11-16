package com.migDemo;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Created by GIOhnny on 27/12/2016.
 */
public class MigLayoutDemo extends JFrame {

    private JLabel lblUsername, lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public MigLayoutDemo(){
        setTitle("Mig Layout DEMO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,250);
        setLocationRelativeTo(this);
        getContentPane().add(initComponents());
        pack();
    }

    private JPanel initComponents(){
        JPanel panel = new JPanel(new MigLayout());
        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");
        txtUsername = new JTextField(15);
        txtPassword = new JPasswordField(15);
        btnLogin = new JButton("Login");

        panel.add(lblUsername,"cell 0 0");
        panel.add(txtUsername,"cell 1 0");
        panel.add(lblPassword,"cell 0 1");
        panel.add(txtPassword,"cell 1 1");
        panel.add(btnLogin,"cell 1 2, right");

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MigLayoutDemo().setVisible(true);
            }
        });
    }
}
