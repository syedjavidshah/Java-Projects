package Com.first;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Signup2 extends JFrame implements  ActionListener {

    long random;
    JTextField nametextfield, panTextfield, aadharTextfield, genderTextfield, fnametextfield, emailTextfield, addressTextfield, citytextfield, stateTextfield, pinTextfield;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, occupation, income, qualification;
    String formno;

    Signup2(String formno) {
        this.formno = formno;


        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 02");
        JLabel additionalDetails = new JLabel("Page no 2 : additional  details ");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        additionalDetails.setBounds(270, 80, 400, 30);
        add(additionalDetails);


        JLabel religions = new JLabel("Religion:");
        religions.setFont(new Font("Raleway", Font.BOLD, 18));
        religions.setBounds(120, 140, 200, 30);
        add(religions);

        String valReligion[] = {"Muslim", "Sikhs", "Christian", "Hindu", "Atheist"};
        religion = new JComboBox(valReligion);
        religion.setBounds(270, 140, 300, 30);
        religion.setBackground(Color.white);
        add(religion);

        JLabel categories = new JLabel("Category:");
        categories.setFont(new Font("Raleway", Font.BOLD, 18));
        categories.setBounds(120, 190, 200, 30);
        add(categories);

        String valCategory[] = {"General", "OBC", "ST", "SC", "RBA"};
        category = new JComboBox(valCategory);
        category.setBounds(270, 190, 300, 30);
        category.setBackground(Color.white);
        add(category);

        JLabel qualifications = new JLabel("Qualification:");
        qualifications.setFont(new Font("Raleway", Font.BOLD, 18));
        qualifications.setBounds(120, 240, 200, 30);
        add(qualifications);

        String valQualification[] = {"10th", "12th", "UG", "PG"};
        qualification = new JComboBox(valQualification);
        qualification.setBounds(270, 240, 300, 30);
        qualification.setBackground(Color.white);
        add(qualification);

        JLabel incomes = new JLabel("Income:");
        incomes.setFont(new Font("Raleway", Font.BOLD, 18));
        incomes.setBounds(120, 290, 200, 30);
        add(incomes);

        String valincomes[] = {"0-40000", "40000-70000", "70000-100000", "Above 100000"};
        income = new JComboBox(valincomes);
        income.setBounds(270, 290, 300, 30);
        income.setBackground(Color.white);
        add(income);

        JLabel occupations = new JLabel("Occupation:");
        occupations.setFont(new Font("Raleway", Font.BOLD, 18));
        occupations.setBounds(120, 340, 200, 30);
        add(occupations);

        String valoccupation[] = {"Employed", "Unemployed", "Daily Wages", "Farmer", "Labour", "Student"};
        occupation = new JComboBox(valoccupation);
        occupation.setBounds(270, 340, 300, 30);
        occupation.setBackground(Color.white);
        add(occupation);


        JLabel pan = new JLabel("PAN Number: ");
        pan.setBounds(120, 390, 200, 30);
        pan.setFont(new Font("raleway", Font.BOLD, 18));
        add(pan);

        panTextfield = new JTextField();
        panTextfield.setBounds(270, 390, 300, 30);
        panTextfield.setFont(new Font("raleway", Font.BOLD, 14));
        add(panTextfield);


        JLabel aadhar = new JLabel("Aadhar Number: ");
        aadhar.setBounds(120, 440, 200, 30);
        aadhar.setFont(new Font("raleway", Font.BOLD, 18));
        add(aadhar);

        aadharTextfield = new JTextField();
        aadharTextfield.setBounds(270, 440, 300, 30);
        aadharTextfield.setFont(new Font("raleway", Font.BOLD, 14));
        add(aadharTextfield);


        JLabel Senior_Citizen = new JLabel("Senior Citizen:");
        Senior_Citizen.setFont(new Font("raleway", Font.BOLD, 18));
        Senior_Citizen.setBounds(120, 490, 200, 30);
        add(Senior_Citizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 490, 70, 30);
        syes.setBackground(Color.white);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(440, 490, 70, 30);
        sno.setBackground(Color.white);
        add(sno);

        ButtonGroup status = new ButtonGroup();
        status.add(syes);
        status.add(sno);

        JLabel existing_account = new JLabel("Existing Account:");
        existing_account.setFont(new Font("raleway", Font.BOLD, 18));
        existing_account.setBounds(120, 540, 200, 30);
        add(existing_account);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 540, 70, 30);
        eyes.setBackground(Color.white);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(440, 540, 70, 30);
        eno.setBackground(Color.white);
        add(eno);

        ButtonGroup condition = new ButtonGroup();
        condition.add(eyes);
        condition.add(eno);


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

    public void actionPerformed(ActionEvent ae) {
        // String formno = "" + random;
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String squalification = (String) qualification.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();


        String senoircitizen = null;
        if (syes.isSelected()) {
            senoircitizen = "yes";
        } else if (sno.isSelected()) {
            senoircitizen = "no";
        }

        String existingaccont = null;

        if (eyes.isSelected()) {
            existingaccont = "yes";

        } else if (eno.isSelected()) {
            existingaccont = "no";
        }

        String span = panTextfield.getText();
        String sadhar = aadharTextfield.getText();

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

        try {
            conn c = new conn();
            String query = "insert into signupp2 values (' " +formno+"', '"+sreligion+"' , " +
                    "'"+scategory+"' , '"+squalification+"' , '"+sincome+"' , '"+soccupation+"' , " +
                    "'"+span+"' , '"+sadhar+"' , '"+existingaccont+"' , '"+senoircitizen+"')";
            c.s.executeUpdate(query);


            // signupp3 object

            setVisible(false);
            new Signup3(formno).setVisible(true);
        }catch (Exception e){
            System.out.println(e);
        }


    }



    public static void main(String[] args) {
        new Signup2("");



    }
}







