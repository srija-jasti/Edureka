package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class category_search {
	WebDriver driver;
	
	public category_search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'DevOps') and @class='nav-link ga_category_upfront']") WebElement Devops_click;
	
	@FindBy(xpath="//a[@class='clp-course-tile-hover noprice hidden-xs hidden-sm giTrackElementClpV2' and @data-title='DevOps Certification Training Course']") WebElement Devops_course;
	
	@FindBy(xpath="//button[@class='videoinfo_btn_enr_stle__G_pv9 btn btn-primary' and @type='button']") WebElement enroll_button;
	
	public void DevOps_category() {
		Devops_click.click();
	}
	
	public void DevOps_certificate() {
		Devops_course.click();
	}
	
	public void enroll_DevOps() {
		enroll_button.click();
	}

}

