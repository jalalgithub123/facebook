package com.stepdefinition;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.difflib.myers.MyersDiff;

public class LoginPage extends BaseClass  {
	POM p = new POM();
	BaseClass bc = new BaseClass();
	WebDriver driver = null;
	@Given("The user should in FaceBook Login Page")
	public void the_user_should_in_FaceBook_Login_Page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\SUCCESS\\CucuTest\\lib\\chromedriver.exe");
	    driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   
	}

	/*@When("The user should pass username and password{string},{string},{string}")
	public void the_user_should_pass_username_and_password(String filePath, String sheetname, String rowNo) 
	{
	    try {
			bc.exceldata(filePath, sheetname, rowNo);
			driver.findElement(By.id("email")).sendKeys(bc.userexcel);
			driver.findElement(By.id("pass")).sendKeys(bc.passexcel);
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
	    } catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	}

*/
	@When("The user should pass username and password{string}")
	public void the_user_should_pass_username_and_password(String rowNo) throws Exception {
		
		driver.findElement(By.id("email")).sendKeys();
		
	}

	
	@Then("The Facebook should logged in")
	public void the_Facebook_should_logged_in() {
	    
	}


}
