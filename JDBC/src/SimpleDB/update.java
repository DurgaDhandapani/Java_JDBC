package SimpleDB;
import java.sql.*;


public class update {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		updatedata();

	}
	public static void updatedata() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/usersinfo";
		String UserName = "root";
		String Password = "1991";
		
		String query = "update userdetials set UserName = 'Gayu' where UserID = 5";
		Connection con = DriverManager.getConnection(url,UserName,Password);
		PreparedStatement pst = con.prepareStatement(query);
		
	
		
		int rows = pst.executeUpdate();
		System.out.println("Rows Affected :"+rows);
		con.close();
		
	}
	
	

}
