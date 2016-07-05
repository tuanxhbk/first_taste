package nicebank;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

/**
 * Created by TuanNguyen on 7/4/2016.
 */
public class Steps {
    @Given("^I have deposited \\$(\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(int amount) throws Throwable {
        new Account(amount);
    }

    @When("^I request \\$(\\d+)$")
    public void iRequest$(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    private class Account {
        public Account(int amount) {
        }
    }
}
