package week2.day2;

public class RemoteWebDriver implements WebDriver{

	@Override
	public void get(String url) {
		System.out.println("Url is loaded "+url);
	}
	
	public void close() {
		System.out.println("Browser closed");
	}
	
	public static void maximise() {
		System.out.println("Browser Maximised");
	}

}
