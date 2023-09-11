import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest{
    @Test
    public void successLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
    }

    @Test
    public void invalidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("2434534");
        loginPage.clickOnLoginButton();
        assertTrue(loginPage.errorMessageIsDisplayed());
        assertTrue(loginPage.errorMessageHasText(
                "Username and password do not match any user in this service"));
    }

        //locked_out_user
    @Test
    public void lockedOutUser(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        assertTrue(loginPage.errorMessageIsDisplayed());
        assertTrue(loginPage.errorMessageHasText(
                "Sorry, this user has been locked out."));
    }

    //invalid username

//logo, usernames, password
    @Test
    public void elementsAreDisplayed(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logoIsDisplayed();
        loginPage.credIsDisplayed();
        loginPage.passwordsIsDisplayed();
    }

    @Test
    public void successLogOut(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        Header header = new Header(driver);
        header.clickOnBurgerMenu();
        SideBar sideBar = new SideBar(driver);
        //follow the Logout link of side bar
        sideBar.followTheLogoutLink();
        //check that logout is successful
        assertTrue(loginPage.usernameIsDisplayed());
    }
}
