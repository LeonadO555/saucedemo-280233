import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement usernameInputField;

    @FindBy(id = "password")
    private WebElement passwordInputField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(tagName = "h3")
    private WebElement errorMessage;
    @FindBy(className = "login_logo")
    private WebElement logo;

    @FindBy(id ="login_credentials")
    private WebElement loginCreds;

    @FindBy(className = "login_password")
    private WebElement passwords;
    public void enterUsername(String usernameValue){
        usernameInputField.sendKeys(usernameValue);
    }

    public void enterPassword(String passwordValue){
        passwordInputField.sendKeys(passwordValue);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public boolean errorMessageIsDisplayed(){
        return errorMessage.isDisplayed();
    }

    public boolean errorMessageHasText(String expectedText){
        return errorMessage.getText().contains(expectedText);
    }


    public boolean logoIsDisplayed(){
        return logo.isDisplayed();
    }
    public boolean credIsDisplayed(){
        return loginCreds.isDisplayed();
    }
    public boolean passwordsIsDisplayed(){
        return passwords.isDisplayed();
    }

    public boolean usernameIsDisplayed(){
        return usernameInputField.isDisplayed();
    }

    public void successLogin(String usernameValue, String passwordValue){
        enterUsername(usernameValue);
        enterPassword(passwordValue);
        clickOnLoginButton();
    }
}
