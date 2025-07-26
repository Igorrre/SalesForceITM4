package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    private final By TITLE = By.xpath("//button[@title='App Launcher']");
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    // Пока нигде не используется
    public void openAccountsPage() {

        driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
        driver.findElement(By.xpath("//a[@data-label='Sales Console']")).click();
    }
}