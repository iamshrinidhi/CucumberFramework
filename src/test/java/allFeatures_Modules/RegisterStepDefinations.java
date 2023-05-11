package allFeatures_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinations {
	
	public WebDriver driver;
	
	@Given("^The user has to be in register page$")
	public void the_user_has_to_be_in_register_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5000/register");
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("^the user enters the username$")
	public void the_user_enters_the_username() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("smt");
		Thread.sleep(2000);
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("^the user enters a new password$")
	public void the_user_enters_a_new_password() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("^the user clicks on register button$")
	public void the_user_clicks_on_register_button() {
		driver.findElement(By.xpath("//button[.='Register']")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("^the user should be navigated to the login a page of ecoders website$")
	public void the_user_should_be_navigated_to_the_login_a_page_of_ecoders_website() throws InterruptedException {
		String actual_Title = driver.getTitle();
		String expected_title="FLASK-CRUD_APP_login_page.";
		if(actual_Title.equals(expected_title)) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case failed");
		}
		Thread.sleep(2000);
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("^User should be login page of the ecoders application$")
	public void user_should_be_login_page_of_the_ecoders_application() throws InterruptedException{
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5000/login");
		Thread.sleep(2000);
	}
	
	@When("^the user enter valid username into username text field$")
	public void the_user_enter_valid_username_into_username_text_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("smt");
		Thread.sleep(2000);
	}

	@When("^the user enter valid password into password text field$")
	public void the_user_enter_valid_password_into_password_text_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		Thread.sleep(2000);
	}

	@When("^the user clicks on sign in button$")
	public void the_user_clicks_on_sign_in_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		Thread.sleep(2000);
		
	    
	}

	@Then("^the user should be navigated to the dashboard page of ecoders applications$")
	public void the_user_should_be_navigated_to_the_dashboard_page_of_ecoders_applications() throws InterruptedException {
		String actual_dashtitle=driver.getTitle();
		String expected_Title="FLASK-CRUD_APP_Dashboard_page.";
		if(actual_dashtitle.equals(expected_Title)) {
			System.out.println("Login test case is passed");
		}
		
		else {
			System.out.println("Login test case is falied");
		}
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Given("^User should be login page of the ecoders applications$")
	public void user_should_be_login_page_of_the_ecoders_applications() throws InterruptedException{
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5000/login");
		Thread.sleep(2000);
	}
	
	@When("the user enter invalid username into username text field")
	public void the_user_enter_invalid_username_into_username_text_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rolex123");
		Thread.sleep(2000);
//		throw new io.cucumber.java.PendingException();
	}

	@When("the user enter invalid password into password text field")
	public void the_user_enter_invalid_password_into_password_text_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		Thread.sleep(2000);
//		throw new io.cucumber.java.PendingException();
	}
	
	@When("^the user clicks on sign in buttons$")
	public void the_user_clicks_on_sign_in_buttons() throws InterruptedException {
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		Thread.sleep(2000);
	}

	@Then("^the user should be navigated to the login page of ecoders application$")
	public void the_user_should_be_navigated_to_the_login_page_of_ecoders_application() throws InterruptedException {
		String actual_dashtitle_1=driver.getTitle();
		String expected_Title_1="FLASK-CRUD_APP_Dashboard_page.";
		if(actual_dashtitle_1.equals(expected_Title_1)) {
			System.out.println("Login test case is pass");
		}
		
		else {
			System.out.println("Login test case is fail");
			driver.quit();
		}
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	

}
