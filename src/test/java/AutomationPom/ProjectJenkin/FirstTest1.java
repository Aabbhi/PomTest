package AutomationPom.ProjectJenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest1 {

	
	@Test
	public void FirstTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
	     
		 WebDriver driver;
		
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}

}
