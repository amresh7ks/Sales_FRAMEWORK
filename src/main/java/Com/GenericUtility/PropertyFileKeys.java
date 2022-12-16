package Com.GenericUtility;

public enum PropertyFileKeys {
	BROWSER("browser"),URL("url"),USERNAME("Username"),PASSWORD("password"),TIMEOUT("timeout");
	
	private String keys;
	
		//setter
		private PropertyFileKeys( String keys) {
			this.keys=keys;
			
		}
		//setter
		public  String convertoString() {
			return keys.toString();
		}
	}


