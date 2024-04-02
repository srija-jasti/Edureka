package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pagefactory.excel_course;
import Pagefactory.keyword_search;
 
 
public class excel_step{
	WebDriver driver;
	@DataProvider(name = "testdata")
	public Object getData() {
		excel_course utils = new excel_course("C:\\Users\\JSRIJA\\Desktop\\testdata.xlsx");
		int rows = utils.getRowCount(0);
		Object[][] course_data = new Object[rows][1];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < 1; j++) {
				course_data[i][j] = utils.getdata(0, i + 1, j);
				System.out.println(course_data[i][j]);
			}
		}
		return course_data;
	}
	@BeforeMethod 
	public void before1() { 
		driver = new ChromeDriver();
	  driver.get("https://www.edureka.co/"); 
	  driver.manage().window().maximize();
	  keyword_search k = new keyword_search(driver); 
	  k.search_bar();

	  
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }
	@Test(dataProvider = "testdata")
	//@When("I fill in the deal details with {string},{string},{string},{string},{string},{string},{string},{string}")
	public void details(String courses) {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 keyword_search key = new keyword_search(driver); 
		 key.data(courses);
		 
	}
}
 