package week2.day2;

import java.net.MalformedURLException;

public interface WebDriver {

	public String browsername = "Chrome";

	/**
	 * This method loads the given url in the opened browser under the current
	 * session.
	 * 
	 * @param url - Pass the String url with the protocols (HTTP/HTTPS)
	 * @author Balaji
	 * @exception MalformedURLException
	 */
	public void get(String url);
	
	
	
	
	public static void findElement() {
		System.out.println("Element found");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
