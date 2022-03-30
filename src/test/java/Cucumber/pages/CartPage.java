package Cucumber.pages;

import Cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//div[@class='cartItems']//div[starts-with(@class,'cartItemWrapper cartItemId_id')]")
    public WebElement allItems;
    @FindBy(xpath = "//a[.='Empty Cart']")
    public WebElement makeCartEmptyButton;
    @FindBy(xpath = "//button[.='Empty Cart']")
    public WebElement confirmEmptyCart;
    @FindBy(xpath = "//p[.='Your cart is empty.']")
    public WebElement yourCartIsEmptyText;

}
