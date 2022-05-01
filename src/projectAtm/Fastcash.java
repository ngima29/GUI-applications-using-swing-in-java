package projectAtm;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Fastcash extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fastcash frame = new Fastcash();
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
	
	
	
	
	public String udemail;
	public float TotalBalance;
	public Fastcash(String memail ,float amt) {
			this();
			this.udemail=memail;
			this.TotalBalance=amt;
		}
	
	public Fastcash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("Welcome To Hamro Bank ");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBackground(Color.CYAN);
		textField.setBounds(0, 0, 434, 31);
		contentPane.add(textField);
		
		JLabel lblFastCash = new JLabel("FAST CASH");
		lblFastCash.setHorizontalAlignment(SwingConstants.CENTER);
		lblFastCash.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblFastCash.setBounds(127, 42, 137, 35);
		contentPane.add(lblFastCash);
		
		JButton fiveH = new JButton("500");
		fiveH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TotalBalance = TotalBalance - 500;
	             try {
	            	 Connection conn = ConProviderAtm.getCon();	            	 	            	  	 
	            	 String q2 = "UPDATE form SET Balance = ?, updated_at = now() WHERE  Email = ?";	            	 
	            	 PreparedStatement prestm = conn.prepareStatement(q2);
	            	 prestm.setFloat(1, TotalBalance);
	            	 prestm.setString(2, udemail);
	            	 prestm.executeUpdate();
	            	 dispose();
	 				MainMenu menu = new MainMenu();
	 				menu.setVisible(true);
	            	JOptionPane.showMessageDialog(fiveH, "Withdraw successfully");
	            	 //conn.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}	
			
			}
		});
		fiveH.setFont(new Font("Times New Roman", Font.BOLD, 14));
		fiveH.setBounds(22, 88, 113, 32);
		contentPane.add(fiveH);
		
		JButton oneT = new JButton("1000");
		oneT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TotalBalance = TotalBalance - 1000;
	             try {
	            	 Connection conn = ConProviderAtm.getCon();	            	 	            	  	 
	            	 String q2 = "UPDATE form SET Balance = ?, updated_at = now() WHERE  Email = ?";	            	 
	            	 PreparedStatement prestm = conn.prepareStatement(q2);
	            	 prestm.setFloat(1, TotalBalance);
	            	 prestm.setString(2, udemail);
	            	 prestm.executeUpdate();
	            	 dispose();
	 				MainMenu menu = new MainMenu();
	 				menu.setVisible(true);
	            	JOptionPane.showMessageDialog(oneT, "Withdraw successfully");
	            	 //conn.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}	
			}
		});
		oneT.setFont(new Font("Times New Roman", Font.BOLD, 14));
		oneT.setBounds(22, 131, 113, 32);
		contentPane.add(oneT);
		
		JButton twoT = new JButton("2000");
		twoT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TotalBalance = TotalBalance - 2000;
	             try {
	            	 Connection conn = ConProviderAtm.getCon();	            	 	            	  	 
	            	 String q2 = "UPDATE form SET Balance = ?, updated_at = now() WHERE  Email = ?";	            	 
	            	 PreparedStatement prestm = conn.prepareStatement(q2);
	            	 prestm.setFloat(1, TotalBalance);
	            	 prestm.setString(2, udemail);
	            	 prestm.executeUpdate();
	            	 dispose();
	 				MainMenu menu = new MainMenu();
	 				menu.setVisible(true);
	            	JOptionPane.showMessageDialog(twoT, "Withdraw successfully");
	            	 //conn.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		twoT.setFont(new Font("Times New Roman", Font.BOLD, 14));
		twoT.setBounds(22, 174, 113, 32);
		contentPane.add(twoT);
		
		JButton fiveT = new JButton("5000");
		fiveT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TotalBalance = TotalBalance - 5000;
	             try {
	            	 Connection conn = ConProviderAtm.getCon();	            	 	            	  	 
	            	 String q2 = "UPDATE form SET Balance = ?, updated_at = now() WHERE  Email = ?";	            	 
	            	 PreparedStatement prestm = conn.prepareStatement(q2);
	            	 prestm.setFloat(1, TotalBalance);
	            	 prestm.setString(2, udemail);
	            	 prestm.executeUpdate();
	            	 dispose();
	 				MainMenu menu = new MainMenu();
	 				menu.setVisible(true);
	            	JOptionPane.showMessageDialog(fiveT, "Withdraw successfully");
	            	 //conn.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}	
			}
		});
		fiveT.setFont(new Font("Times New Roman", Font.BOLD, 14));
		fiveT.setBounds(278, 88, 113, 32);
		contentPane.add(fiveT);
		
		JButton tenT = new JButton("10,000");
		tenT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TotalBalance = TotalBalance - 10000;
	             try {
	            	 Connection conn = ConProviderAtm.getCon();	            	 	            	  	 
	            	 String q2 = "UPDATE form SET Balance = ?, updated_at = now() WHERE  Email = ?";	            	 
	            	 PreparedStatement prestm = conn.prepareStatement(q2);
	            	 prestm.setFloat(1, TotalBalance);
	            	 prestm.setString(2, udemail);
	            	 prestm.executeUpdate();
	            	 dispose();
	 				MainMenu menu = new MainMenu();
	 				menu.setVisible(true);
	            	JOptionPane.showMessageDialog(fiveH, "Withdraw successfully");
	            	 //conn.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		tenT.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tenT.setBounds(278, 131, 113, 32);
		contentPane.add(tenT);
		
		JButton twentyT = new JButton("20,000");
		twentyT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TotalBalance = TotalBalance - 20000;
	             try {
	            	 Connection conn = ConProviderAtm.getCon();	            	 	            	  	 
	            	 String q2 = "UPDATE form SET Balance = ?, updated_at = now() WHERE  Email = ?";	            	 
	            	 PreparedStatement prestm = conn.prepareStatement(q2);
	            	 prestm.setFloat(1, TotalBalance);
	            	 prestm.setString(2, udemail);
	            	 prestm.executeUpdate();
	            	 dispose();
	 				MainMenu menu = new MainMenu();
	 				menu.setVisible(true);
	            	JOptionPane.showMessageDialog(twentyT, "Withdraw successfully");
	            	 //conn.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		twentyT.setFont(new Font("Times New Roman", Font.BOLD, 14));
		twentyT.setBounds(278, 174, 113, 32);
		contentPane.add(twentyT);
		
		JLabel lblNewLabel = new JLabel("BALANCE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(155, 136, 94, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(167, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
