package com.learning.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolyDeveloper {

	@Given("^I work in \"([^\"]*)\"$")
	public void I_am_a_bad_tester(String organisation) {

		System.out.println("I am a " + organisation + "tester");

	}

	@When("^i meet \"([^\"]*)\"$")
	public void i_go_to_work(String person) {

		System.out.println("i meet "+person+"personality");

	}

	@Then("^i \"([^\"]*)\"$")
	public void i_mess_with_it(String feel) {

		System.out.println("I " + feel +"aftermeeting");

	}

	@But("^he is a \"([^\"]*)\" person$")
	public void the_developer_likes_me(String personalitywise) {

		System.out.println("he is a "+personalitywise+"good person");

	}

}
