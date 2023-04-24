
package javaapplication1;

import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton b1,b2;
    String formno;
    SignupThree(String formno){
        this.formno=formno;
         setLayout(null);
         
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
         
         JLabel l1=new JLabel("PAGE 3: Account Detail");
         l1.setFont(new Font("Raleway",Font.BOLD,22));
         l1.setBounds(280, 40, 400, 40);
         l1.setBackground(Color.WHITE);
         add(l1);
         
         JLabel type=new JLabel("Account Type");
         type.setFont(new Font("Raleway",Font.BOLD,22));
         type.setBackground(Color.WHITE);
         type.setBounds(100, 100, 200, 30);
         add(type);
         
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 150, 150, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 150, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 180, 150, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 180, 250, 20);
        add(r4);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);
        
         JLabel card=new JLabel("Card Number");
         card.setFont(new Font("Raleway",Font.BOLD,22));
         card.setBackground(Color.WHITE);
         card.setBounds(100, 250, 200, 30);
         add(card);
         
         JLabel number=new JLabel("XXXX-XXXX-XXXX-4134");
         number.setFont(new Font("Raleway",Font.BOLD,22));
         number.setBackground(Color.WHITE);
         number.setBounds(330, 250, 300, 30);
         add(number);
         
         JLabel cardetail=new JLabel("Your 16-Digit Card Number");
         cardetail.setFont(new Font("Raleway",Font.BOLD,12));
         cardetail.setBackground(Color.WHITE);
         cardetail.setBounds(100, 280, 300, 20);
         add(cardetail);
         
         JLabel pin=new JLabel("PIN:");
         pin.setFont(new Font("Raleway",Font.BOLD,22));
         pin.setBackground(Color.WHITE);
         pin.setBounds(100, 300, 200, 30);
         add(pin);
         
         JLabel pnumber=new JLabel("XXXX");
         pnumber.setFont(new Font("Raleway",Font.BOLD,22));
         pnumber.setBackground(Color.WHITE);
         pnumber.setBounds(330, 300, 200, 30);
         add(pnumber);
         
         JLabel pindetail=new JLabel("Your 4-Digit Pin Number");
         pindetail.setFont(new Font("Raleway",Font.BOLD,12));
         pindetail.setBackground(Color.WHITE);
         pindetail.setBounds(100, 330, 300, 20);
         add(pindetail);
         
         JLabel services=new JLabel("Services Required:");
         services.setFont(new Font("Raleway",Font.BOLD,22));
         services.setBackground(Color.WHITE);
         services.setBounds(100, 400, 400, 30);
         add(services);
         
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 450, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 450, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 480, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 480, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 510, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 510, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 550, 600, 30);
        add(c7);
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250, 600, 100, 30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(420, 600, 100, 30);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.WHITE);
         
         setSize(850,820);
         setLocation(350,0);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String atype = null;
        if(r1.isSelected()){ 
            atype = "Saving Account";
        }
        else if(r2.isSelected()){ 
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            atype = "Current Account";
        }else if(r4.isSelected()){ 
            atype = "Recurring Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardnumber = "" + Math.abs(first7);
         long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pinnumber = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{    
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into accountdetails values('"+formno+"','"+atype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin:"+ pinnumber);
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
                
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        }else if(ae.getSource()==b2){
             setVisible(false);
             new Login().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new SignupThree("");
    }
}
