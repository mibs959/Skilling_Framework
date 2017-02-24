package Steps;

import Model.LoginModel;
import Properties.PropertyReader;
import cucumber.api.java.en.And;

/**
 * Created by martin959 on 12/02/2017.
 */
public class LoginSteps extends LoginModel{

    PropertyReader propertyReader = new PropertyReader();


    @And("user set '(.*)' as Email on Login page")
    public void setEmailField(final String emailField) {
        setEmailAddress(emailField);
    }

    @And("user set '(.*)' as Password on Login page")
    public void setPasswordField(final String passwordField) {
        setPassword(passwordField);
    }

    @And("user logs in with valid credentials")
    public void logInWithValidCredentials() {
        setEmailAddress(propertyReader.validUsername());
        setPassword(propertyReader.validPassword());
        clickOnLogIn();
    }


}
