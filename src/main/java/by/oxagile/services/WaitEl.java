package by.oxagile.services;

import by.oxagile.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEl {
    private static final int WAIT_TIMEOUT_SECONDS = 15;
    private static final int WAIT_TIMEOUT_M_SECONDS = 1000;


    public static WebElement $visibility(String by) {
        return new WebDriverWait(DriverSingleton.getDriver(), WAIT_TIMEOUT_SECONDS, WAIT_TIMEOUT_M_SECONDS)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(by)));
    }

    public static WebElement $clickable(String by) {
        return new WebDriverWait(DriverSingleton.getDriver(), WAIT_TIMEOUT_SECONDS, WAIT_TIMEOUT_M_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(by)));
    }

    public static boolean $selectButton(String by) {
        return new WebDriverWait(DriverSingleton.getDriver(), WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions
                        .attributeContains(By.cssSelector(by), "class", "selected"));
    }

}
