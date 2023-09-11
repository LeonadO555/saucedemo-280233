import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PurchaseTest extends BaseTest{

    public void successPurchase(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        //purchase

        //"Thank you for your order!" text is displayed
    }

    @Test
    public void checkFinalCost(){
        //sum of all item prices from cart page should be the same
        // with Item total value from checkout step 2 page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        inventoryPage.clickOnBackPackAddToCart();
        inventoryPage.clickOnTShirtAddToCart();
        inventoryPage.clickOnBikeAddToCart();
        Header header = new Header(driver);
        header.clickOnCartIcon();
        CartPage cartPage = new CartPage(driver);
        double totalFromCart = cartPage.getTotalPriceOfAllItems();
        cartPage.clickOnCheckoutButton();
        CheckoutStepOne checkoutStepOne = new CheckoutStepOne(driver);
        checkoutStepOne.enterFirstName("jcdgsh");
        checkoutStepOne.enterLastName("wgfd");
        checkoutStepOne.enterZip("sfsd");
        checkoutStepOne.clickOnContinueButton();
        CheckoutStepTwo checkoutStepTwo = new CheckoutStepTwo(driver);
        assertEquals(totalFromCart, checkoutStepTwo.getItemTotal(), 0);
    }
}
