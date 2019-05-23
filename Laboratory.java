import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.event.*;

import java.io.*;
public class Laboratory implements ActionListener
{
  JFrame f2;
  JButton save2,cancel2;
  JLabel a7,l17,l18,l19,l20;
  JTextField t10,t11,t12,t13;
  Font a8;
  
  Laboratory()
{
 
   JFrame f2 =new JFrame();
   Container c=f2.getContentPane();
   JLabel a7 = new JLabel("Laboratory");
   Font a8 = new Font("Ariel",Font.BOLD,20);
   a7.setFont(a8);
   c.setLayout(null);
   a7.setForeground(Color.RED);
   c.setBackground(Color.WHITE);
   f2.setSize(650,500);
   f2.setVisible(true);
   f2.setResizable(false);

   save2=new JButton("Save");
   cancel2=new JButton("Cancel"); 

   l17  = new JLabel("Lab Name");
   l18  = new JLabel("Doctor Alloted");
   l19 = new JLabel("Lab Assitant");
   l20 = new JLabel("Equipment Available");
    
   t10 = new JTextField();
   t11 = new JTextField();
   t12 = new JTextField();
   t13 = new JTextField();
   
   a7.setBounds(220,20, 400, 100);
   
   t10.setBounds(300, 150, 230, 30);
   t11.setBounds(300, 200, 230, 30);
   t12.setBounds(300, 250, 230, 30);
   t13.setBounds(300, 300, 230, 30);

   save2.setBounds(150, 400, 150, 30);
   cancel2.setBounds(300, 400, 150, 30);
 
   l17.setBounds(100, 150, 250, 30);
   l18.setBounds(100,200, 250, 30);
   l19.setBounds(100, 250, 250, 30);
   l20.setBounds(100, 300, 250, 30);
   
   c.add(a7);
   c.add(t10);
   c.add(t11);
   c.add(t12);
   c.add(t13);
   c.add(l17);
   c.add(l18);
   c.add(l19);
   c.add(l20);
   c.add(save2);
   c.add(cancel2);  
   
   save2.addActionListener(this);  
   cancel2.addActionListener(this);
  
}
public void actionPerformed(ActionEvent ae)
{
   String s,s1,s2,s3,s4;
   s=t10.getText();
   s1=t11.getText();
   s2=t12.getText();
   s3=t13.getText();
   s4=s+","+s1+","+s2+","+s3;

   JButton we=(JButton)ae.getSource();

   if(s!=null && s1!=null && s2!=null && s3!=null && we.equals(save2))
   {
   FileWriter fw;
   PrintWriter pw;
  
   try {
	fw=new FileWriter("Lab.txt",true);
   pw=new PrintWriter(fw);
   pw.println(s4);
   pw.flush();
   pw.close();
   fw.close();
   f2.dispose();
   MainMenu me=new MainMenu();
   
   }
   
  catch(Exception ea)
  {
   JOptionPane.showMessageDialog(null,"Error !","Error",JOptionPane.ERROR_MESSAGE);
   }
   
   }
   else if(we.equals(cancel2))
   {
	   
   f2.dispose();
   MainMenu mee=new MainMenu();
	   
	    
   }
   }
}
