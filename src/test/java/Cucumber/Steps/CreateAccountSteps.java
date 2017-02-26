package Cucumber.Steps;

import Page_Model_Object.Model.CreateAccountModel;
import Properties.PropertyReader;
import cucumber.api.java.en.And;

/**
 * Created by martin959 on 12/02/2017.
 */
public class CreateAccountSteps extends CreateAccountModel{

    PropertyReader propertyReader = new PropertyReader();


    @And("user set '(.*)' as Email on Create Account page")
    public void setEmailField(final String emailField) {
        setEmailAddress(emailField);
    }

    @And("user set a random email as Email on Create Account page")
    public void setRandomEmailField() {
        setOnEmailFieldRandomUsername();
    }


    @And("user set '(.*)' as Password on Create Account page")
    public void setPasswordField(final String passwordField) {
        setPassword(passwordField);
    }

    @And("user clicks on 'Create Account' from Create Account page")
    public void clickOnCreateAccountButton() {
        clickOnCreateAccount();
    }



}
