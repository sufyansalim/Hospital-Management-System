import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
public class Doctor implements ActionListener
{

   JFrame f1;
   JButton save,back;
   JLabel a1,l8,l9,l10,l11,l12,l01;
   JTextField t1,t2,t3,t4,t5,t01;
   Font a2;

  Doctor()
{
 
   f1 =new JFrame();
   Container c=f1.getContentPane();
   a1 = new JLabel("Doctors");
   a2 = new Font("Ariel",Font.BOLD,20);
   a1.setFont(a2);
   a1.setForeground(Color.RED);
   c.setLayout(null);

   f1.setSize(650,550);
   f1.setVisible(true);
   f1.setResizable(false);
     
   save=new JButton("Save");
   back=new JButton("back"); 
   
   l8  = new JLabel("Doctor Name");
   l9  = new JLabel("Doctor Age");
   l10 = new JLabel("Mobile/Phone.NO");
   l01 = new JLabel("Qualification");
   l11 = new JLabel("Doctor Gender");
   l12 = new JLabel("Doctor Address");  
    
   t01 = new JTextField();
   t1 = new JTextField();
   t2 = new JTextField();
   t3 = new JTextField();
   t4 = new JTextField();
   t5 = new JTextField();

   a1.setBounds(220,20, 400, 100);
   
   l8.setBounds(100, 100, 250, 30);
   l9.setBounds(100, 150, 250, 30);
   l10.setBounds(100,200, 250, 30);
   l01.setBounds(100, 250, 250, 30);
   l11.setBounds(100, 300, 250, 30);
   l12.setBounds(100, 350, 250, 30);
  
   save.setBounds(150, 400, 150, 30);
   back.setBounds(300, 400, 150, 30);

   t1.setBounds(300, 100, 230, 30);
   t2.setBounds(300, 150, 230, 30);
   t3.setBounds(300, 200, 230, 30);
   t01.setBounds(300, 250, 230, 30);
   t4.setBounds(300, 300, 230, 30);
   t5.setBounds(300, 350, 230, 30);
             
 
   c.add(a1);
   c.add(l8);
   c.add(l9);
   c.add(l10);
   c.add(l01);
   c.add(l11);
   c.add(l12);
   c.add(t1);
   c.add(t2);
   c.add(t3);
   c.add(t4);
   c.add(t5);
   c.add(t01);
   c.add(save);
   c.add(back);
   
   save.addActionListener(this);  
   back.addActionListener(this);

}   

   public void actionPerformed(ActionEvent ae)
{
   String s,s1,s2,s3,s4,s5,s6;
   s=t1.getText();
   s1=t2.getText();
   s2=t3.getText();
   s3=t4.getText();
   s4=t5.getText();
   s5=t01.getText();
   s6=s+","+s1+","+s2+","+s3+","+s4+","+s5;

   JButton we=(JButton)ae.getSource();

   if(s!=null && s1!=null && s2!=null && s3!=null && s4!=null && s5!=null && we.equals(save))
   {
   FileWriter fw;
   PrintWriter pw;
   try{
   fw=new FileWriter("Doctor.txt",true);
   pw=new PrintWriter(fw);
   pw.println(s6);
   pw.flush();
   pw.close();
   fw.close();
   f1.dispose();
   MainMenu mm=new MainMenu();
   }
   catch(Exception ea)
   {
   JOptionPane.showMessageDialog(null,"Error !","Error",JOptionPane.ERROR_MESSAGE);
   }
   }
   else if(we.equals(back))
   {
   f1.dispose();
   MainMenu m1=new MainMenu();
   }
   }
}