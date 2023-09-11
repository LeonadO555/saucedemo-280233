import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOne extends BasePage{
    public CheckoutStepOne(WebDriver driver) {
      super(driver);
    }

    @FindBy(id = "first-name")
    private  WebElement firstNameInputField;
    @FindBy(id = "last-name")
    private WebElement lastNameInputField;

    @FindBy(id= "postal-code")
    private WebElement zip;

    @FindBy(id = "continue")
    private WebElement continueButton;
    public void enterFirstName(String firstNameValue){
        firstNameInputField.sendKeys(firstNameValue);
    }
    public void enterLastName(String lstNameValue){
        lastNameInputField.sendKeys(lstNameValue);
    }
    public void enterZip(String zipValue){
        zip.sendKeys(zipValue);
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }

}
