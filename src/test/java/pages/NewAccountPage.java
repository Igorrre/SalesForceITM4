package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewAccountPage extends BasePage {

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void checkNotification() {
        // Ждем появления уведомления
        String notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-key='success']"))).getText();
        // Проверяем наличие нужной фразы
        assert notification.contains("Test") && notification.contains("was created") :
                "Создание аккаунта не подтверждено: сообщение: " + notification;
    }
}