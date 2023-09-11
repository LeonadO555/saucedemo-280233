import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SideBarTest extends BaseTest{

    @Test
    public void allLinksAreDisplayed(){
        //4 asserts
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        inventoryPage.clickOnBurgerMenu();
        SideBar sideBar = new SideBar(driver);
        assertTrue(sideBar.allItemsLinkIsDisplayed());
        assertTrue(sideBar.aboutLinkIsDisplayed());
        assertTrue(sideBar.logOutLinkIsDisplayed());
        assertTrue(sideBar.resetAppStateLinkIsDisplayed());
    }

}