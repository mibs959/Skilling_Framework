package Page_Model_Object.Page;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;


public class MyAccountPage extends NavigationUtilities {

    // Locators
    private final By START_TRADING_BUTTON = By.cssSelector("#xIFrame button");


    // Your trading accounts
    private final By DEPOSIT_FUNDS = By.cssSelector("");


    // Skilling Academy
    private final By COURSES_COMPLETED = By.xpath("//td[@class='completed-courses']/../td[@class='completed']");

    private final By LESSONS_COMPLETED = By.cssSelector("//td[@class='completed-lessons']/../td[@class='completed']");

    private final By PORCENTAGE_COMPLETED = By.xpath("//div[contains(@class,'radial-progress data-progress')]");

    private final By NEXT_LESSON = By.xpath("//a[contains(.,'Next lesson')]");

    private final By GO_TO_ACADEMY = By.xpath("//a[contains(.,'Go to Academy')]");


    // Markets Watchlist
    private final By EUR_USD_PRICE = By.xpath("//div[contains(.,'EURUSD')]/../div[@class='price']");

    private final By USD_SEK_PRICE = By.xpath("//div[contains(.,'USDSEK')]/../div[@class='price']");

    private final By EUR_SEK_PRICE = By.xpath("//div[contains(.,'EURSEK')]/../div[@class='price']");

    private final By GOLD_PRICE = By.xpath("//div[contains(.,'GOLD')]/../div[@class='price']");


    //Upcoming events
    private final By ALL_UPCOMING_EVENTS = By.cssSelector("#highImpactEvents .event");

    private final By VIEW_ECONOMIC_CALENDAR = By.xpath("//a[contains(.,'View economic calendar')]");


    // Latest News Stories
    private final By ALL_LATEST_NEWS_STORIES = By.cssSelector("#topNewsStoriesShort .event");

    private final By VIEW_ALL_STORIES = By.xpath("//a[contains(.,'View all stories')]");


    // Skilling Chart of the Day
    private final By SKILLING_CHART_OF_THE_DAY_GRAPH = By.cssSelector("#trading-accounts-card .image");

    private final By SKILLING_CHART_OF_THE_DAY_TEXT = By.cssSelector("#trading-accounts-card .text");

    private final By SKILLING_CHART_OF_THE_DAY_PUBLISH_DATE = By.cssSelector("#trading-accounts-card .publish-footer.helper-text");


    // Ken Veksler weekly analysis
    private final By KEN_VEKSLER_WEEKLY_ANALYSIS = By.cssSelector("#trade-tips-video-card .video-overlay");



    // Interactions
    public void clickOnStartTrading(){
        clickOnElement(START_TRADING_BUTTON);
    }

    public void clickOnDepositFunds(){
        clickOnElement(DEPOSIT_FUNDS);
    }

    public void clickOnNextLesson(){
        clickOnElement(NEXT_LESSON);
    }

    public void clickOnGoToAcademy(){
        clickOnElement(GO_TO_ACADEMY);
    }

    public void clickOnGivenUpcomingEvent(int index){
        driver.findElements(ALL_UPCOMING_EVENTS).get(index -1).click();
    }

    public void clickOnViewEconomicCalendar(){
        clickOnElement(VIEW_ECONOMIC_CALENDAR);
    }

    public void clickOnGivenStory(int index){
        driver.findElements(ALL_LATEST_NEWS_STORIES).get(index -1).click();
    }

    public void clickOnViewAllStories(){
        clickOnElement(VIEW_ALL_STORIES);
    }







}
