package SimpleDB;
import java.sql.*;


public class delete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		deletdata();

	}
	public static void deletdata() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/usersinfo";
		String UserName = "root";
		String Password = "1991";
	
		String query = "delete from userdetials where UserID = 5";
		Connection con = DriverManager.getConnection(url,UserName,Password);
	
		Statement smt = con.createStatement();
		int rows = smt.executeUpdate(query);
		System.out.println("Rows Affected :"+rows);
		con.close();
		
	}
	
	

}
