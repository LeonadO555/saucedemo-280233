import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Double.parseDouble;

public class CheckoutStepTwo extends BasePage{

    public CheckoutStepTwo(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "summary_subtotal_label")
    private WebElement itemTotal;


    public double getItemTotal(){
       return parseDouble(itemTotal.getText().
               replace("Item total: $", ""));
    }
}
