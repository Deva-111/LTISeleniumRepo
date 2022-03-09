package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByID {

	public static void main(String[] args) {
		WebDriver driver;	
    	System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		/*WebElement username=driver.findElement(By.id("login1"));
		username.sendKeys("deepika");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("deepika");
		String UsernameValue=username.getText();
		username.clear();*/
		driver.findElement(By.cssSelector
("div.table>div.row:nth-of-type(1)>div.cell:nth-of-type(2)>input")).sendKeys("deepika");
		
		
	}