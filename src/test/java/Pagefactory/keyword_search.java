package Pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class keyword_search {
WebDriver driver;
	
	public keyword_search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	
	@FindBy(xpath="/html/body/header/nav/div[3]") WebElement outer_search;
	
//	@FindBy(xpath="//input[@aria-label='Enter Course, Category or keyword']") WebElement outer_search; //trial
	
	@FindBy(id="search-input") WebElement inner_search;
	
	@FindBy(xpath="//span[@class='viewdetailsbtn' and contains(text(),'View Details')]") WebElement powerbi_select;
	
//	@FindBy(xpath="//*[@id=\"add-master-courses\"]/a[1]/div[1]") WebElement powerbi_select; //trial
	
	public void data(String courses) {
		inner_search.sendKeys(courses);
		inner_search.sendKeys(Keys.ENTER);
		
	}
	

	
	public void search_bar() {
		outer_search.click();
	}
	
	public void enter_string(String c_name) {
		inner_search.sendKeys(c_name);
		inner_search.sendKeys(Keys.ENTER);
		
	}
	
	
	
	public void select_powerBi() {
		powerbi_select.click();
	}
	
	

}
