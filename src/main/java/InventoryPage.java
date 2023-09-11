import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class InventoryPage extends BasePage{
    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[class=\"inventory_list\"]")
    private WebElement inventoryList;



    @FindBy(className = "inventory_item")
    private List<WebElement> inventoryItems;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> inventoryNames;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement tShirtAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backPackAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement bikeAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement jacketAddToCartButton;


    @FindBy(xpath = "//div[@class=\"inventory_item\"][3]//div[@class=\"inventory_item_price\"]")
    private WebElement priceOfTShirt;

    public boolean inventoryListIsDisplayed(){
        return inventoryList.isDisplayed();
    }



    public int getItemsQuantity(){
        return inventoryItems.size();
    }

    public boolean allItemsAreDisplayed(){
        boolean displayed = true;
        for (WebElement item :inventoryItems) {
           if (!item.isDisplayed()){
               displayed = false;
           }
        }
        return displayed;
    }

    public boolean allNamesAreNotEmpty(){
        boolean notEmpty = true;
        for (WebElement name: inventoryNames) {
            if (name.getText().isEmpty()){
                 notEmpty = false;
            }
        }
        return notEmpty;
    }

    public boolean allNamesStartsWithSauceLabs(){
        boolean startsWith = true;
        for (WebElement name: inventoryNames) {
            if (!name.getText().startsWith("Sauce Labs")){
                startsWith = false;
            }
        }
        return startsWith;
    }

    public void clickOnTShirtAddToCart(){
        tShirtAddToCartButton.click();
    }
    public void clickOnBackPackAddToCart(){
        backPackAddToCartButton.click();
    }

    public void clickOnBikeAddToCart(){
        bikeAddToCartButton.click();
    }

    public void clickOnJacketAddToCart(){
        jacketAddToCartButton.click();
    }



    public String getPriceOfTShirt(){
        return priceOfTShirt.getText();
    }
}
