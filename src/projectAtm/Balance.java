package projectAtm;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class Balance extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField blanacedips;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Balance frame = new Balance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 
	//public float TotalBalance;
	public String udemail;
	public Balance(String memail) {
			this();
			this.udemail=memail;
			//this.TotalBalance=amt;
		}
	//amountD = String.valueOf(TotalBalance);  
	//public String amountD = String.valueOf(TotalBalance);  
	public Balance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome TO Hamro Bank ");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 424, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your Current Balance is :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 66, 204, 59);
		contentPane.add(lblNewLabel_1);
		//float DisplayBalanca = Float.parseFloat(blanacedips.getText());

		blanacedips = new JTextField();
		//blanacedips.setText(TotalBalance);
		blanacedips.setHorizontalAlignment(SwingConstants.CENTER);
		blanacedips.setFont(new Font("Times New Roman", Font.BOLD, 22));
		blanacedips.setBounds(239, 66, 151, 59);
		contentPane.add(blanacedips);
		blanacedips.setColumns(10);
		
       try {
      	 Connection conn = ConProviderAtm.getCon();
      	 String q = "Select Balance from form where Email=?";
      	 PreparedStatement pestm = conn.prepareStatement(q);
      	 pestm.setString(1, udemail);
      	 ResultSet rs = pestm.executeQuery();
        	if (rs.next()) {
        		blanacedips.setText(rs.getFloat("Balance"));
        	}
       	 
	}catch(Exception e1) {
		e1.printStackTrace();	}
        
        
		
		
	}
}
