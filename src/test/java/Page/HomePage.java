package Page;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;


public class HomePage extends NavigationUtilities{

    // Locators
    private final By TRY_FREE_DEMO = By.cssSelector("button[id='get-started-button']"); // Warning: There are 2 identical ID's for "get-started-button"

    private final By LEARN_TO_TRADE = By.cssSelector("button[id='demo-link']"); // Warning: There are 2 identical ID's for "demo-link"

    private final By PLAY_BUTTON = By.cssSelector(".main-playbutton i");

    private final By MAKE_MONEY_PLAY_BUTTON = By.cssSelector("#section_c div[class*='img-container'] .material-icons");

    private final By MAKE_MONEY_READ_MORE = By.cssSelector("#section_c button");

    private final By WORLDS_MARKETS_READ_MORE = By.cssSelector("#section_d button");

    private final By WORLDS_MARKETS_PLAY_BUTTON = By.cssSelector("#section_d div[class*='img-container'] .material-icons");

    private final By ALWAYS_ROOM_SKILLING_PLAY_BUTTON = By.cssSelector("#section_e div[class*='img-container'] .material-icons");

    private final By ALWAYS_ROOM_SKILLING_READ_MORE = By.cssSelector("#section_e button");

    private final By UNNECESSARY_RISK_READ_MORE = By.cssSelector("#section_f button");

    private final By UNNECESSARY_RISK_PLAY_BUTTON = By.cssSelector("#section_f div[class*='img-container'] .material-icons");

    private final By OPEN_DEMO_ACCOUNT_BUTTON = By.cssSelector("#price-1 #price-action");

    private final By OPEN_MICRO_ACCOUNT_BUTTON = By.cssSelector("#price-2 #price-action");

    private final By OPEN_STANDARD_ACCOUNT_BUTTON = By.cssSelector("#price-3 #price-action");

    private final By OPEN_PREMIUM_ACCOUNT_BUTTON = By.cssSelector("#price-4 #price-action");

    private final By GO_TO_SKILLING_ACADEMY_BUTTON = By.cssSelector("#section_i button");








    // Interactions
    public void clickOnTryFreeDemo(){
        clickOnElement(TRY_FREE_DEMO);
    }

    public void clickOnLearnToTrade(){
        clickOnElement(LEARN_TO_TRADE);
    }

    public void clickOnPlay(){
        clickOnElement(PLAY_BUTTON);
    }

    public void clickOnMakeMoneyPlay(){
        clickOnElement(MAKE_MONEY_PLAY_BUTTON);
    }

    public void clickOnMakeMoneyReadMore(){
        clickOnElement(MAKE_MONEY_READ_MORE);
    }

    public void clickOnWorldsMarketsReadMore(){
        clickOnElement(WORLDS_MARKETS_READ_MORE);
    }

    public void clickOnWorldsMarketsPlay(){
        clickOnElement(WORLDS_MARKETS_PLAY_BUTTON);
    }

    public void clickOnAlwaysRoomSkillingPlay(){
        clickOnElement(ALWAYS_ROOM_SKILLING_PLAY_BUTTON);
    }

    public void clickOnAlwaysRoomReadMore(){
        clickOnElement(ALWAYS_ROOM_SKILLING_READ_MORE);
    }

    public void clickOnUnnecessaryRiskReadMore(){
        clickOnElement(UNNECESSARY_RISK_READ_MORE);
    }

    public void clickOnUnnecessaryRiskPlay(){
        clickOnElement(UNNECESSARY_RISK_PLAY_BUTTON);
    }

    public void clickOnOpenDemoAccount(){
        clickOnElement(OPEN_DEMO_ACCOUNT_BUTTON);
    }

    public void clickOnOpenMicroAccount(){
        clickOnElement(OPEN_MICRO_ACCOUNT_BUTTON);
    }

    public void clickOnOpenStandardAccount(){
        clickOnElement(OPEN_STANDARD_ACCOUNT_BUTTON);
    }

    public void clickOnOpenPremiumAccount(){
        clickOnElement(OPEN_PREMIUM_ACCOUNT_BUTTON);
    }

    public void clickOnGoToSkillingAcademy(){
        clickOnElement(GO_TO_SKILLING_ACADEMY_BUTTON);
    }






}
