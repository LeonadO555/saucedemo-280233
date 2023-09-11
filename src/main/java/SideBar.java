import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class SideBar extends BasePage{
    public SideBar(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "inventory_sidebar_link")
    private WebElement allItemsLink;
    @FindBy(id = "about_sidebar_link")
    private WebElement aboutLink;
    @FindBy(id ="logout_sidebar_link")
    private WebElement logoutLink;
    @FindBy(id = "reset_sidebar_link")
    private WebElement resetAppState;



    public void followTheLogoutLink(){
        assertTrue(logoutLink.isDisplayed());
        logoutLink.click();
    }

    public boolean allItemsLinkIsDisplayed(){
        return allItemsLink.isDisplayed();
    }

    public boolean aboutLinkIsDisplayed(){
        return aboutLink.isDisplayed();
    }

    public boolean logOutLinkIsDisplayed(){
        return logoutLink.isDisplayed();
    }

    public boolean resetAppStateLinkIsDisplayed(){
        return resetAppState.isDisplayed();
    }

}
