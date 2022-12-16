package Com.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class FileUtility {
	private  FileInputStream fis=null;	
/**
 * this method is used to fetch data Propertyfile
 * @param propertyFilepath
 * @return
 * @throws IOException
 */
		// TODO Auto-generated method stub
public String getDataFromPropertyfile(String filepath,String key)  {
	try {
		fis=new FileInputStream(key);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	//return key;			
	}
	Properties p=new  Properties();{
		try {
			p.load(fis);
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		String value=p.getProperty(filepath).trim();
	//return url;
	
		return value;
	}
	//return key;
	 /**
	  *This method is used to close the Property file
	  */
public void closePropertiesFile() {
	try {
		fis.close();
	}
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
	/**
	 * It is used to read the data from commomndaa properties File based on key
which you pass as an arugumen 	 */
  public String getProperyKeyValue(String key) throws  Throwable {
		FileInputStream  fis=new FileInputStream("./src/main/resources/commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		//String value;
		return value;
		
		
	}
  	
}

