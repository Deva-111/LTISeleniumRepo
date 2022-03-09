package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.google.com");
	     driver.findElement(By.name("q")).sendKeys("Selenium");

	}

}