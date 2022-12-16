package Com.GenericUtility;
/**
 
 * @author HP
 *
 */

public class JavaUtiltiy {
	/**
	 * 
	 * @param s
	 * @param strategy
	 * @return
	 */
	public  Object  stringToAnyDataType(String s,String strategy) {
		//return strategy;
		Object convertedData=null; 
		if(strategy.equals("int")) {
			convertedData=Integer.parseInt(s);
			
		}
		
		else if(strategy.equals("long")) {
			//convertedData=long.parselong(s);
			convertedData=Long.parseLong(s);
		}
		return convertedData;
		//return convertedData;
	}

}
