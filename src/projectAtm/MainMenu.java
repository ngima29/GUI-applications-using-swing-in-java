package projectAtm;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public String uemail;
	public float toatlAmount;
public MainMenu(String lgemail, float amt) {
		this();
		this.uemail=lgemail;
		this.toatlAmount=amt;
	}
	
	
	public MainMenu() {
		setTitle("Hamro Bank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Welcome To Hamnro Bank");
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 434, 40);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Welcome To Hamro Bank Please Select your Choise");
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JButton depositbtn = new JButton("DEPOSIT");
		depositbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Deposite dep = new Deposite(uemail,toatlAmount);
				dep.setVisible(true);	
				dispose();
					
			}
		});
		depositbtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		depositbtn.setBounds(37, 57, 113, 32);
		contentPane.add(depositbtn);
		
		JButton btnChangePin = new JButton("CHANGE PIN");
		btnChangePin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Deposite dep = new Deposite(uemail);
//				dep.setVisible(true);	
//				dispose();
			}
		});
		btnChangePin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnChangePin.setBounds(10, 169, 140, 32);
		contentPane.add(btnChangePin);
		
		
		
		JButton btnNewButton_1_1 = new JButton("FAST CASH");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fastcash fcash = new Fastcash(uemail,toatlAmount);
				fcash.setVisible(true);	
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(37, 115, 113, 32);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("WITHDRAW");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Withdraw witdblc = new Withdraw(uemail,toatlAmount);
				witdblc.setVisible(true);	
				dispose();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1_1_1.setBounds(272, 57, 140, 32);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_3 = new JButton("CHECK BALANCE");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Balance dispblc = new Balance(uemail);
				dispblc.setVisible(true);	
				dispose();
				
			}
		});
		btnNewButton_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1_1_3.setBounds(272, 115, 162, 32);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_4 = new JButton("EXIT");
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login mlogin = new Login();
				mlogin.setVisible(true);
			}
		});
		btnNewButton_1_1_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1_1_4.setBounds(272, 169, 113, 32);
		contentPane.add(btnNewButton_1_1_4);
	}
}
