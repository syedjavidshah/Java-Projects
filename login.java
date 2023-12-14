package Com.first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {
    JButton login , signup , clear;
    JTextField cardTextField;
    JPasswordField  pinTextField;

    Login(){


        setTitle("ATM");

        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70 , 10 , 100 , 100);
        add(label);
        JLabel text = new JLabel("Welcome to  Atm");
        text.setFont(new Font("osWard" , Font.BOLD , 36));
        text.setBounds(200 , 40 , 400 , 40);
        add(text);

        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Raleway" , Font.BOLD , 30));
        cardNo.setBounds(120 , 150 , 200 , 30);
        add(cardNo);

        cardTextField = new JTextField();
        cardTextField.setBounds(300 , 150 , 230 , 30);
        cardTextField.setFont(new Font( "Ariel" , Font.BOLD , 14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("osWard" , Font.BOLD , 30));
        pin.setBounds(120 , 220 , 250 , 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300 , 220 , 230 , 30);
        pinTextField.setFont(new Font( "Ariel" , Font.BOLD , 14));
        add(pinTextField);


        login = new JButton("SIGN IN");
        login.setBounds(300 , 300 , 100 , 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear  = new JButton("clear");
        clear.setBounds(430 , 300 , 100 , 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300 , 350 , 230 , 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);



        getContentPane().setBackground(Color.white);
        setSize(800 , 480);
        setVisible(true);
        setLocation(300 , 200);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");


        }else  if (ae.getSource() == login){
            conn conn = new conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber  = ' "+cardnumber+"' and  pin = '" +pinnumber+"'";
            try {
                ResultSet rs =  conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null , "Incorrect Card Number or Pin ");
                }

            }catch (Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource() == signup){
            setVisible(false);
            new Signup1().setVisible(true);
        }


    }


    public static void main(String[] args) {
        new Login();

    }
}


