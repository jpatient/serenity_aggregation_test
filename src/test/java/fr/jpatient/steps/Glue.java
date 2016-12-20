package fr.jpatient.steps;

import org.assertj.core.api.Assertions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.exceptions.TestCompromisedException;

public class Glue {
    
    @Given("^Everything is (.*?)$")
    public void everythingIsToDetermine(final String status) {
        switch(status) {
        case "wrong":
            throw new TestCompromisedException("You shall not pass !");
        default:
            System.out.println("Everyghing is fine");
            break;
        }
    }
    
    @When("^Something happens$")
    public void somethingHappens() {
        System.out.println("Something happens");
    }
    
    @Then("^Something happened$")
    public void somethingHappened() {
        Assertions.assertThat(true).isTrue();
    }

}
