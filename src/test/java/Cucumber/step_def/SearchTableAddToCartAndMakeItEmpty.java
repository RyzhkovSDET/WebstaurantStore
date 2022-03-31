package Cucumber.step_def;

import Cucumber.pages.CartPage;
import Cucumber.pages.HomePage;
import Cucumber.utilities.BrowserUtils;
import Cucumber.utilities.ConfigurationReader;
import Cucumber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;


public class SearchTableAddToCartAndMakeItEmpty extends BrowserUtils {
    CartPage cart = new CartPage();
    HomePage homePage = new HomePage();


    @Given("user on the WebstaurantStore home page")
    public void user_on_the_webstaurant_store_home_page() {
        Driver.getDriver().get(ConfigurationReader.get("webstaurantStoreUrl"));
    }

    @When("user search {string}")
    public void user_search(String paramForSearch) throws InterruptedException {

        homePage.searchBar.sendKeys(paramForSearch);
        homePage.searchBar.sendKeys(Keys.ENTER);
    }


    @Then("title should be {string} on this page")
    public void title_should_on_this_page(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle().toString();
        Assertions.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("user add on last item to the cart")
    public void user_add_on_last_item_to_the_cart() {
        scrollToElement(homePage.addLastWebElement);
        homePage.addLastWebElement.click();
    }

    @When("user move to Cart")
    public void user_should_see_one_item_in_the_cart() {
        homePage.viewCartButton.click();
    }

    @When("user click on button  Empty Cart")
    public void user_click_on_button_empty_cart() {
        waitForVisibility(cart.makeCartEmptyButton,2);
        cart.makeCartEmptyButton.click();
        waitForVisibility(cart.confirmEmptyCart,2);
        cart.confirmEmptyCart.click();
        homePage.cartButton.click();
    }

    @Then("cart should see massage {string}")
    public void cart_should_see_massage(String expectedText) {
        String actualText = cart.yourCartIsEmptyText.getText().toString();

        Assertions.assertEquals(actualText,expectedText);
    }


}
