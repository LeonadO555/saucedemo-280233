import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CartTest extends BaseTest{

    @Test
    public void successAdding1Item(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        //Add  T-shirt to cart
        inventoryPage.clickOnTShirtAddToCart();
        //Go to cart
        inventoryPage.clickOnCartIcon();
        //assert that quantity of items is 1
        CartPage cartPage = new CartPage(driver);
        assertEquals(1, cartPage.getItemsQuantity());
    }
    @Test
    public void successAdding4Items(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        inventoryPage.clickOnTShirtAddToCart();
        inventoryPage.clickOnBackPackAddToCart();
        inventoryPage.clickOnBikeAddToCart();
        inventoryPage.clickOnJacketAddToCart();
        inventoryPage.clickOnCartIcon();
        CartPage cartPage = new CartPage(driver);
        assertEquals(4, cartPage.getItemsQuantity());
    }
}

