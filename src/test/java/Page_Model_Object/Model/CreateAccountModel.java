package Page_Model_Object.Model;

import Page_Model_Object.Page.CreateAccountPage;
import Utils.OtherUtilities;
import Utils.TemporaryData;

/**
 * Created by martin on 24/02/2017.
 */
public class CreateAccountModel extends CreateAccountPage{

    OtherUtilities otherUtilities = new OtherUtilities();

    public void setOnEmailFieldRandomUsername(){
        String username = otherUtilities.generateRandomAlphaNumericString(8) + "@testEmail.com";
        setEmailAddress(username);
        TemporaryData.saveData("randomUsername",username);
    }




}
