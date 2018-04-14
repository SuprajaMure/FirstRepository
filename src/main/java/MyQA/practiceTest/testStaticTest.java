package MyQA.practiceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testStaticTest
{
static WebDriver driver;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		testStatic ts=new testStatic(driver);
		
		
		
		ts.open("weather");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
