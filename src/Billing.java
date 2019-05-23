
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.event.*;

import java.io.*;
public class Billing implements ActionListener
{
  JFrame f4;
  JButton save1,back1;
  JLabel a19,l13,l14,l15,l16;
  JTextField t6,t7,t8,t9;
  Font a20;  

  Billing()
{
 
   f4 =new JFrame();
   Container c=f4.getContentPane();
   a19 = new JLabel("Billings");
   a20 = new Font("Ariel",Font.BOLD,20);
   a19.setFont(a20);
   c.setLayout(null);
  
   a19.setForeground(Color.RED);
   f4.setSize(650,500);
   f4.setVisible(true);
   f4.setResizable(false);
   
   save1=new JButton("Save");
   back1=new JButton("back");
  
   l13  = new JLabel("Payment No");
   l14  = new JLabel("Surgery Payment");
   l15 = new JLabel("Medicine Payment");
   l16 = new JLabel("Other Payments");
 
   t6 = new JTextField();
   t7 = new JTextField();
   t8 = new JTextField();
   t9 = new JTextField();
 
   a19.setBounds(220,20, 400, 100);
   
   t6.setBounds(300, 150, 230, 30);
   t7.setBounds(300, 200, 230, 30);
   t8.setBounds(300, 250, 230, 30);
   t9.setBounds(300, 300, 230, 30);
   
   save1.setBounds(150, 400, 150, 30);
   back1.setBounds(300, 400, 150, 30);
 
   l13.setBounds(100, 150, 250, 30);
   l14.setBounds(100,200, 250, 30);
   l15.setBounds(100, 250, 250, 30);
   l16.setBounds(100, 300, 250, 30);
   
   c.add(a19);
   c.add(t6);
   c.add(t7);
   c.add(t8);
   c.add(t9);
   c.add(l13);
   c.add(l14);
   c.add(l15);
   c.add(l16);   
   c.add(save1);
   c.add(back1);
   
   save1.addActionListener(this);  
   back1.addActionListener(this);


  
}
public void actionPerformed(ActionEvent ae)
{
   String s,s1,s2,s3,s4;
   s=t6.getText();
   s1=t7.getText();
   s2=t8.getText();
   s3=t9.getText();
   s4=s+","+s1+","+s2+","+s3;

   JButton we=(JButton)ae.getSource();

   if(s!=null && s1!=null && s2!=null && s3!=null && we.equals(save1))
   {
   FileWriter fw;
   PrintWriter pw;
   try{
   fw=new FileWriter("Billing.txt",true);
   pw=new PrintWriter(fw);
   pw.println(s4);
   pw.flush();
   pw.close();
   fw.close();
   f4.dispose();
   MainMenu mm=new MainMenu();
   }
   catch(Exception ea)
   {
   JOptionPane.showMessageDialog(null,"Error !","Error",JOptionPane.ERROR_MESSAGE);
   }
   }
   else if(we.equals(back1))
   {
   f4.dispose();
   MainMenu m1=new MainMenu();
   }
   }
}
