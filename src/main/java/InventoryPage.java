import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class InventoryPage {
    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "[class=\"inventory_list\"]")
    private WebElement inventoryList;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenu;

    @FindBy(className = "inventory_item")
    private List<WebElement> inventoryItems;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> inventoryNames;
    public boolean inventoryListIsDisplayed(){
        return inventoryList.isDisplayed();
    }

    public void clickOnBurgerMenu(){
        assertTrue(burgerMenu.isDisplayed());
        burgerMenu.click();
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
}
