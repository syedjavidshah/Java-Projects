package Com.first;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends  JFrame implements ActionListener  {
    JRadioButton r1 , r2 , r3 , r4;
    JCheckBox c1 , c2 , c3 , c4 , c5 , c6 , c7 ;
    JButton submit , cancel;
    String formno;
    Signup3( String formno){
        this.formno = formno;

        setLayout(null);



        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("raleway" , Font.BOLD , 22));
        l1.setBounds(280 , 20 , 400 , 40);
        add(l1);

        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("raleway" , Font.BOLD , 16));
        type.setBounds(100 , 75, 200 , 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("raleway " , Font.BOLD , 14));
        r1.setBackground(Color.white);
        r1.setBounds( 100 , 130 , 200 , 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit");
        r2.setFont(new Font("raleway " , Font.BOLD , 14));
        r2.setBackground(Color.white);
        r2.setBounds( 350 , 130 , 200 , 20);
        add(r2);

        r3 = new JRadioButton("Current Account ");
        r3.setFont(new Font("raleway " , Font.BOLD , 14));
        r3.setBackground(Color.white);
        r3.setBounds( 100 , 180 , 200 , 20);
        add(r3);

        r4 = new JRadioButton("Deposit Account");
        r4.setFont(new Font("raleway " , Font.BOLD , 14));
        r4.setBackground(Color.white);
        r4.setBounds( 350 , 180 , 200 , 20);
        add(r4);

        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);


        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("raleway" , Font.BOLD , 16));
        card.setBounds(100 , 240 , 200 , 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("raleway" , Font.BOLD , 14));
        number.setBounds(330 , 240 , 250 , 30);
        add(number);

        JLabel cardDetails = new JLabel("Your 16 Digit Card Number");
        cardDetails.setFont(new Font("raleway" , Font.BOLD , 12));
        cardDetails.setBounds(100 , 270 , 300 , 20);
        add(cardDetails);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("raleway" , Font.BOLD , 16));
        pin.setBounds(100 , 300 , 200 , 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("raleway" , Font.BOLD , 14));
        pnumber.setBounds(330 , 300 , 250 , 30);
        add(pnumber);

        JLabel pinDetails = new JLabel("Your 4 Digit Pin");
        pinDetails.setFont(new Font("raleway" , Font.BOLD , 12));
        pinDetails.setBounds(100 , 330 , 300 , 20);
        add(pinDetails);


        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("raleway" , Font.BOLD , 16));
        services.setBounds(100 , 360 , 200 , 30);
        add(services);


        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("raleway " , Font.BOLD , 14));
        c1.setBackground(Color.white);
        c1.setBounds( 100 , 410 , 200 , 20);
        add(c1);

        c2 = new JCheckBox("CHECKBOOK");
        c2.setFont(new Font("raleway " , Font.BOLD , 14));
        c2.setBackground(Color.white);
        c2.setBounds( 100 , 460 , 200 , 20);
        add(c2);

        c3 = new JCheckBox("Net Banking");
        c3.setFont(new Font("raleway " , Font.BOLD , 14));
        c3.setBackground(Color.white);
        c3.setBounds( 350 , 410 , 200 , 20);
        add(c3);

        c4 = new JCheckBox("EMAIL  Alerts and SMS Alerts");
        c4.setFont(new Font("raleway " , Font.BOLD , 14));
        c4.setBackground(Color.white);
        c4.setBounds( 350 , 460 , 250 , 20);
        add(c4);
//
        c5 = new JCheckBox("Mobile Banking");
        c5.setFont(new Font("raleway " , Font.BOLD , 14));
        c5.setBackground(Color.white);
        c5.setBounds( 100 , 510 , 200 , 20);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("raleway " , Font.BOLD , 14));
        c6.setBackground(Color.white);
        c6.setBounds( 350 , 510 , 200 , 20);
        add(c6);
        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("raleway " , Font.BOLD , 14));
        c7.setBackground(Color.white);
        c7.setBorder(null);
        c7.setBounds( 100 , 580 , 700, 20);
        add(c7);


        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("raleway" , Font.BOLD , 14));
        submit.setBounds(200 , 620 , 85, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("raleway" , Font.BOLD , 14));
        cancel.setBounds(400 , 620 , 85 , 30);
        add(cancel);









       getContentPane().setBackground(Color.white);

        setSize(800, 1000);
        setLocation(350, 10);
        setVisible(true);
        getContentPane().setBackground(Color.white);


    }

    public void actionPerformed(ActionEvent ae){
       if (ae.getSource() == submit){

           String accountType = null;
           if(r1.isSelected()){
              accountType = "Saving Account";
           }
           else if (r2.isSelected()){
               accountType = "Fixed Deposit";
           }
           else if (r3.isSelected()){
               accountType = "Current Account";
           }
           else  if (r4.isSelected()){
               accountType = "Deposit Account";
           }


           Random random = new Random();
           String  cardnumber = " " + Math.abs((random.nextLong() % 90000000)+ 5040936000000000L);

           String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);


           String facility = "";
           if(c1.isSelected()){
               facility =  facility + "ATM CARD";
           }
           else if (c2.isSelected()){
               facility = facility + "CHECKBOOK";
           }
           else  if (c3.isSelected()){
               facility = facility +"Net Banking";
           }
          else  if (c4.isSelected()){
               facility = facility +"EMAIL  Alerts and SMS Alerts";
           }
           else  if (c5.isSelected()){
               facility = facility +"Mobile Banking";
           }
           else  if (c6.isSelected()){
               facility = facility +"E-Statement";
           }
           else  if (c6.isSelected()){
               facility = facility +"E-Statement";
           }

           try{
               if(accountType.equals("")){
                   JOptionPane.showMessageDialog(null , "Account Type is required");
               }
               else{
                   conn conn = new conn();
                   String query1 = "insert into signupp3 values (' " +formno+"', '"+accountType+"' , " +
                           "'"+cardnumber+"' , '"+pinnumber+"' , '"+facility+"')";
                   conn.s.executeUpdate(query1);
                   String query2 = "insert into login values (' " +formno+"', '"+cardnumber+"' , " +
                           "'"+pinnumber+"')";
                   conn.s.executeUpdate(query2);

                   JOptionPane.showMessageDialog(null , "card Number" + cardnumber + "\n pin:" + pinnumber);

               }

           }catch (Exception e){
               System.out.println(e);
           }



       }
       else if (ae.getSource() == cancel){

       }

    }


    public static void main(String[] args)  {
        new Signup3("");
    }


}
