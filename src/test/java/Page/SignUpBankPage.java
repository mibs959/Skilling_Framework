package Page;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;

/**
 * Created by martin959 on 08/02/2017.
 */
public class SignUpBankPage extends NavigationUtilities {

    // Locators

    private final By SWEEDEN_BANK_ID = By.cssSelector(".bankIdLogo.b_id-sweden div");

    private final By NORWAY_BANK_ID = By.cssSelector(".bankIdLogo.b_id-norway div");

    private final By REGISTER_MANUALLY_LINK = By.xpath("//a[contains(.,'Register manually')]");


    // Interactions

    public void clickOnSweedenBank(){
        clickOnElement(SWEEDEN_BANK_ID);
    }

    public void clickOnNorwayBank(){
        clickOnElement(NORWAY_BANK_ID);
    }

    public void clickOnRegisterManually(){
        clickOnElement(REGISTER_MANUALLY_LINK);
    }

}
