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
}
