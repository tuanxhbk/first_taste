package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import implementation.Checkout;

import java.util.Hashtable;

import static org.junit.Assert.*;

/**
 * Created by TuanNguyen on 7/1/2016.
 */
public class CheckoutSteps {
    Hashtable<String, Integer> priceList = new Hashtable<String, Integer>();
    Checkout checkout = new Checkout();

    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void thePriceOfAIsC(String itemName, int price) throws Throwable {
        priceList.put(itemName, price);
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        checkout.add(itemCount, priceList.get(itemName));
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}
