package Cucumber.Steps;

import Page_Model_Object.Model.HeaderModel;
import cucumber.api.java.en.And;
import junit.framework.Assert;

/**
 * Created by martin959 on 12/02/2017.
 */
public class HeaderSteps extends HeaderModel{

    @And("user click on the Logo from the Header")
    public void logoClick() {
        clickOnTheLogo();
    }

    @And("user click on Log In from the Header")
    public void loginClick() {
        clickLoginButton();
    }

    @And("user click on Open Account from the Header")
    public void openAccountClick() {
        clickOnOpenAccount();
    }

    @And("username is displayed on header")
    public void usernameIsDisplayedOnHeader() {
        Assert.assertTrue(isUsernameDisplayed());
    }

    @And("user click on Log out")
    public void logOutFromSite() {
        logOut();
    }

}
