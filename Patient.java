import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.event.*;

import java.io.*;
public class Patient implements ActionListener
{
  JFrame f3;
  JButton save3,back3;
  JLabel a13,l21,l22,l23,l24,l25,l26;
  JTextField t14,t15,t16,t17,t18,t19;
  Font a14;

  Patient()
{
 
   f3 =new JFrame();
   Container c=f3.getContentPane();
   a13 = new JLabel("Patient");
   a14 = new Font("Ariel",Font.BOLD,20);
   a13.setFont(a14);
   c.setLayout(null);
   a13.setForeground(Color.RED);
  
   f3.setSize(550,550);
   f3.setVisible(true);
   f3.setResizable(false);

   save3=new JButton("Save");
   back3=new JButton("back");  
   
   l21  = new JLabel("Patient Name");
   l22  = new JLabel("Patient Age");
   l23 = new JLabel("Mobile/Phone.NO");
   l24 = new JLabel("Patients Disease");
   l25 = new JLabel("Doctor Gender");
   l26 = new JLabel("Doctor Address");
   
   t14 = new JTextField();
   t15 = new JTextField();
   t16 = new JTextField();
   t17 = new JTextField();
   t18 = new JTextField();
   t19 = new JTextField();
 
   a13.setBounds(220,20, 400, 100);
   
   l21.setBounds(100, 100, 250, 30);
   l22.setBounds(100, 150, 250, 30);
   l23.setBounds(100,200, 250, 30);
   l24.setBounds(100, 250, 250, 30);
   l25.setBounds(100, 300, 250, 30);
   l26.setBounds(100, 350, 250, 30);

   save3.setBounds(150, 400, 150, 30);
   back3.setBounds(300, 400, 150, 30);
   
   t14.setBounds(300, 100, 230, 30);
   t15.setBounds(300, 150, 230, 30);
   t16.setBounds(300, 200, 230, 30);
   t17.setBounds(300, 250, 230, 30);
   t18.setBounds(300, 300, 230, 30);
   t19.setBounds(300, 350, 230, 30);
             
   c.add(a13);
   c.add(l21);
   c.add(l22);
   c.add(l23);
   c.add(l24);
   c.add(l25);
   c.add(l26);
   c.add(t14);
   c.add(t15);
   c.add(t16);
   c.add(t17);
   c.add(t18);
   c.add(t19);
   c.add(save3);
   c.add(back3);
  
   save3.addActionListener(this);  
   back3.addActionListener(this);
    
}
  public void actionPerformed(ActionEvent ae)
{
   String s,s1,s2,s3,s4,s5,s6;
   s=t14.getText();
   s1=t15.getText();
   s2=t16.getText();
   s3=t17.getText();
   s4=t18.getText();
   s5=t19.getText();
   s6=s+","+s1+","+s2+","+s3+","+s4+","+s5;

   JButton we=(JButton)ae.getSource();

   if(s!=null && s1!=null && s2!=null && s3!=null && s4!=null && s5!=null && we.equals(save3))
   {
   FileWriter fw;
   PrintWriter pw;
   try{
   fw=new FileWriter("Patient.txt",true);
   pw=new PrintWriter(fw);
   pw.println(s6);
   pw.flush();
   pw.close();
   fw.close();
   f3.dispose();
   MainMenu mm=new MainMenu();
   }
   catch(Exception ea)
   {
   JOptionPane.showMessageDialog(null,"Error !","Error",JOptionPane.ERROR_MESSAGE);
   }
   }
   else if(we.equals(back3))
   {
   f3.dispose();
   MainMenu m1=new MainMenu();
   }
   }
}