package org.tektutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import static org.junit.Assert.*;

public class Steps {

	private App app;
	private String actualResponse;

	@Given("An App class object exists")
	public void an_App_class_object_exists() {
		app = new App();
	}

	@When("I invoke the sayHello API")
	public void i_invoke_the_sayHello_API() {
		actualResponse = app.sayHello();
	}

	@Then("I expect the response {string}")
	public void i_expect_the_response(String expectedResponse) {
		assertEquals ( expectedResponse, actualResponse );
	}


}
