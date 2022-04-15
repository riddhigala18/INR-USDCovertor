package convertor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class convertor {
	convertor() {
	JFrame f=new JFrame("CURRENCY CONVERTOR");
	
	JLabel l1,l2;
	l1=new JLabel("INR");
	l1.setBounds(10, 40, 60, 30);
	l2=new JLabel("USD");
	l2.setBounds(200, 40, 60, 30);
	
	JTextField t1,t2;
	t1= new JTextField("0");
	t1.setBounds(80, 40, 100, 30);
	t2=new JTextField("0");
	t2.setBounds(240, 40, 100, 30);

	JButton b1,b2,b3;
	b1=new JButton("Ruppees");
	b1.setBounds(50, 100, 100, 15);
	b2= new JButton("Dollars");
	b2.setBounds(175, 100, 100, 15);
	b3=new JButton("Close");
	b3.setBounds(150, 150, 100, 30);
	
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			double d1=Double.parseDouble(t1.getText());
			double d2=(d1/76.3215);
			String s1=String.valueOf(d2);
			t2.setText(s1);
		}
	});
	
	b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			double d3=Double.parseDouble(t2.getText());
			double d4=(d3*76.3215);
			String s2=String.valueOf(d4);
			t1.setText(s2);
		}
	});
	
	 b3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
             f.dispose();
         }
     });

     f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e)
         {
             System.exit(0);
         }
     });
     
     f.add(l1);
     f.add(t1);
     f.add(l2);
     f.add(t2);
     f.add(b1);
     f.add(b2);
     f.add(b3);

     f.setLayout(null);
     f.setSize(400, 300);
     f.setVisible(true);
	}
	 public static void main(String[] args) {
		 new convertor();
	 }
}
