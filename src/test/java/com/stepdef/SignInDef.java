package com.stepdef;

import org.openqa.selenium.By;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInDef extends Base {
	@Given("^I able to go on home page$")
	public void i_able_to_go_on_home_page() throws Throwable {
		driver = getdriver();
	    
	    
	}

	@When("^I click on email$")
	public void i_click_on_email() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='email']")).click();
	    
	}

	@When("^Enter email$")
	public void enter_email() throws Throwable {
		
	    
	    
	}

	@When("^Enter passward$")
	public void enter_passward() throws Throwable {
		driver.findElement(By.name("pass")).sendKeys("1234");
		
	    
	}

	@When("^I click on log in$")
	public void i_click_on_log_in() throws Throwable {
		driver.findElement(By.xpath("")).submit();
	    
	    
	}

	@Then("^I successfully Logged in to the page$")
	public void i_successfully_Logged_in_to_the_page() throws Throwable {
	    
	    
	}

}
