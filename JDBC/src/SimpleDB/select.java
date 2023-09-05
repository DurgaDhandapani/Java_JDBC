package SimpleDB;
import java.sql.*;


public class select {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		selectdata();

	}
	public static void selectdata() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/usersinfo";
		String UserName = "root";
		String Password = "1991";
		String query = "select * from userdetials";
		Connection con = DriverManager.getConnection(url,UserName,Password);
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(query);
	 
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString("UserName"));
		}
	
		
		
		con.close();
		
	}
	
	

}
