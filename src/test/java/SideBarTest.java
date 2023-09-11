import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SideBarTest extends BaseTest{

    @Test
    public void allLinksAreDisplayed(){
        //4 asserts
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        Header header = new Header(driver);
        header.clickOnBurgerMenu();
        SideBar sideBar = new SideBar(driver);
        assertTrue(sideBar.allItemsLinkIsDisplayed());
        assertTrue(sideBar.aboutLinkIsDisplayed());
        assertTrue(sideBar.logOutLinkIsDisplayed());
        assertTrue(sideBar.resetAppStateLinkIsDisplayed());
    }

    @Test
    public void resetAppState(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        inventoryPage.clickOnBackPackAddToCart();
        inventoryPage.clickOnTShirtAddToCart();
        Header header = new Header(driver);
        assertEquals(2, header.getCartBadgeQuantity());
        //reset app
        //there is no badge
    }
}
