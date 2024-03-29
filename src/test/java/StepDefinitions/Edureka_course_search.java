package StepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Pagefactory.Review;
import Pagefactory.category_search;
import Pagefactory.course_help;
import Pagefactory.course_opt_search;
import Pagefactory.keyword_search;
import Pagefactory.not_enroll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edureka_course_search {
	
	WebDriver driver;
	@Given("user is on edureka Homepage")
	public void user_is_on_edureka_homepage()  {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		
	}

//	@When("user click on LogIn")
//	public void user_click_on_log_in() throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//span[@data-button-name='Login']")).click();
//	}
	
////	
////	
////
////
////
//	@When("user enter email as {string}")
//	public void user_enter_email_as(String string){
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.id("si_popup_email")).sendKeys(string);		
//	}
//
////	@When("user enter password as {string}")
////	public void user_enter_password_as(String string) {
////	    // Write code here that turns the phrase above into concrete actions
//////	    throw new io.cucumber.java.PendingException();
////		driver.findElement(By.id("si_popup_passwd")).sendKeys(string);
////	}
//////
//	@When("user click on login")
//	public void user_click_on_login() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//	}
//
//	@Then("logged in sucessfully")
//	public void logged_in_sucessfully() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//	}
	
	
	//start here
	
	
	@When("user click on DevOps Category")
	public void user_click_on_dev_ops_category() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//a[contains(text(),'DevOps') and @class='nav-link ga_category_upfront']")).click();
		category_search js = new category_search(driver);
		js.DevOps_category();
	}
//
	@When("user click on Devps certification course")
	public void user_click_on_devps_certification_course() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//a[@data-title='DevOps Certification Training Course' and @class='clp-course-tile-link giTrackElementClpV2']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
//		driver.findElement(By.xpath("//a[@class='clp-course-tile-hover noprice hidden-xs hidden-sm giTrackElementClpV2' and @data-title='DevOps Certification Training Course']")).click();
		category_search js1 = new category_search(driver);
		js1.DevOps_certificate();
	}
//	
//	
	@When("user has click on enroll button")
	public void user_has_click_on_enroll_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='videoinfo_btn_enr_stle__G_pv9 btn btn-primary' and @type='button']")).click();
		category_search js2 = new category_search(driver);
		js2.enroll_DevOps();
	}

//
//
//
	@Then("user should see enroll pop")
	public void user_should_see_enroll_pop() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}




	//2
	
	

	@When("user tap on search screen")
	public void user_tap_on_search_screen() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/span[1]/div/div/span/input")).click();
		
//		WebElement search_field = driver.findElement(By.xpath("/html/body/header/nav/div[3]"));
//		search_field.click();
		
		keyword_search ss = new keyword_search(driver);
		ss.search_bar();
		
	}
//
	@When("user enter {string} in search bar and click")
	public void user_enter_in_search_bar_and_click(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		keyword_search ss1 = new keyword_search(driver);
		ss1. enter_string(string);
		
//		WebElement searchbar = driver.findElement(By.id("search-input"));	
//		searchbar.sendKeys(string);
//		Thread.sleep(2000);
//		searchbar.sendKeys(Keys.ENTER);
	}
////
	@When("user should see list of courses related to the power bi")
	public void user_should_see_list_of_courses_related_to_the_power_bi() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
//
	@When("user tap on the course Micosoft powerBi Certification Training Course")
	public void user_tap_on_the_course_micosoft_power_bi_certification_training_course() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[@class='viewdetailsbtn' and contains(text(),'View Details')]")).click();
		keyword_search ss2 = new keyword_search(driver);
		ss2.select_powerBi();
		
	}
////
	@Then("user should be on course page")
	public void user_should_be_on_course_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
//	
//	
//	
//	
//	
	//no need
//
	
//	@When("user click on login")
//	public void user_click_on_login() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//span[@data-button-name='Login']")).click();
//	}
     //3 
	
	@When("user click on courses button")
	public void user_click_on_courses_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
//		driver.findElement(By.xpath("//a[@class='ga_courses_click']")).click();
		course_opt_search cb = new course_opt_search(driver);
		cb.courses_button();
		Thread.sleep(3000);
	}

	@When("different courses will be display")
	public void different_courses_will_be_display() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		
	}

	@When("user click on Selenium Certification Training course")
	public void user_click_on_selenium_certification_training_course() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
//	  driver.findElement(By.xpath("//a[@data-title='Selenium Certification Training Course']")).click();
		course_opt_search cb1 = new course_opt_search(driver);
		cb1.course_select();
		
		
	}
//
	@Then("user will be redirected to enrollment page")
	public void user_will_be_redirected_to_enrollment_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//button[@class='videoinfo_btn_enr_stle__G_pv9 btn btn-primary']")).click();
	}
//	
//	
//	
	
	//4
	


	@Given("user is in Edureka Homepage")
	public void user_is_in_edureka_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver = new EdgeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
	}
	
//	
	@When("user tap click on search screen")
	public void user_tap_click_on_search_screen() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		WebElement search_field = driver.findElement(By.xpath("/html/body/header/nav/div[3]"));
//		search_field.click();
		
		course_help ch = new course_help(driver);
		ch.search_screen();
		
	}
	@When("user enter {string} on search bar and click")
	public void user_enter_on_search_bar_and_click(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		WebElement searchbar = driver.findElement(By.id("search-input"));
//		searchbar.sendKeys(string);
//		searchbar.sendKeys(Keys.ENTER);	
		course_help ch1 = new course_help(driver);
		ch1.search_bar1(string);
		
		Thread.sleep(3000);
	}
	
//	
	@When("user tap on the course Cloud Architect Course - Masters Program")
	public void user_tap_on_the_course_cloud_architect_course_masters_program() {
	    // Write code here that turns the phrase above into concrete actions
//	   driver.findElement(By.xpath("//*[@id=\"add-master-courses\"]/a[1]/div[1]")).click();
//	 driver.findElement(By.xpath("[@data-title='Cloud Architect Course - Masters Program'")).click();
//	 driver.findElement(By.xpath("//*[@id=\"add-master-courses\"]/a[1]")).click();
		
		course_help ch2 = new course_help(driver);
		ch2.course_click();
	 
	}
//	
//	
//	
//	
	@When("user click on get in touch button")
	public void user_click_on_get_in_touch_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//button[@class='get_in_touch_button ga_event_new_mlp']")).click();
		course_help ch3 = new course_help(driver);
		ch3.touch_click();
		
	}
//
	@Then("user will get a popup")
	public void user_will_get_a_popup() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	
	//5
	
	
	
	
	@When("user click on search screen")
	public void user_click_on_search_screen() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
//		WebElement search_field = driver.findElement(By.xpath("/html/body/header/nav/div[3]"));
//		search_field.click();
		Review r = new Review(driver);
		r.search();
		
	}
//	
//	
////	
//
	@When("user enter {string} in search bar")
	public void user_enter_in_search_bar(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		WebElement searchbar =driver.findElement(By.id("search-input"));
//		searchbar.sendKeys(string);
		Review r1 = new Review(driver);
		r1.search2(string);
		Thread.sleep(2000);
//		searchbar.sendKeys(Keys.ENTER);	
		
	}
////
//	
@When("web page is redirected to the course page and click on review")
public void web_page_is_redirected_to_the_course_page_and_click_on_review() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//	driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
//	driver.findElement(By.xpath("//a[@data-title='PMP Certification Training Course']")).click();
	
	Review r2 = new Review(driver);
	r2.m1();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");

}

@Then("reviews will be displayed")
public void reviews_will_be_displayed() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//	driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
	Thread.sleep(1000);
//	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[5]/div[1]")).click();
	Review r3 = new Review(driver);
	r3.m2();
	
}


	//6
@When("user select on know more it is redirected to course page")
public void user_select_on_know_more_it_is_redirected_to_course_page() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100)");
//	driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[1]/a")).click();
	not_enroll ne = new not_enroll(driver);
	ne.know_click();
	
}

@When("user click on login button to enroll")
public void user_click_on_login_button_to_enroll() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//	driver.findElement(By.xpath("//span[@data-button-name='Login']")).click();
	not_enroll ne1 = new not_enroll(driver);
	ne1.course_click();
}

@When("user give username")
public void user_give_username() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//    driver.findElement(By.id("si_popup_email")).sendKeys("srijajasti22@gmail.com");
	not_enroll ne2 = new not_enroll(driver);
	ne2.user_name();
	
}

@When("user click on login")
public void user_click_on_login() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//    driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	not_enroll ne3 = new not_enroll(driver);
	ne3.login_click();
	
}

@Then("it shows a error message")
public void it_shows_a_error_message() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
    driver.findElement(By.id("passwdErrorr"));
}


	


}
