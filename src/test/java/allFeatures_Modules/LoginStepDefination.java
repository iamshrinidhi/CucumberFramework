//package allFeatures_Modules;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStepDefination {
//	
//	public WebDriver driver;
//	
//	@Given("^User should be login page of the ecoders application$")
//	public void user_should_be_login_page_of_the_ecoders_application() throws InterruptedException{
//		driver=new ChromeDriver();
//		driver.get("http://127.0.0.1:5000/login");
//		Thread.sleep(2000);
//	}
//	
//	@When("^the user enter valid username into username text field$")
//	public void the_user_enter_valid_username_into_username_text_field() throws InterruptedException {
//		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rolex1");
//		Thread.sleep(2000);
//	}
//
//	@When("^the user enter valid password into password text field$")
//	public void the_user_enter_valid_password_into_password_text_field() throws InterruptedException {
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
//		Thread.sleep(2000);
//	}
//
//	@When("^the user clicks on sign in button$")
//	public void the_user_clicks_on_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("//button[.='Sign In']")).click();
//		Thread.sleep(2000);
//		
//	    
//	}
//
//	@Then("^the user should be navigated to the dashboard page of ecoders application$")
//	public void the_user_should_be_navigated_to_the_dashboard_page_of_ecoders_application() throws InterruptedException {
//		String actual_title=driver.getTitle();
//		String expected_Title="FLASK-CRUD_APP_Dashboard_page.";
//		if(actual_title.equals(expected_Title)) {
//			System.out.println("Login test case is passed");
//		}
//		
//		else {
//			System.out.println("Login test case is falied");
//		}
//		Thread.sleep(2000);
//		driver.quit();
//		
//	}
//
//}
