package readPropertyData;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchTheDataFromPropertyFile {
  public static void main(String[] args) throws IOException {
	 
	  // Create the object of the fileinputStrem class
	  FileInputStream fis =new FileInputStream("./data/commonData.properties");
		
	 // Create the object of the Properties class 
	    Properties prop = new Properties();
	    
	 // Load all the keys   
	    prop.load(fis);
	    
	 // use get property  method   
	    String data = prop.getProperty("browser");
	    System.out.println(data);
	    
	    String url = prop.getProperty("url");
	    
	    System.out.println(url);
}
}
