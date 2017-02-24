package Components;

import Utils.NavigationUtilities;
import org.openqa.selenium.By;


public class ChatComponent extends NavigationUtilities {

    // Locators
    private final By CHAT_BUTTON = By.cssSelector("span[class*='chat']");


    // Interactions
    public void clickOnChatButton(){
        clickOnElement(CHAT_BUTTON);
    }

}
