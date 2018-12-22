package stepdefs.hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItFriday {
    static String isItFriday(String today) {
        return "Nope";
    }
}

class IsItSaturday {
    static String isItSaturday(String today) {
        return "Obviously NOT";
    }
}

public class StepdefsForFriday {
    private String today;
    private String actualAnswer;

    @Given("^today is Sunday$")
    public void today_is_Sunday() {
        this.today = "Sunday";
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() {
        this.actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("today is Monday")
    public void today_is_Monday() {
        this.today = "Monday";
    }

    @When("I ask whether it's Saturday yet")
    public void i_ask_whether_it_s_Saturday_yet() {
        this.actualAnswer = IsItSaturday.isItSaturday(today);
    }

}