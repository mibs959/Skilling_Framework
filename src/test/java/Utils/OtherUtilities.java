package Utils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * Created by martin959 on 12/02/2017.
 */
public class OtherUtilities {


    public String generateRandomAlphaNumericString(int length) {
        String possibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstyxz1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random rnd = new Random();
        while (stringBuilder.length() < length) {
            int index = (int) (rnd.nextFloat() * possibleCharacters.length());
            stringBuilder.append(possibleCharacters.charAt(index));
        }
        String result = stringBuilder.toString();
        return result;
    }

    public String generateRandomNumericString(int length) {
        String possibleCharacters = "1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random rnd = new Random();
        while (stringBuilder.length() < length) {
            int index = (int) (rnd.nextFloat() * possibleCharacters.length());
            stringBuilder.append(possibleCharacters.charAt(index));
        }
        String result = stringBuilder.toString();
        return result;
    }

    public String generateRandomAlphabeticString(int length) {
        String possibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstyxz";
        StringBuilder stringBuilder = new StringBuilder();
        Random rnd = new Random();
        while (stringBuilder.length() < length) {
            int index = (int) (rnd.nextFloat() * possibleCharacters.length());
            stringBuilder.append(possibleCharacters.charAt(index));
        }
        String result = stringBuilder.toString();
        return result;
    }

    public void pressEnterKey() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
    }



}
