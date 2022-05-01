
package projectAtm;
import java.sql.*;
public class ConProviderAtm {
	private static Connection con;
	public static Connection getCon(){
		try {
	if(con == null) {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/atmdb";
	String user = "root";
	String pw = "";
	//connection
	 con = DriverManager.getConnection(url,user,pw);
	}
}catch(Exception e) {
	e.printStackTrace();
}
return con; 
}
}
