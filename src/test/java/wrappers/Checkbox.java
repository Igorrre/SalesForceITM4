package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {

    WebDriver driver;
    String span;

    public Checkbox(WebDriver driver, String span) {
        this.driver = driver;
        this.span = span;
    }

    public void check() {
        driver.findElement(
                By.xpath(String.format("//span[text()='%s']//ancestor::lightning-primitive-input-checkbox//input", span))).click();
    }
}