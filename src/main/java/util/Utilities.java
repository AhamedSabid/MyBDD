package util;

import org.openqa.selenium.WebElement;

public class Utilities {

    public void enterText(WebElement we, String text) {
        we.sendKeys(text);
    }

    public void waitForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

}
