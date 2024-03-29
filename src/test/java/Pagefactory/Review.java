package Pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Review {
	
WebDriver driver;
	
	public Review(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/header/nav/div[3]") WebElement s1;
	
	@FindBy(id="search-input") WebElement s2;
	
	@FindBy(xpath="//a[@data-title='PMP Certification Training Course']") WebElement s3;
	
//	@FindBy(xpath="//*[@id=\\\"__next\\\"]/div/section[2]/div/div/div/div[5]/div[1]") WebElement s4;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/section[2]/div/div/div/div[5]/div[1]") WebElement s4;
	
	
	public void search(){
		s1.click();
	}

	public void search2(String cou_name) {
		s2.sendKeys(cou_name);
		s2.sendKeys(Keys.ENTER);
	}
	
	public void m1() {
		s3.click();
	}
	
	public void m2() {
		s4.click();
	}
}
