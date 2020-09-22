package FlipkartAutomation;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Then;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
	public class FlipkartAuto {
		WebDriver driver;
	    @Given("^User is on Flipkart Home Page$")
	    public void user_is_on_flipkart_home_page() throws Throwable {
	        System.out.println("Flipkart Home Page");
	        WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https:\\www.flipkart.com/");
			driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("Prerna@gmail.com");
			driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Prerna");
			driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		    Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
			System.out.println(driver.getCurrentUrl());
	        
	    }

	    @When("^Search the iPhone on Home page$")
	    public void search_the_iphone_on_home_page() throws Throwable {
	        System.out.println("Search iphone on Home Page");
	        Thread.sleep(2000);
	        driver.findElement(By.name("q")).sendKeys("iPhone");
	        driver.findElement(By.xpath("//*[@type='submit']")).click();
	      
	    }

	    @Then("^List of iPhones are displayed$")
	    public void list_of_iphones_are_displayed() throws Throwable {
	        System.out.println("List of iphone are displayed");
	        Thread.sleep(2000);
	        WebElement Min= driver.findElement(By.xpath("//div[@class='_1qKb_B']/select"));
	        Select M1=new Select(Min);
	        M1.selectByValue("2000");
	        WebElement Max=driver.findElement(By.xpath("//div[@class='_1YoBfV']/select"));
	        Select M2=new Select(Max);
	        M2.selectByValue("50000");
	        Thread.sleep(2000);
	        driver.quit();

	    }

	}

