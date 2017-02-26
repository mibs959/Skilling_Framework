package Page_Model_Object.Page;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;


public class CreateAccountPage extends NavigationUtilities {

    // Locators

    private final By EMAIL_ADDRESS_FIELD = By.cssSelector(".input #email");

    private final By PASSWORD_FIELD = By.cssSelector(".input #password");

    private final By SP_EYE_ELEMENT = By.cssSelector(".material-icons.sp-eye.password");

    private final By CREATE_ACCOUNT_BUTTON = By.id("continue");

    private final By EMAIL_ALREADY_EXIST = By.xpath("//span[contains(.,'This email address already exists.')]");

    private final By LOGIN = By.id("loginNowBtn");

    private final By RETRY = By.id("reEnterBtn");

    private final By LOGIN_NOW = By.cssSelector("#skillingRouter .link-seaGreen");


    // Interactions

    public void setEmailAddress(String emailAddress){
        setTextOnElement(EMAIL_ADDRESS_FIELD, emailAddress);
    }

    public void setPassword(String password){
        setTextOnElement(PASSWORD_FIELD, password);
    }

    public void clickOnSpEye(){
        clickOnElement(SP_EYE_ELEMENT);
    }

    public void clickOnCreateAccount(){
        clickOnElement(CREATE_ACCOUNT_BUTTON);
    }

    public void clickOnLoginNow(){
        clickOnElement(LOGIN_NOW);
    }

}
