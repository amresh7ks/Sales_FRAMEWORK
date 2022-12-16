package CreateTableSdet44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Duplicate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String First_name="amresh";
		String Last_name="kumar";
		String address="Patna";
		Driver  dbdriver=new Driver();
		DriverManager.registerDriver(dbdriver);
		Connection connection=DriverManager.getConnection("e:://localhost::3306/sdet44", "root","root");
		try {
			Statement statement=connection.createStatement();
		
		
		}
		finally {
			
		}
		

	}

}
