package Cucumber.Steps;

import Page_Model_Object.Model.SignUpBankModel;
import Page_Model_Object.Model.SignUpModel;
import cucumber.api.java.en.And;

/**
 * Created by martin959 on 12/02/2017.
 */
public class SignUpSteps extends SignUpModel{

    @And("user click on sign up with BankId")
    public void signUpWithBankId() {
        clickOnSignUpWithBankId();
    }

    @And("user click on sign up manually")
    public void signUpManually() {
        clickOnSignUpManually();
    }

}
