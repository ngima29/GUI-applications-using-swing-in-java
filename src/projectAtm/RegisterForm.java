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
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import com.toedter.calendar.JDateChooser;
public class RegisterForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField accnum;
	private JTextField acname;
	private JTextField acfname;
	private JTextField phone;
	private JTextField email;
	private JTextField address;
	private JTextField balanca;
	private JTextField pin;
	private JPasswordField regpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Hamro Bank");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 563, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Account No");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 62, 98, 14);
		contentPane.add(lblNewLabel_1);
		
		accnum = new JTextField();
		accnum.setBounds(118, 60, 139, 20);
		contentPane.add(accnum);
		accnum.setColumns(10);
		
		acname = new JTextField();
		acname.setColumns(10);
		acname.setBounds(405, 60, 139, 20);
		contentPane.add(acname);
		
		JLabel lblNewLabel_1_2 = new JLabel("Full Name");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(282, 62, 98, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Father Name");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 103, 98, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("DOB");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(10, 140, 98, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Phone");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(282, 103, 98, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Email");
		lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_5_1.setBounds(282, 140, 98, 14);
		contentPane.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("Address ");
		lblNewLabel_1_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_5_2.setBounds(10, 176, 98, 14);
		contentPane.add(lblNewLabel_1_5_2);
		
		JLabel lblNewLabel_1_5_3 = new JLabel("Balance");
		lblNewLabel_1_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_5_3.setBounds(282, 176, 98, 14);
		contentPane.add(lblNewLabel_1_5_3);
		
		JLabel lblNewLabel_1_5_4 = new JLabel("Password");
		lblNewLabel_1_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_5_4.setBounds(10, 211, 98, 14);
		contentPane.add(lblNewLabel_1_5_4);
		
		JLabel lblNewLabel_1_5_5 = new JLabel("PIN");
		lblNewLabel_1_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_5_5.setBounds(282, 201, 98, 34);
		contentPane.add(lblNewLabel_1_5_5);
		
		regpass = new JPasswordField();
		regpass.setBounds(118, 209, 139, 20);
		contentPane.add(regpass);
		
		JDateChooser dateOB = new JDateChooser();
		dateOB.setBounds(118, 134, 74, 20);
		contentPane.add(dateOB);
		
		acfname = new JTextField();
		acfname.setColumns(10);
		acfname.setBounds(118, 101, 139, 20);
		contentPane.add(acfname);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(405, 101, 139, 20);
		contentPane.add(phone);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(405, 138, 139, 20);
		contentPane.add(email);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(118, 174, 139, 20);
		contentPane.add(address);
		
		balanca = new JTextField();
		balanca.setColumns(10);
		balanca.setBounds(405, 174, 139, 20);
		contentPane.add(balanca);
		
		pin = new JTextField();
		pin.setColumns(10);
		pin.setBounds(405, 209, 139, 20);
		contentPane.add(pin);
		
		JButton regsubmit = new JButton("SUBMIT");
		regsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//date
				SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
				//field initalization
				int accNum = Integer.parseInt(accnum.getText());
				String acName = acname.getText();
				String fName = acfname.getText();
	
				String DOB = sdf.format(dateOB.getDate()); 
				String Phone = phone.getText();
				String Email = email.getText();
				String Address = address.getText();
				float Balanca = Float.parseFloat(balanca.getText());
				@SuppressWarnings("deprecation")
				String Regpass = regpass.getText();
				int Pin = Integer.parseInt(pin.getText());
				
//				int accnolen = accNum.length();
//				int phonelen = Phone.length();
//				int pinlen = Pin.length();
//				  
//				if (accnolen != 6) {
//                    JOptionPane.showMessageDialog(regsubmit, "Account no should be 6 digit");
//                }
//				if (pinlen != 4) {
//                    JOptionPane.showMessageDialog(regsubmit, "PIN should be 4 digit");
//                }
//				if (phonelen != 10) {
//                    JOptionPane.showMessageDialog(regsubmit, "Enter a valid mobile number");
//                }
				
                try {
                	 Connection conn = ConProviderAtm.getCon();
	            	 String q = "INSERT INTO form VALUES(?,?,?,?,?,?,?,?,?,?,now(),now())";            	 
	            	 PreparedStatement prestm = conn.prepareStatement(q);
	            	 
	            	 prestm.setInt(1, accNum);
	            	 prestm.setString(2, acName);
	            	 prestm.setString(3, fName);
	            	 prestm.setString(4, DOB);
	            	 prestm.setString(5, Phone);
	            	 prestm.setString(6, Email);
	            	 prestm.setString(7, Address);
	            	 prestm.setFloat(8, Balanca);
	            	 prestm.setString(9, Regpass);
	            	 prestm.setInt(10, Pin);
	            	
	                 prestm.executeUpdate();
	                 dispose();
	 				Login rlg = new Login();
	 				rlg.setVisible(true);
	            	JOptionPane.showMessageDialog(regsubmit, "Account Created successfully");
	            	 conn.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
				
				
				
				
				
			///	
			}
		});
		regsubmit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		regsubmit.setBounds(204, 257, 128, 23);
		contentPane.add(regsubmit);
		
		JButton reglogin = new JButton("LOGIN");
		reglogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login lg = new Login();
				lg.setVisible(true);
			}
		});
		reglogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		reglogin.setBounds(214, 291, 89, 23);
		contentPane.add(reglogin);
		
		
	}
}
