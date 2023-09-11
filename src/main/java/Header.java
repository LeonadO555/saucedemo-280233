import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class Header extends BasePage{

    public Header(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenu;

    @FindBy(id = "shopping_cart_container")
    private WebElement cartIcon;

    public void clickOnBurgerMenu(){
        assertTrue(burgerMenu.isDisplayed());
        burgerMenu.click();
    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }


}
