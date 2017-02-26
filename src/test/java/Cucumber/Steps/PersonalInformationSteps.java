package Cucumber.Steps;

import Page_Model_Object.Model.PersonalInformationModel;
import Page_Model_Object.Model.SignUpModel;
import cucumber.api.java.en.And;

/**
 * Created by martin959 on 12/02/2017.
 */
public class PersonalInformationSteps extends PersonalInformationModel{

    @And("user set '(.*)' as First Name on Personal Information Page")
    public void setFirstNameTo(final String input) {
        setFirstName(input);
    }

    @And("user set '(.*)' as Last Name on Personal Information Page")
    public void setLastNameTo(final String input) {
        setLastName(input);
    }

    @And("user set '(.*)' as Year of Birth on Personal Information Page")
    public void setYearOfBirthTo(final String input) {
        setYearOfBirth(input);
    }

    @And("user set '(.*)' as Month of Birth on Personal Information Page")
    public void setMonthOfBirthTo(final String input) {
        setMonthOfBirth(input);
    }

    @And("user set '(.*)' as Day of Birth on Personal Information Page")
    public void setDayOfBirthTo(final String input) {
        setDayOfBirth(input);
    }

    @And("user set '(.*)' as Nationality on Personal Information Page")
    public void setNationalityTo(final String input) {
        setNationality(input);
    }

    @And("user set '(.*)' as Address on Personal Information Page")
    public void setAddressTo(final String input) {
        setAddress(input);
    }

    @And("user set '(.*)' as Post Code on Personal Information Page")
    public void setPostCodeTo(final String input) {
        setPostCode(input);
    }

    @And("user set '(.*)' as City on Personal Information Page")
    public void setCityTo(final String input) {
        setCity(input);
    }

    @And("user set '(.*)' as Country on Personal Information Page")
    public void setCountryTo(final String input) {
        setCountry(input);
    }

    @And("user set valid inputs on all Personal Information Page fields")
    public void setValidInputsOnAllFields() {
        setAllFieldsWithValidInput();
    }

    @And("user click on 'I declare that Im not a US citizen' checkbox")
    public void clickOnUSZitizenCheckbox() {
        clickOnDeclareNotUsCitizenCheckbox();
    }

    @And("user click on Submit button from Personal Information Page")
    public void clickSubmitButton() {
        clickOnSubmit();
    }

    @And("user click on 'Continue with BankID instead' from Personal Information Page")
    public void clickOnContinuetBankID() {
        clickOnContinueWithBankID();
    }
}
