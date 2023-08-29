package stepDefs;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	WebDriver driver;
	Alert alert;
	@Given("Login into app")
	public void login_into_app() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		//driver.findElement(By.id("login2")).click();
		//driver.findElement(By.id("loginusername")).sendKeys("TestPriyanka");
		//driver.findElement(By.id("loginpassword")).sendKeys("Test");
		//driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	}

	@When("Add item to cart")
	public void add_item_to_cart() {
		driver.findElement(By.xpath("//a[@class=\"hrefch\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"btn btn-success btn-lg\"]")).click();
		
	    
	}

	@Then("Item must be added to cart")
	public void item_must_be_added_to_cart() {
		//assert.assertEquals(, Product added.);
		//alert = driver.switchTo().alert();
		//System.out.println("Product added" + alert.getText());
		//alert.accept();
		
	    
	}

}
