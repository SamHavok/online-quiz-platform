package com.quiz.onlinequiz.frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame implements ActionListener {

    JTextField emailField;
    JPasswordField passwordField;
    JButton loginButton;

    public LoginUI() {
        setTitle("Login");
        setSize(400, 300);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        System.out.println("Login clicked - Email: " + email + ", Password: " + password);
    }

    public static void main(String[] args) {
        new LoginUI();
    }
}