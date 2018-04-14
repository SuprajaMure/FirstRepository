package MyQA.practiceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testStatic
{
WebDriver driver;

public testStatic(WebDriver driver)
{
	this.driver = driver;
}
public void open(String testdata)
{
	WebElement srch= driver.findElement(By.id("lst-ib"));
	srch.clear();
	srch.sendKeys(testdata);
	srch.submit();
}

}
