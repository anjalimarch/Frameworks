package com.learning.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolyTester {

	@Given("^I am a \"([a-zA-Z]{1,})\" tester$")
	public void I_am_a_bad_tester(String testerType) {

		System.out.println("I am a "+testerType+ "tester");

	}

	@When("^i go to work$")
	public void i_go_to_work() {

		System.out.println("i go to work");

	}

	@Then("^i \"([a-zA-Z]{1,})\" it$")
	public void i_mess_with_it(String workOutput) {

		System.out.println("I "+workOutput+" with it");

	}

	@And("^My boss \"([a-zA-Z]{1,})\" me$")
	public void My_boss_fires_me(String boss) {

		System.out.println("My boss "+boss+" me");
	}

	@But("^the developer \"([a-zA-Z]{1,})\" me$")
	public void the_developer_likes_me(String hates) {

		System.out.println("the developer "+hates+" me");

	}

}
