package Steps;

import Model.HeaderModel;
import cucumber.api.java.en.And;

/**
 * Created by martin959 on 12/02/2017.
 */
public class HeaderSteps extends HeaderModel{

    @And("user click on the Logo from the Header")
    public void logoClick() {
        clickOnCompanyLogo();
    }

    @And("user click on Log In from the Header")
    public void loginClick() {
        clickOnLogin();
    }

    @And("user click on Open Account from the Header")
    public void openAccountClick() {
        clickOnRegister();
    }

}
