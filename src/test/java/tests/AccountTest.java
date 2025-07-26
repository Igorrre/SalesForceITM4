package tests;

import org.testng.annotations.Test;
import pages.MainPage;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() throws InterruptedException {
        loginPage.open();
        loginPage.login();
        mainPage.isPageOpened();
        newAccountModal.openAccountPage();
        softAssert.assertTrue(newAccountModal.isPageOpened());
        newAccountModal.createAccount(
                "Test",
                "+77777777777",
                "Hot",
                "23412",
                "132@gma.com",
                "11",
                "iga",
                "%",
                "100",
                "1",
                "5",
                "ffertggterg",
                "l.;,kmjhngb",
                "Prospect",
                "Banking",
                "Private"
        );
        newAccountModal.saveAccount();
        softAssert.assertTrue(newAccountPage.isPageOpened());
        softAssert.assertTrue(newAccountPage.checkNotification(), "Account was created");
    }
}