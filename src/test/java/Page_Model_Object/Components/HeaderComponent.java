package Page_Model_Object.Components;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;


public class HeaderComponent extends NavigationUtilities {

    // Locators
    private final By LOGO = By.id("loginButton");

    private final By LOGIN_BUTTON = By.id("loginButton");

    private final By OPEN_ACCOUNT_BUTTON = By.id("createAccountButton");

    private final By CAROUSEL = By.cssSelector(".userHeader .carousel");

    private final By USERNAME = By.id("customerID");

    private final By PROFILE = By.id("profileButton");

    private final By LOGOUT = By.id("logoutButton");


    // Interactions
    public void clickOnTheLogo(){
        clickOnElement(LOGO);
    }

    public void clickLoginButton(){
        clickOnElement(LOGIN_BUTTON);
    }

    public void clickOnOpenAccount(){
        clickOnElement(OPEN_ACCOUNT_BUTTON);
    }

    public boolean isCarouselDisplayed(){
        return isElementDisplayed(CAROUSEL);
    }

    public void clickOnUsername(){
        clickOnElement(USERNAME);
    }

    public boolean isUsernameDisplayed(){
        return isElementDisplayed(USERNAME);
    }

    public void clickOnProfile(){
        clickOnElement(PROFILE);
    }

    public void clickOnLogout(){
        clickOnElement(LOGOUT);
    }
}
