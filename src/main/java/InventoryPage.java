import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "[class=\"inventory_list\"]")
    private WebElement inventoryList;

    

    public boolean inventoryListIsDisplayed(){
        return inventoryList.isDisplayed();
    }
}
