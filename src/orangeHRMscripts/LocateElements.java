package orangeHRMscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocateElements {

	String path;
	WebDriver driver;
	WebElement uname,pass,login,element;
	public void Launch() throws InterruptedException
	{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";

	//Static path of Chromedriver
	System.setProperty("webdriver.chrome.driver", path);

	//Step 2
	//Initialize the ChromeDriver
	driver=new ChromeDriver();
	//Deleting Cookies
	driver.manage().deleteAllCookies();
	//Step 3
	//Provide url of the application through navigate method and we can move back  and forward,refresh pages throgh navigate p
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	//Locate elements By Id
	 driver.findElement(By.id("txtUsername")).sendKeys("Adminn");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin12");
	 driver.findElement(By.id("btnLogin")).click();
     element=driver.findElement(By.id("spanMessage"));
     System.out.println(element.getText());
	//Locate Elements by name
	//uname=driver.findElement(By.name("txtUsername"));
	//if(uname.isDisplayed())
	//{
	//uname.sendKeys("Admin");
	//}
	//pass=driver.findElement(By.name("txtPassword"));
	//pass.sendKeys("admin12");
	//login=driver.findElement(By.name("Submit"));
	//login.submit();
	

	}
	public void forgetPass() throws InterruptedException
	{
	//Working with linkText locator

	//driver.findElement(By.linkText("Forgot your password?")).click();

	//Working with partialLinkText
	driver.findElement(By.partialLinkText("For")).click();
	System.out.println(driver.getCurrentUrl());// shows forget password page url
	Thread.sleep(5000);

	}
	public void Close_Browser()
	{
	driver.quit();

	}
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	LocateElements oo=new LocateElements();
	oo.Launch();
	oo.forgetPass();
	oo.Close_Browser();
	}

	}
