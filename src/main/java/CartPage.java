import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "cart_item")
    private List<WebElement> items;

    public int getItemsQuantity(){
        return items.size();
    }
}
