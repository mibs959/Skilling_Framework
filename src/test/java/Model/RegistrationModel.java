package Model;

import Page.RegistrationPage;
import Utils.OtherUtilities;

import java.awt.*;

/**
 * Created by martin959 on 12/02/2017.
 */
public class RegistrationModel extends RegistrationPage {

    OtherUtilities ou = new OtherUtilities();


    public void fillPhase1Registration(){
        setEmailField(ou.generateRandomAlphaNumericString(8) + "@domain.com");
        setUsernameField(ou.generateRandomAlphaNumericString(8));
        String password = ou.generateRandomAlphaNumericString(10);
        setPasswordField(password);
        setPasswordRepeatField(password);
        clickTermsAndConditions();
    }

    public void clickNextButton(){
        clickNextButton();
    }

    public void fillPhase2Registration() throws AWTException {
        setFirstNameField(ou.generateRandomAlphabeticString(8));
        setSurnameField(ou.generateRandomAlphabeticString(8));
        setDayOfBirthField("27");
        setMonthOfBirthField("06");
        setYearOfBirthField("1980");
        clickMaleRadioButton();
        setAddressField("Some Street 2313");
        setPostCodeField("RG65SJ");
        setCityField("Buenos Aires");
        setCountryDropdown("Argentina");
        setCurrencyDropdown("POUND STERLING");
        setPhoneNumber("065656565");
    }

    public void clickRegisterNowButton(){
        clickRegisterNowButton();
    }








}
