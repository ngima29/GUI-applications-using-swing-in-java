package projectAtm;
import java.sql.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Login extends JFrame {
	 private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginemail;
	private JPasswordField loginpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Hamro Bank");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(86, 95, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(86, 134, 82, 14);
		contentPane.add(lblNewLabel_1_1);
		
		loginemail = new JTextField();
		loginemail.setBounds(190, 93, 136, 20);
		contentPane.add(loginemail);
		loginemail.setColumns(10);
		
		loginpass = new JPasswordField();
		loginpass.setBounds(190, 132, 136, 20);
		contentPane.add(loginpass);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = loginemail.getText();
	             @SuppressWarnings("deprecation")
				String password = loginpass.getText();
				
	             try {
	            	 Connection conn = ConProviderAtm.getCon();
	            	 String q = "Select Email, password,Balance from form where Email=? and password=?";
	            	 PreparedStatement pestm = conn.prepareStatement(q);
	            	 pestm.setString(1, userName);
	            	 pestm.setString(2, password);
	            	 ResultSet rs = pestm.executeQuery();
	            	 while (rs.next()) {
	            		  float totalBalance = rs.getFloat("Balance");      
	                        MainMenu menu = new MainMenu(userName,totalBalance);
	                        menu.setVisible(true);
	                        dispose();  
	                    }
	            	 if(userName == null){
	                        JOptionPane.showMessageDialog(loginbtn, "Wrong Username & Password");
	                    }
	            	 
//	            	 conn.close();
	            	 
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		loginbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginbtn.setBounds(86, 171, 89, 23);
		contentPane.add(loginbtn);
		
		JButton createacbtn = new JButton("Create Account");
		createacbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				RegisterForm regform = new RegisterForm();
				regform.setVisible(true);
			}
		});
		createacbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		createacbtn.setBounds(190, 172, 136, 23);
		contentPane.add(createacbtn);
	}

}
