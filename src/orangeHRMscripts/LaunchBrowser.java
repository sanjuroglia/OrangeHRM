package orangeHRMscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {
WebDriver driver;
	String path;
	public void Launch() 
	{
		
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.out.println(System.setProperty("webdriver.chrome.driver",path));
		
		driver=new ChromeDriver();
		//Deleting Cookies
		driver.manage().deleteAllCookies();
		//Step 3
		//Provide url of the application through navigate method and we can move back  and forward,refresh pages throgh navigate p
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//Locate elements By Id
		 driver.findElement(By.id("txtUsername")).sendKeys("Adminn");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
	}
public static void main(String args[]) {
	LaunchBrowser lb=new LaunchBrowser();
	lb.Launch();
}
}
