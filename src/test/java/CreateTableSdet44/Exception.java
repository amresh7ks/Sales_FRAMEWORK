package CreateTableSdet44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.remote.ProtocolHandshake.Result;

import com.github.dockerjava.api.model.Driver;

public class Exception {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String first_name="Nokia45";
		String last_name="Kumar";
		String Address="nokia";
		//step-1 create  object for the driver implement class and register driver  To Jdbc//lpad the database
		Driver driver=new Driver();
		//DriverManager.registerDriver((java.sql.Driver) driver);
		//Step2.connect the database
		Connection conn=DriverManager.getConnection("Jdbc::mysql:://localhost::3306/customer_info","root","root");
		//step3.create Sql statement
		Statement stat=conn.createStatement();
		String query="select *from customer";
		//step 4:  excute statement	//query
		ResultSet  result=stat.executeQuery(query);
		while(result.next()) {
			System.out.println(result.getInt(1)+"/t"+result.getString(2)+"/t"+result.getString(3)+"/t"+result.getString(4));
		}
		
		
		

	}

}
