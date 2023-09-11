import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertTrue;

public class Header extends BasePage{

    public Header(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenu;

    @FindBy(id = "shopping_cart_container")
    private WebElement cartIcon;

    @FindBy(className = "shopping_cart_badge")
    private WebElement cartBadge;

    public void clickOnBurgerMenu(){
        assertTrue(burgerMenu.isDisplayed());
        burgerMenu.click();
    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }

    public int getCartBadgeQuantity(){
        return parseInt(cartBadge.getText());
    }


}
