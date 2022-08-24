package pertTambahan;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingContainer;
import javax.swing.border.EmptyBorder;

public class LoginPane extends JFrame{

	public LoginPane() {
		// TODO Auto-generated constructor stub
//		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		
		
//		FlowLayout
		
//		JPanel center = new JPanel(new BoxLayout(this, BoxLayout.Y_AXIS));
//		JButton b1 = new JButton("Button 1");
//		b1.setPreferredSize(new Dimension(200,50));
//		
//		center.add(b1);
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		JButton b2 = new JButton("Button 2"), b1 = new JButton("Button 1");
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b2.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		p1.setBorder(new EmptyBorder(20,0,0,0));
		p1.add(b1);
		p1.add(b2);
		
		p1.setBounds(60,0,300,200);
		add(p1);
//		b2.setPreferredSize(new Dimension(50,200));
//		add()
//		b1.setBounds(0,0,50,200);
//		b2.setBounds(0,20,200,50);
//		JPanel p2 = new JPanel();
//		p2.setBackground(Color.black);
//		p2.setPreferredSize(new Dimension(400,50));
		
//		add(p2, BorderLayout.NORTH);
//		add(center, BorderLayout.CENTER
//		add(b2);
//		add(new JButton("Test"));
	
		setEnabled(true);
		setLocationRelativeTo(null);
		setSize(400,400);
		setTitle("Login");
		setLayout(null);
//		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new LoginPane();
	}

}
