package Page_Model_Object.Model;

import Page_Model_Object.Components.HeaderComponent;
import Page_Model_Object.Page.PersonalInformationPage;

/**
 * Created by martin on 24/02/2017.
 */
public class PersonalInformationModel extends PersonalInformationPage{

    public void setAllFieldsWithValidInput(){
        setFirstName("First Name");
        setLastName("Last Name");
        setYearOfBirth("1980");
        setMonthOfBirth("07");
        setDayOfBirth("11");
        setAddress("This is a valid address 123");
        setPostCode("ABC 123");
        setCity("Malaga");
    }

}
