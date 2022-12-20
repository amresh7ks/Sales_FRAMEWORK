package Com.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtiltiy {
	//
	private Connection connection;
	private String dbuser;
	public List<String> getDataFromDataBse(String query,String ColumnName) throws SQLException{
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(query);
		List<String> list=new ArrayList<String>();
		while(result.next()) {
			list.add(result.getString(ColumnName));
		}
		return list;	
	}
	public void openDBConnection(String dbURL,String dbPassword) throws SQLException
	{
		Driver dbdriver=new Driver();
		DriverManager.registerDriver(dbdriver);
		DriverManager.getConnection(dbURL, dbuser, dbPassword);
	}
public void CloseDB() throws SQLException {
	//okhttp3.Connection
	connection.close();
}
public void modifyDataIntoDB(String Query) throws SQLException {
	//Connection.create
	Statement Statement = connection.createStatement();
	Statement.executeQuery(Query);
}
public  boolean VerifyDataInDatabase(String query,String columName,String expectedData) throws SQLException {
	List<String >list=getDataFromDataBse(query, columName);
	boolean flag=false;
	if(list.contains(expectedData))flag=true;
	return flag;
	
}

}
