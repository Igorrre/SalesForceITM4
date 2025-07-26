package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewAccountPage extends BasePage {
    private final By MESSAGE = By.cssSelector("div[data-key='success']");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isElementDisplayed(MESSAGE);
    }
    public boolean checkNotification() {
        // Ждем появления уведомления
        String notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-key='success']"))).getText();
        return notification.contains("Test") && notification.contains("was created");
    }
}