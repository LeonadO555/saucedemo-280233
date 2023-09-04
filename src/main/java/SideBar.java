import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class SideBar {
    public SideBar(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="logout_sidebar_link")
    private WebElement logoutLink;

    public void followTheLogoutLink(){
        assertTrue(logoutLink.isDisplayed());
        logoutLink.click();
    }
}
