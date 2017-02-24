package Utils;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationUtilities {


    // Here we start the Selenium Web Driver, in this case we will be using Chrome Web Driver.
//    public static WebDriver driver = new ChromeDriver();

    public static WebDriver driver = chromeDriver();

    public static WebDriver chromeDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
        return new ChromeDriver();
    }



    public void navigateToUrl(String url){
        driver.manage().window().maximize();
        waitForPageLoaded();
        driver.get(url);
    }

    public void navigateToHomePage() throws InterruptedException {
        navigateToUrl("https://propero:forex2016@stg.pro.skilling.com");
    }

    /**
     * This method will wait for a given Web Element passed by "By" until its displayed or until 10 seconds have passed.
     * @param by - The BY from the WebElement.
     * @param waitingTime - The waiting time that we want to wait for the element to be present.
     */
    public void waitForElementToDisplayed(By by, int waitingTime){
        (new WebDriverWait(driver, waitingTime))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /**
     * This method will click on any given Element, if it cant be clicked, it will try as a second option to use the
     * JavaScript click.
     * @param by - The "By" value of the WebElement.
     */
    public void clickOnElement(By by){
        try{
            waitForElementToDisplayed(by, 10);
            driver.findElement(by).click();
        }catch (WebDriverException ex){
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", by);
        }
    }

    public void javascriptForceClick(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    public void setTextOnElement(By by, String input){
        driver.findElement(by).sendKeys(input);
    }

    public boolean isElementDisplayed(By by){
        waitForElementToDisplayed(by, 10);
        return driver.findElement(by).isDisplayed();
    }



}
