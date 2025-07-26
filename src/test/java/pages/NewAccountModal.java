package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Checkbox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.Textarea;

public class NewAccountModal extends BasePage {
    private final By BUTTON = By.xpath("//button[@name='SaveEdit']");
    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void openAccountPage() {
        driver.get(NEW_ACCOUNT_URL);
    }

    public void createAccount(String name, String phone, String rating, String fax, String website,
                              String number, String accountSite, String symbol, String employees,
                              String revenue, String code, String textBiling, String textShiping,
                              String type, String industry, String ownership
    ) {
        new Picklist(driver, wait, "Rating").select(rating);
        new Picklist(driver, wait, "Type").select(type);
        new Picklist(driver, wait, "Industry").select(industry);
        new Picklist(driver, wait, "Ownership").select(ownership);
        new Input(driver, "Account Name").write(name);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Number").write(number);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(symbol);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(revenue);
        new Input(driver, "SIC Code").write(code);
        new Textarea(driver, "Billing Street").textarea(textBiling);
        new Textarea(driver, "Shipping Street").textarea(textShiping);
        new Checkbox(driver, "VIP Client").check();
        new Checkbox(driver, "TeachMeSkills").check();
    }

    public void saveAccount() {
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    }

    public boolean isPageOpened() {
        return isElementDisplayed(BUTTON);
    }
}