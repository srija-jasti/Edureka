package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class not_enroll {
	
WebDriver driver;
	
	public not_enroll(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/section[2]/div/div/div[1]/a") WebElement know;
	
	@FindBy(xpath="//span[@data-button-name='Login']") WebElement course_login;
	
	@FindBy(id="si_popup_email")  WebElement user;
	
	@FindBy(xpath="//button[contains(text(),'Login')]") WebElement login;
	
	public void know_click() {
		know.click();
		
	}
	
	public void course_click() {
		course_login.click();
	}
	
	public void user_name() {
		user.sendKeys("srijajasti22@gmail.com");
	}
	
	public void login_click() {
		login.click();
	}

}
