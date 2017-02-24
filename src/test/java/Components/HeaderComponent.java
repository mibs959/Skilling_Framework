package Components;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HeaderComponent extends NavigationUtilities {

    // Locators
    private final By LOGO = By.id("loginButton");

    private final By LOGIN_BUTTON = By.id("loginButton");

    private final By OPEN_ACCOUNT_BUTTON = By.id("createAccountButton");


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




}
