package orangeHRMscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminScript {
	String path;
	WebDriver driver;
	
	public void Launch() throws InterruptedException 
	{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 driver.findElement(By.linkText("Admin")).click();
	 driver.findElement(By.linkText("User Management")).click();
	 driver.findElement(By.linkText("Users")).click();
	 
	 driver.findElement(By.id("searchSystemUser_userName")).sendKeys("aman");
	 driver.findElement(By.id("searchSystemUser_userType")).click();
	 Thread.sleep(2000);
	 driver.close();
	}
	public static void main(String args[]) throws InterruptedException {
		AdminScript ad=new AdminScript();
		ad.Launch();
		
	}
}
