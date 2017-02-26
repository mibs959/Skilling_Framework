package Page_Model_Object.Model;

import Page_Model_Object.Components.HeaderComponent;

/**
 * Created by martin on 24/02/2017.
 */
public class HeaderModel extends HeaderComponent{

    public void logOut(){
        clickOnUsername();
        clickOnLogout();
    }

    public void goToProfile(){
        clickOnUsername();
        clickOnProfile();
    }

}
