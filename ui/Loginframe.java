import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// JDBC IMPORTS

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginPage {

    public static void main(String[] args) {

        // MAIN LOGIN FRAME

        JFrame loginFrame = new JFrame("Complaint Management System");

        loginFrame.setSize(450, 400);

        loginFrame.setLayout(null);

        loginFrame.setLocationRelativeTo(null);

        loginFrame.getContentPane().setBackground(
                new Color(245, 245, 245)
        );

        // TITLE

        JLabel title =
                new JLabel("Complaint Portal");

        title.setFont(
                new Font("Arial", Font.BOLD, 24)
        );

        title.setForeground(
                new Color(131, 58, 180)
        );

        title.setBounds(110, 20, 250, 40);

        // USERNAME

        JLabel userLabel =
                new JLabel("Username");

        userLabel.setBounds(60, 90, 100, 30);

        JTextField userText =
                new JTextField();

        userText.setBounds(170, 90, 180, 35);

        // PASSWORD

        JLabel passLabel =
                new JLabel("Password");

        passLabel.setBounds(60, 150, 100, 30);

        JPasswordField passText =
                new JPasswordField();

        passText.setBounds(170, 150, 180, 35);

        // LOGIN BUTTON

        JButton loginButton =
                new JButton("Login");

        loginButton.setBounds(140, 220, 150, 40);

        loginButton.setBackground(
                new Color(131, 58, 180)
        );

        loginButton.setForeground(Color.WHITE);

        // ADD COMPONENTS

        loginFrame.add(title);

        loginFrame.add(userLabel);

        loginFrame.add(userText);

        loginFrame.add(passLabel);

        loginFrame.add(passText);

        loginFrame.add(loginButton);

        loginFrame.setVisible(true);

        // LOGIN BUTTON ACTION WITH JDBC

        loginButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String username =
                        userText.getText();

                String password =
                        passText.getText();

                try {

                    // LOAD JDBC DRIVER

                    Class.forName(
                            "com.mysql.cj.jdbc.Driver"
                    );

                    // CONNECT TO MYSQL DATABASE

                    Connection con =
                            DriverManager.getConnection(

                            "jdbc:mysql://localhost:3306/managementofcomplaint",

                            "root",

                            "root"
                    );

                    // SQL QUERY

                    String query =

                            "SELECT * FROM customer WHERE username=? AND password=?";

                    PreparedStatement pst =
                            con.prepareStatement(query);

                    pst.setString(1, username);

                    pst.setString(2, password);

                    ResultSet rs =
                            pst.executeQuery();

                    // LOGIN SUCCESS

                    if(rs.next()) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Login Successful"
                        );

                        loginFrame.dispose();

                        // MENU FRAME

                        JFrame menuFrame =
                                new JFrame("Main Menu");

                        menuFrame.setSize(450, 400);

                        menuFrame.setLayout(null);

                        menuFrame.setLocationRelativeTo(null);

                        JLabel menuTitle =
                                new JLabel("Welcome User");

                        menuTitle.setFont(
                                new Font("Arial",
                                        Font.BOLD,
                                        24)
                        );

                        menuTitle.setBounds(
                                120, 20, 250, 40
                        );

                        // BUTTONS

                        JButton registerComplaint =
                                new JButton(
                                        "Register Complaint"
                                );

                        registerComplaint.setBounds(
                                90, 90, 250, 45
                        );

                        JButton checkStatus =
                                new JButton(
                                        "Check Complaint Status"
                                );

                        checkStatus.setBounds(
                                90, 160, 250, 45
                        );

                        JButton exitButton =
                                new JButton("Exit");

                        exitButton.setBounds(
                                90, 230, 250, 45
                        );

                        // ADD BUTTONS

                        menuFrame.add(menuTitle);

                        menuFrame.add(registerComplaint);

                        menuFrame.add(checkStatus);

                        menuFrame.add(exitButton);

                        menuFrame.setVisible(true);

                    }

                    // LOGIN FAILED

                    else {

                        JOptionPane.showMessageDialog(
                                null,
                                "Invalid Username or Password"
                        );
                    }

                    con.close();
                }

                catch(Exception ex) {

                    JOptionPane.showMessageDialog(
                            null,
                            ex
                    );
                }
            }
        });
    }
}import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// JDBC IMPORTS

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginPage {

    public static void main(String[] args) {

        // MAIN LOGIN FRAME

        JFrame loginFrame = new JFrame("Complaint Management System");

        loginFrame.setSize(450, 400);

        loginFrame.setLayout(null);

        loginFrame.setLocationRelativeTo(null);

        loginFrame.getContentPane().setBackground(
                new Color(245, 245, 245)
        );

        // TITLE

        JLabel title =
                new JLabel("Complaint Portal");

        title.setFont(
                new Font("Arial", Font.BOLD, 24)
        );

        title.setForeground(
                new Color(131, 58, 180)
        );

        title.setBounds(110, 20, 250, 40);

        // USERNAME

        JLabel userLabel =
                new JLabel("Username");

        userLabel.setBounds(60, 90, 100, 30);

        JTextField userText =
                new JTextField();

        userText.setBounds(170, 90, 180, 35);

        // PASSWORD

        JLabel passLabel =
                new JLabel("Password");

        passLabel.setBounds(60, 150, 100, 30);

        JPasswordField passText =
                new JPasswordField();

        passText.setBounds(170, 150, 180, 35);

        // LOGIN BUTTON

        JButton loginButton =
                new JButton("Login");

        loginButton.setBounds(140, 220, 150, 40);

        loginButton.setBackground(
                new Color(131, 58, 180)
        );

        loginButton.setForeground(Color.WHITE);

        // ADD COMPONENTS

        loginFrame.add(title);

        loginFrame.add(userLabel);

        loginFrame.add(userText);

        loginFrame.add(passLabel);

        loginFrame.add(passText);

        loginFrame.add(loginButton);

        loginFrame.setVisible(true);

        // LOGIN BUTTON ACTION WITH JDBC

        loginButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String username =
                        userText.getText();

                String password =
                        passText.getText();

                try {

                    // LOAD JDBC DRIVER

                    Class.forName(
                            "com.mysql.cj.jdbc.Driver"
                    );

                    // CONNECT TO MYSQL DATABASE

                    Connection con =
                            DriverManager.getConnection(

                            "jdbc:mysql://localhost:3306/managementofcomplaint",

                            "root",

                            "root"
                    );

                    // SQL QUERY

                    String query =

                            "SELECT * FROM customer WHERE username=? AND password=?";

                    PreparedStatement pst =
                            con.prepareStatement(query);

                    pst.setString(1, username);

                    pst.setString(2, password);

                    ResultSet rs =
                            pst.executeQuery();

                    // LOGIN SUCCESS

                    if(rs.next()) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Login Successful"
                        );

                        loginFrame.dispose();

                        // MENU FRAME

                        JFrame menuFrame =
                                new JFrame("Main Menu");

                        menuFrame.setSize(450, 400);

                        menuFrame.setLayout(null);

                        menuFrame.setLocationRelativeTo(null);

                        JLabel menuTitle =
                                new JLabel("Welcome User");

                        menuTitle.setFont(
                                new Font("Arial",
                                        Font.BOLD,
                                        24)
                        );

                        menuTitle.setBounds(
                                120, 20, 250, 40
                        );

                        // BUTTONS

                        JButton registerComplaint =
                                new JButton(
                                        "Register Complaint"
                                );

                        registerComplaint.setBounds(
                                90, 90, 250, 45
                        );

                        JButton checkStatus =
                                new JButton(
                                        "Check Complaint Status"
                                );

                        checkStatus.setBounds(
                                90, 160, 250, 45
                        );

                        JButton exitButton =
                                new JButton("Exit");

                        exitButton.setBounds(
                                90, 230, 250, 45
                        );

                        // ADD BUTTONS

                        menuFrame.add(menuTitle);

                        menuFrame.add(registerComplaint);

                        menuFrame.add(checkStatus);

                        menuFrame.add(exitButton);

                        menuFrame.setVisible(true);

                    }

                    // LOGIN FAILED

                    else {

                        JOptionPane.showMessageDialog(
                                null,
                                "Invalid Username or Password"
                        );
                    }

                    con.close();
                }

                catch(Exception ex) {

                    JOptionPane.showMessageDialog(
                            null,
                            ex
                    );
                }
            }
        });
    }
}                    
