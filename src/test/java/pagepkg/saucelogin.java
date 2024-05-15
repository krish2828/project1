package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucelogin {
	WebDriver driver;

	@FindBy(name="user-name")
	WebElement userName;

	@FindBy(name="password")
	WebElement passWord;

	@FindBy(name="login-button")
	WebElement loginbutn;



	//constructor
	public saucelogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//action methods
	public void setValues(String username,String paswd) {
		userName.clear();
		userName.sendKeys(username);
		passWord.clear();
		passWord.sendKeys(paswd);
	}

	public void loginclick() {
		loginbutn.click();
		
	}

}
