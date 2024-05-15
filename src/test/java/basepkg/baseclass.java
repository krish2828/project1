package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class baseclass {
	public static WebDriver driver;
	@BeforeTest
	public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

}
}
