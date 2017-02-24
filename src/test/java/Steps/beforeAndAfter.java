package Steps;

import Utils.NavigationUtilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by martin on 24/02/2017.
 */
public class beforeAndAfter extends NavigationUtilities{


    @Before
    public void beforeScenario() {

    }

    @After
    public void afterScenario() {
        driver.close();
    }



}
