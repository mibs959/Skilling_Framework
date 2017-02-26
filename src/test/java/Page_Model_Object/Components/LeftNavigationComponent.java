package Page_Model_Object.Components;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;


public class LeftNavigationComponent extends NavigationUtilities {

    // Locators
    private final By LOGO = By.cssSelector(".menuLeft .navbar-brand");

    private final By DASHBOARD = By.xpath("//menu//span[contains(.,'Dashboard')]");

    private final By DEPOSIT = By.xpath("//menu//span[contains(.,'Deposit')]");

    private final By WITHDRAWALS = By.xpath("//menu//span[contains(.,'Withdrawals')]");

    private final By ACADEMY = By.xpath("//menu//span[contains(.,'Academy')]");

    private final By HELP = By.xpath("//menu//span[contains(.,'Help')]");



    // Interactions
    public void clickOnLogo(){
        clickOnElement(LOGO);
    }

    public void clickOnDashboard(){
        clickOnElement(DASHBOARD);
    }

    public void clickOnDeposit(){
        clickOnElement(DEPOSIT);
    }

    public void clickOnWithdrawals(){
        clickOnElement(WITHDRAWALS);
    }

    public void clickOnAcademy(){
        clickOnElement(ACADEMY);
    }

    public void clickOnHelp(){
        clickOnElement(HELP);
    }

}
