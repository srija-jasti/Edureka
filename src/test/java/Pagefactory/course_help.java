package Pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class course_help {
WebDriver driver;
	
	public course_help(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/header/nav/div[3]") WebElement search_field;
	
	@FindBy(id="search-input") WebElement search_field2;
	
//	@FindBy(xpath="//*[@id=\\\"add-master-courses\\\"]/a[1]") WebElement course_add;
	
	@FindBy(xpath="//a[@data-title='Cloud Architect Course - Masters Program']") WebElement course_add;
	
	@FindBy(xpath="//button[@class='get_in_touch_button ga_event_new_mlp']") WebElement touch;
	
	
	public void search_screen() {
		search_field.click();
	}
	
	public void search_bar1(String co_name) {
		search_field2.sendKeys(co_name);
		search_field2.sendKeys(Keys.ENTER);
		
	}
	
	public void course_click() {
		course_add.click();
	}
	
	public void touch_click() {
		touch.click();
	}

}
