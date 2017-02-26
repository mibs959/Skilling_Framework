package Page_Model_Object.Page;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;


public class LoginPage extends NavigationUtilities {

    // Locators
    private final By EMAIL_ADDRESS_FIELD = By.cssSelector(".loginWithUsernameAndPassword #email");

    private final By PASSWORD_FIELD = By.cssSelector(".loginWithUsernameAndPassword #password");

    private final By SP_EYE_ELEMENT = By.cssSelector(".material-icons.sp-eye.password");

    private final By LOG_IN_BUTTON = By.id("loginButton");

    private final By FORGOTTEN_PASSWORD = By.xpath("//a[contains(.,'Forgotten password?')]");

    private final By CREATE_ACCOUNT = By.xpath("//a[contains(.,'Create account')]");

    private final By LOG_IN_WITH_BANKID = By.id("registerButton");


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

    public void clickOnLogIn(){
        clickOnElement(LOG_IN_BUTTON);
    }

    public void clickOnForgottenPassword(){
        clickOnElement(FORGOTTEN_PASSWORD);
    }

    public void clickOnCreateAccount(){
        clickOnElement(CREATE_ACCOUNT);
    }

    public void clickOnLogInWithBankId(){
        clickOnElement(LOG_IN_WITH_BANKID);
    }



}
