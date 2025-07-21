package tests;

import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() throws InterruptedException {
        loginPage.open();
        loginPage.login();
        newAccountModal.openAccountPage();
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
        newAccountPage.checkNotification();
    }
}