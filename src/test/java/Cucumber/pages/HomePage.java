package Cucumber.pages;

import Cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public  HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "searchval")
    public WebElement searchBar;
    @FindBy(name = "//button[.='Search']")
    public WebElement searchButton;
    @FindBy(xpath = "//div[@id = 'ProductBoxContainer'][last()]//input[@value='Add to Cart']")
    public WebElement addLastWebElement;
    @FindBy(xpath = "//span[.='Cart']//span")
    public WebElement cartButton;
    @FindBy(xpath = "//a[.='View Cart']")
    public WebElement viewCartButton;






}
