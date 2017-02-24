package Steps;

import Utils.NavigationUtilities;
import cucumber.api.java.en.And;

/**
 * Created by martin959 on 12/02/2017.
 */
public class CommonSteps extends NavigationUtilities{

    @And("user goes to Home/Landing page")
    public void navigateToLandingPage() throws InterruptedException {
        navigateToHomePage();
    }

}
