
import java.sql.*;
import javax.swing.*;
class seqel {
	Connection conn=null;
	public static Connection connector(){
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\jayshree\\Desktop\\DB\\STUDENT.sqlite");
			
			return conn;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
	}

}
