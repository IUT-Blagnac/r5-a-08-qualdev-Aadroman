package dojo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

import java.util.List;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void who_wants_to_buy_a_drink(String person){
        order = new Order();
        order.declareOwner(person);
    }
    @When("an order is declared for {string}")
    public void order_declared_for(String person){
        order.declareTarget(person);
    }

    @And("a message saying {string} is added")
    public void aMessageSayingIsAdded(String message){
        order.setMessage(message);
    }

    @Then("there is {int} cocktail in the order")
    public void cocktail_in_the_order(int numb_cocktail){
        order.addCocktail(numb_cocktail);
        List<String> cocktails =  order.getCocktails();
        assertEquals(numb_cocktail, cocktails.size());
    }

    @Then("the ticket must say {string}")
    public void ticketContent(String expected){
        String ticket = order.createTicket();
        assertEquals(ticket, expected);
    }
}

