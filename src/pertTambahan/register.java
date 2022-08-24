package pertTambahan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class register extends JFrame{

	JLabel headerLabel, nameLabel, genderLabel, BirthDateLabel, emailLabel, passwordLabel;
	JPanel centerPanel, radioPanel, buttonPanel;
	JTextField nameField, birthDateField, emailField;
	JPasswordField passwordField;
	JRadioButton male, female;
	ButtonGroup genderGroup;
	JButton exportUser, Submit;
	
	public register() {
		// TODO Auto-generated constructor stub
		
		setEnabled(true); 
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(10,10));
		
		// Header
		JPanel header = new JPanel();
		headerLabel = new JLabel("WELCOME");
		headerLabel.setFont(new Font("Sans Serif", Font.BOLD, 25));

		header.add(headerLabel);
		// Center
		centerPanel = new JPanel(new GridBagLayout());
		centerPanel.setBorder(new EmptyBorder(10,10,10,10));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = gbc.BOTH;
		gbc.weightx = 0;
		gbc.weighty = 1;
		gbc.ipadx = 20;
		
		nameLabel = new JLabel("Full Name");
		nameLabel.setPreferredSize(new Dimension(20,50));
		nameField = new JTextField();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		centerPanel.add(nameLabel, gbc);
		
		gbc.gridx = 1;
		
		centerPanel.add(nameField, gbc);
		
		genderLabel = new JLabel("Gender");
		
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		
		genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		male.setSelected(true);
		
		radioPanel = new JPanel(new GridLayout(1,2));
		radioPanel.add(male);
		radioPanel.add(female);
		
		gbc.gridy = 1;
		centerPanel.add(radioPanel, gbc);
		
		gbc.gridx = 0;
		centerPanel.add(genderLabel, gbc);
		
		Submit = new JButton("submit");
		
		Submit.addActionListener(e -> {
			System.out.println("Name " + nameField.getText());
			System.out.println("gender " + ((male.isSelected()) ? "Male" : "Female"));
			
		});
		
		add(header, "North");
		add(centerPanel, BorderLayout.CENTER);
		add(Submit, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) {
		new register();
	}
	
}
