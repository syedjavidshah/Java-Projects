package Com.first;


import javax.swing.*;

import java.awt.*;
import java.sql.SQLException;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signup1 extends JFrame implements  ActionListener {

    long random;
    JTextField nametextfield, fnametextfield, emailTextfield , addressTextfield, citytextfield, stateTextfield, pinTextfield;
    JButton next;
    JRadioButton male, female, other, single, married ,  transgender ;
    JDateChooser dateChooser;

    Signup1() {


        setLayout(null);
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L + 1000L);
        //Long random = Math.abs((random.nextLong() % 9000L) + 1000L);
        JLabel formno = new JLabel("APPLICATION FORM NO:" + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 30));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page no 1 : Personal details ");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);


        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(120, 140, 200, 30);
        add(name);

        nametextfield = new JTextField();
        nametextfield.setFont(new Font("raleway", Font.BOLD, 14));
        nametextfield.setBounds(300, 140, 300, 30);
        add(nametextfield);

        JLabel fname = new JLabel("father's name:");
        fname.setFont(new Font("raleway", Font.BOLD, 18));
        fname.setBounds(120, 190, 200, 30);
        add(fname);

        fnametextfield = new JTextField();
        fnametextfield.setFont(new Font("raleway", Font.BOLD, 14));
        fnametextfield.setBounds(300, 190, 300, 30);
        add(fnametextfield);

        JLabel date_of_birth = new JLabel("Date of Birth");
        date_of_birth.setFont(new Font("raleway", Font.BOLD, 18));
        date_of_birth.setBounds(120, 240, 300, 30);
        add(date_of_birth);


        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 300, 30);
        dateChooser.setForeground(Color.red);

        add(dateChooser);


        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("raleway", Font.BOLD, 18));
        gender.setBounds(120, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);


        female = new JRadioButton("Female");
        female.setBounds(420, 290, 70, 30);
        female.setBackground(Color.white);
        add(female);

        other = new JRadioButton("Other");
        other.setBounds(550, 290, 70, 30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);

        JLabel email = new JLabel("Email ID:");
        email.setFont(new Font("raleway", Font.BOLD, 18));
        email.setBounds(120, 340, 200, 30);
        add(email);

        emailTextfield  = new JTextField();
        emailTextfield .setFont(new Font("raleway", Font.BOLD, 14));
        emailTextfield .setBounds(300, 340, 300, 30);
        add(emailTextfield );

        JLabel marital_Status = new JLabel("Marital Status");
        marital_Status.setFont(new Font("raleway", Font.BOLD, 18));
        marital_Status.setBounds(120, 390, 200, 30);
        add(marital_Status);

        single = new JRadioButton("Single");
        single.setBounds(300, 390, 70, 30);
        single.setBackground(Color.white);
        add(single);

        married = new JRadioButton("Married");
        married.setBounds(420, 390, 70, 30);
        married.setBackground(Color.white);
        add(married);


        ButtonGroup status = new ButtonGroup();
        status.add(single);
        status.add(married);


        JLabel address = new JLabel("Address:");
        address.setBounds(120, 440, 200, 30);
        address.setFont(new Font("raleway", Font.BOLD, 18));
        add(address);

        addressTextfield = new JTextField();
        addressTextfield.setFont(new Font("raleway", Font.BOLD, 14));
        addressTextfield.setBounds(300, 440, 300, 30);
        add(addressTextfield);

        JLabel city = new JLabel("City:");
        city.setBounds(120, 490, 200, 30);
        city.setFont(new Font("raleway", Font.BOLD, 18));
        add(city);

        citytextfield = new JTextField();
        citytextfield.setBounds(300, 540, 300, 30);
        citytextfield.setFont(new Font("raleway", Font.BOLD, 14));
        add(citytextfield);

        JLabel state = new JLabel("State:");
        state.setBounds(120, 490, 200, 30);
        city.setBounds(120, 540, 200, 30);
        state.setFont(new Font("raleway", Font.BOLD, 18));
        add(state);

        stateTextfield = new JTextField();
        stateTextfield.setBounds(300, 490, 300, 30);
        stateTextfield.setFont(new Font("raleway", Font.BOLD, 14));
        add(stateTextfield);

        JLabel pincode = new JLabel("Pin Code: ");
        state.setBounds(120, 490, 200, 30);
        pincode.setBounds(120, 590, 200, 30);
        pincode.setFont(new Font("raleway", Font.BOLD, 18));
        add(pincode);

        pinTextfield = new JTextField();
        pinTextfield.setBounds(300, 590, 300, 30);
        pinTextfield.setFont(new Font("raleway", Font.BOLD, 14));
        add(pinTextfield);


        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("raleway", Font.BOLD, 14));
        next.setBounds(620, 658, 80, 30);
        next.addActionListener(this);
        add(next);


        setSize(800, 850);
        setLocation(350, 10);
        setVisible(true);
        getContentPane().setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nametextfield.getText();
        String fname =fnametextfield.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String  gender = null;
        if(male.isSelected()){
            gender = "male";
        }
        else if (other.isSelected()){
            gender = "other";
        }
        else if (female.isSelected()){
            gender = "female";
        }

        String  email = emailTextfield.getText();
        String marital_Status = null;

        if(single.isSelected()){
            marital_Status = "Single";

        }
        else if (married.isSelected()){
            marital_Status = "married";
        }

        String address = addressTextfield.getText();
        String city = citytextfield.getText();
        String  state = stateTextfield.getText();
        String pin = pinTextfield.getText();


        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null , "Name is required");
            }
            else {
                conn c = new conn();
                String query = "insert into signupp values (' " +formno+"', '"+name+"' , " +
                        "'"+dob+"' , '"+gender+"' , '"+email+"' , '"+marital_Status+"' , " +
                        "'"+address+"' , '"+city+"' , '"+state+"' , '"+pin+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new Signup2(formno).setVisible(true);
            }

        }catch (Exception e){

            System.out.println(e);
        }


    }



    public static void main(String[] args) {
        new Signup1();



    }
}




