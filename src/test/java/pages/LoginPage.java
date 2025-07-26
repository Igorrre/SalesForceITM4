package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class LoginPage extends BasePage {
    private final By LOGIN_FIELD = By.id("user-name");
    private final By PASSWORD_FIELD = By.id("password");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public MainPage login() throws InterruptedException {
        driver.findElement(LOGIN_FIELD).sendKeys("tborodich@tms.sandbox");
        driver.findElement(PASSWORD_FIELD).sendKeys("Password003!");
        driver.findElement(By.id("Login")).click();
        sleep(3000);
        return new MainPage(driver);
    }
}