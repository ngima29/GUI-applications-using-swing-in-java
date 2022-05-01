package projectAtm;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Withdraw extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField witamt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw frame = new Withdraw();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String udemail;
	public float TotalBalance;
	public Withdraw(String memail ,float amt) {
			this();
			this.udemail=memail;
			this.TotalBalance=amt;
		}
	
	public Withdraw() {
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
		lblNewLabel.setBounds(10, 0, 424, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WITHDRAW");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(148, 45, 148, 44);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AMOUNT");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(111, 122, 84, 25);
		contentPane.add(lblNewLabel_2);
		
		witamt = new JTextField();
		witamt.setBounds(230, 125, 86, 20);
		contentPane.add(witamt);
		witamt.setColumns(10);
		
		JButton withdbtn = new JButton("WITHDRAW");
		withdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float DepBalanca = Float.parseFloat(witamt.getText());
				 TotalBalance = TotalBalance - DepBalanca;
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
	            	JOptionPane.showMessageDialog(withdbtn, "Withdraw successfully");
	            	 //conn.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		withdbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		withdbtn.setBounds(162, 169, 134, 23);
		contentPane.add(withdbtn);
		
		JButton withdexit = new JButton("EXIT");
		withdexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login wlg = new Login();
				wlg.setVisible(true);
			}
		});
		withdexit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		withdexit.setBounds(322, 215, 89, 23);
		contentPane.add(withdexit);
	}
}
