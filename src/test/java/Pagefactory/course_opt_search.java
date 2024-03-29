package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class course_opt_search {
	
WebDriver driver;
	
	public course_opt_search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='ga_courses_click']") WebElement course_opt;
	
	@FindBy(xpath="//a[@data-title='Selenium Certification Training Course']") WebElement selenium_select;
	
	
	public void courses_button() {
		course_opt.click();
	}
	
	public void course_select() {
		selenium_select.click();
	}

}
