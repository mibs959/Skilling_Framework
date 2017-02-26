package Page_Model_Object.Page;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;

/**
 * Created by martin959 on 08/02/2017.
 */
public class PersonalInformationPage extends NavigationUtilities {

    // Locators

    private final By FIRST_NAME = By.id("firstName");

    private final By LAST_NAME = By.id("lastName");

    private final By YEAR_OF_BIRTH = By.id("yearControl");

    private final By MONTH_OF_BIRTH = By.id("monthControl");

    private final By DAY_OF_BIRTH = By.id("dayControl");

    private final By NATIONALITY = By.id("nationality");

    private final By ADDRESS = By.id("streetAddress");

    private final By POST_CODE = By.id("zipCode");

    private final By CITY = By.id("city");

    private final By COUNTRY = By.id("country");

    private final By NOT_US_CITIZEN_CHECKBOX = By.cssSelector("#usCitizen_label .icons");

    private final By SUBMIT_BUTTON = By.id("submit2Btn");

    private final By CONTINUE_WITH_BANKID = By.xpath("//a[contains(.,'Continue with BankID instead')]");



    // Interactions

    public void setFirstName(String input){
        setTextOnElement(FIRST_NAME, input);
    }

    public void setLastName(String input){
        setTextOnElement(LAST_NAME, input);
    }

    public void setYearOfBirth(String input){
        setTextOnElement(YEAR_OF_BIRTH, input);
    }

    public void setMonthOfBirth(String input){
        setTextOnElement(MONTH_OF_BIRTH, input);
    }

    public void setDayOfBirth(String input){
        setTextOnElement(DAY_OF_BIRTH, input);
    }

    public void setNationality(String input){
        setTextOnElement(NATIONALITY, input);
    }

    public void setAddress(String input){
        setTextOnElement(ADDRESS, input);
    }

    public void setPostCode(String input){
        setTextOnElement(POST_CODE, input);
    }

    public void setCity(String input){
        setTextOnElement(CITY, input);
    }

    public void setCountry(String input){
        setTextOnElement(COUNTRY, input);
    }

    public void clickOnDeclareNotUsCitizenCheckbox(){
        clickOnElement(NOT_US_CITIZEN_CHECKBOX);
    }

    public void clickOnSubmit(){
        clickOnElement(SUBMIT_BUTTON);
    }

    public void clickOnContinueWithBankID(){
        clickOnElement(CONTINUE_WITH_BANKID);
    }


}
