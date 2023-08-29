package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteFromCart {
	WebDriver driver;
	
	//@Given("login into app")
	//public void login_into_app() {
	   
	//}

	@When("list of itmes should be available in cart")
	public void list_of_itmes_should_be_available_in_cart() {
		driver.findElement(By.id("cartur")).click();
	    
	}

	@Then("delete an item from cart")
	public void delete_an_item_from_cart() {
		driver.findElement(By.xpath("//a[@onclick=\"deleteItem('09eadd72-2740-6bf9-1650-ad0a7ec2a0d1')\"]"));
	    
	}

}
