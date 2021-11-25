package TutoringMavenGI.ShilaTutoringAI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutoringBrowserClass
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eRisheXpress\\Documents\\PnT Files\\Selenium\\PracticeFiles\\ShilaTutoringAI\\src\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		String urlOfBrowser = driver.getCurrentUrl();
		System.out.println(urlOfBrowser);
		driver.close();
		
		
		
		
		

	}

}
