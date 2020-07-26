package week2.day2;

public class Test {
	public static void main(String[] args) {
		RemoteWebDriver driver = new RemoteWebDriver();
		driver.get("https://www.google.com/");
		driver.close();
		System.out.println(WebDriver.browsername);
		driver.maximise();
		WebDriver.findElement();
		
		WebDriver driver1 = new RemoteWebDriver();
		driver1.get("https://www.google.com/");
	}
}
