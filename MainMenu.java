import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.swing.event.*;
 
//Main Menu for Hospital 
public class MainMenu extends WindowAdapter{
  JFrame f;
  JLabel l1;
  JButton d,p,fa,l,e;
  Font fx;
  JPanel pl;

  MainMenu() 
{   
   f =new JFrame("Musi Hospital");
   pl = new JPanel();
   pl.setLayout(null);
   pl.setBackground(Color.WHITE);
   l1 = new JLabel("Musi Group of Hospitals");
   l1.setForeground(Color.RED);
   fx = new Font("Ariel",Font.BOLD,30);
   l1.setFont(fx);

   d=new JButton("Doctor");
   p=new JButton("Patients"); 
   fa=new JButton("Billing");

   l=new JButton("Labs");
   e=new JButton("Exit");
   
   try{
   BufferedImage musi = ImageIO.read(new File("main.jpg"));    
	JLabel pic = new JLabel(new ImageIcon(musi));
	pic.setBounds(-130,200,800,450);
	pl.add(pic);
	
	
	 Image logo = Toolkit.getDefaultToolkit().createImage("logo.gif");     
 	ImageIcon doc = new ImageIcon(logo);
		JLabel checki = new JLabel(doc);
		checki.setBounds(-280,-60,700,450);
		pl.add(checki);

   }
   catch(IOException io)
   {
   }
   f.add(pl);
   f.addWindowListener(this);
   f.setSize(550,550);
   f.setVisible(true);
   f.setResizable(false); 


   d.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
		Doctor d1=new Doctor();
                f.dispose();                  
		}
		});
   p.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e)
		{
		Patient R=new Patient();
                f.dispose();
		}
	        });
   fa.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e)
               {
		Billing Am=new Billing();
		f.dispose();
                }
		});
   l.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e)
		{
		Laboratory lm=new Laboratory();
		f.dispose();
                }
		});       
   e.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e)
	{
	System.exit(0);
	
	}
});
   pl.add(d);
   pl.add(p);
   pl.add(fa);
   pl.add(l); 
   pl.add(e);
   pl.add(l1);

   l1.setBounds(100,30, 400, 100);
   d.setBounds(170,120,200,30);
   p.setBounds(170,160,200,30);
   fa.setBounds(170,200,200,30);
   l.setBounds(170,240,200,30);
   e.setBounds(170,280,200,30);

} 
  public void windowClosing(WindowEvent w)
	{
		int close = JOptionPane.showConfirmDialog(null, "Are You Sure Want To Close?",  "Musi Hospital", JOptionPane.YES_NO_CANCEL_OPTION);

		if(close == JOptionPane.YES_OPTION)
		{
  		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//yes
		}
		 else if (close == JOptionPane.CANCEL_OPTION) 
		{
  			f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//cancel
		} 
		else 
		{
			f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//no
		}
	}
}   
  