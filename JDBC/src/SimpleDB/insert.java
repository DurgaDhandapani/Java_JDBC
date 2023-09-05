package SimpleDB;
import java.sql.*;


public class insert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		insertdata();

	}
	public static void insertdata() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/usersinfo";
		String UserName = "root";
		String Password = "1991";
		String query = "insert into userdetials values (?,?)";
		Connection con = DriverManager.getConnection(url,UserName,Password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, 4 );
		pst.setString(2, "Ram");
	
		
		int rows = pst.executeUpdate();
		System.out.println("Rows Affected :"+rows);
		con.close();
		
	}
	
	

}
