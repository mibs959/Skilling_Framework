package Page_Model_Object.Page;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;

/**
 * Created by martin959 on 08/02/2017.
 */
public class SignUpPage extends NavigationUtilities {

    // Locators

    private final By WELCOME_MESSAGE_POP_UP = By.xpath("//span[contains(.,'Welcome to Skilling - Your Skilling account has been created')]");

    private final By SIGN_UP_WITH_BANK_ID_BUTTON = By.id("continueBankId");

    private final By SIGN_UP_MANUALLY = By.id("continueManualBtn");


    // Interactions

    public boolean isWelcomeMessageDisplayed(){
        return isElementDisplayed(WELCOME_MESSAGE_POP_UP);
    }

    public void clickOnSignUpWithBankId(){
        clickOnElement(SIGN_UP_WITH_BANK_ID_BUTTON);
    }

    public void clickOnSignUpManually(){
        clickOnElement(SIGN_UP_MANUALLY);
    }

}
