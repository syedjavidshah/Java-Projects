package Com.first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {

    JButton deposit , withdraw , mini_statement , pinchange , balance_enquiry , exit  , fast_cash;
    String pinnumber;

    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900 , 900 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0 ,  0 , 900 , 900);
        add(image);

        JLabel text = new JLabel("Please Select your Transaction");
        text.setBounds(210 , 300 , 700 , 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System" , Font.BOLD , 16));
        image.add(text);

        withdraw = new JButton("Cash withdrawl");
        withdraw.addActionListener(this);
        withdraw.setBounds(355 , 415 , 150 , 30);
        image.add(withdraw);

        deposit = new JButton("Deposit");
        deposit.setBounds(170 , 415 , 150 , 30);
        deposit.addActionListener(this);
        image.add(deposit);


        fast_cash = new JButton("Fast Cash");
        fast_cash.setBounds(170 , 450 , 150 , 30);
        fast_cash.addActionListener(this);
        image.add(fast_cash);

        mini_statement = new JButton("Mini Statement");
        mini_statement.setBounds(355 , 450 , 150 , 30);
        mini_statement.addActionListener(this);
        image.add(mini_statement);

        pinchange = new JButton("Change Pin");
        pinchange.setBounds(170 , 485 , 150 , 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balance_enquiry = new JButton("Balance Enquiry");
        balance_enquiry.setBounds(355 , 485 , 150 , 30);
        balance_enquiry.addActionListener(this);
        image.add(balance_enquiry);

        exit = new JButton("Exit");
        exit.setBounds(355 , 520 , 150 , 30);
        exit.addActionListener(this);
        image.add(exit);


        setSize(900 , 900);
        setLocation(300 , 0);
//        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==exit){
            System.exit(0);
        }

    }


    public static void main(String[] args) {
        new Transactions("");

    }
}
