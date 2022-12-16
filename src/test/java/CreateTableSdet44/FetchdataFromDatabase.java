package CreateTableSdet44;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.Driver;


//import com.github.dockerjava.api.model.Driver;

public class FetchdataFromDatabase {
	public static void main(String[] args) throws SQLException {
		//Step1. create the object for Driver implements class and register driver to Jdbc
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
	 //step2. Get establish database connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet44\",\"root\",\"root");
      //step3.create statment
		Statement statement=connection.createStatement();
		//step4.excute query
		ResultSet result=statement.executeQuery("Select * from customers");
		//step5.utilizatio /fetch particular comm data
		System.out.println(result.getString("name"));
		
		

	}
}
