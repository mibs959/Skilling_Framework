package Page;

import Utils.OtherUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by martin959 on 08/02/2017.
 */
public class RegistrationPage {


    // Page locators

    // Section 1
    @FindBy(css="input[name='email']")
    private WebElement emailField;

    @FindBy(css="input[name='username']")
    private WebElement usernameField;

    @FindBy(css="input[name='password']")
    private WebElement passwordField;

    @FindBy(css="input[name='passwordRepeat']")
    private WebElement passwordRepeatField;

    @FindBy(id="termsAndConditions")
    private WebElement termsAndConditionsCheckbox;

    @FindBy(css=".m-auth-registration__form1 button")
    private WebElement nextButton;



    // Section 2
    @FindBy(css="input[name='firstname']")
    private WebElement firstNameField;

    @FindBy(css="input[name='lastname']")
    private WebElement surnameField;

    @FindBy(id="days")
    private WebElement dayOfBirthField;

    @FindBy(id="months")
    private WebElement monthOfBirthField;

    @FindBy(id="years")
    private WebElement yearOfBirthField;

    @FindBy(id="sexMale")
    private WebElement maleRadioButton;

    @FindBy(id="sexFemale")
    private WebElement femaleRadioButton;

    @FindBy(css="input[name='address']")
    private WebElement addressField;

    @FindBy(css="input[name='postalCode']")
    private WebElement postCodeField;

    @FindBy(css="input[name='city']")
    private WebElement cityField;

    @FindBy(id="countrySelector")
    private WebElement countryDropdown;

    @FindBy(id="currencySelector")
    private WebElement currencyDropdown;

    @FindBy(id="phonePrefix")
    private WebElement phonePrefixDropdown;

    @FindBy(css="input[name='phoneNumber']")
    private WebElement phoneNumber;

    @FindBy(css=".m-auth-registration__form2.is-visible button")
    private WebElement registerNow;


    OtherUtilities ou = new OtherUtilities();

    // Page Interactions

    // Section 1
    public void setEmailField(String input){
        emailField.sendKeys(input);
    }

    public void setUsernameField(String input){
        usernameField.sendKeys(input);
    }

    public void setPasswordField(String input){
        passwordField.sendKeys(input);
    }

    public void setPasswordRepeatField(String input){
        passwordRepeatField.sendKeys(input);
    }

    public void clickTermsAndConditions(){
        termsAndConditionsCheckbox.click();
    }

    public void clickNextButton(){
        nextButton.click();
    }


    // Section 2
    public void setFirstNameField(String input){
        firstNameField.sendKeys(input);
    }

    public void setSurnameField(String input){
        surnameField.sendKeys(input);
    }

    public void setDayOfBirthField(String input){
        dayOfBirthField.sendKeys(input);
    }

    public void setMonthOfBirthField(String input){
        monthOfBirthField.sendKeys(input);
    }

    public void setYearOfBirthField(String input){
        yearOfBirthField.sendKeys(input);
    }

    public void clickMaleRadioButton(){
        maleRadioButton.click();
    }

    public void clickFemaleRadioButton(){
        femaleRadioButton.click();
    }

    public void setAddressField(String input){
        addressField.sendKeys(input);
    }

    public void setPostCodeField(String input){
        postCodeField.sendKeys(input);
    }

    public void setCityField(String input){
        cityField.sendKeys(input);
    }

    public void setCountryDropdown(String input) throws AWTException {
        Select dropdown = new Select(countryDropdown);
        dropdown.selectByVisibleText(input);
        ou.pressEnterKey();
    }

    public void setCurrencyDropdown(String input) throws AWTException {
        Select dropdown = new Select(currencyDropdown);
        dropdown.selectByVisibleText(input);
        ou.pressEnterKey();
    }

    public void setPhonePrefixDropdown(String input){
        Select dropdown = new Select(phonePrefixDropdown);
        dropdown.selectByVisibleText(input);
    }

    public void setPhoneNumber(String input){
        phoneNumber.sendKeys(input);
    }

    public void clickRegisterNowButton(){
        registerNow.click();
    }
}
