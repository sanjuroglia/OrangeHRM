package orangeHRMscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateMethod
{
			String path;
			WebDriver driver;
	public void Launch() throws InterruptedException
	{
	//dynamic path of Chrome driver
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		//static path of chromedriver
	//System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");	
	//step 2
   // Initialize the chromedriver
	driver=new ChromeDriver();
	//Provide URL of application through navigate method and move backward,forward,refresh pages through navigate 
	driver.navigate().to("http://opensource-demo.orangehrmlive.com/");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();  //maximize the app
	Thread.sleep(10000);//for staying  the app on window
	driver.navigate().refresh(); //refresh page
	driver.quit();   //Quitting browser window
	
	}
	public static void main(String[] args)  throws InterruptedException
	{
		// TODO Auto-generated method stub
		NavigateMethod  oo=new NavigateMethod();
          oo.Launch();
	}
	
}
