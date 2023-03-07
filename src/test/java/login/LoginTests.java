package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

import static junit.framework.Assert.assertEquals;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccesfullLogin(){
        LoginPage loginpage = homePage.clickFormAuthentication();
        loginpage.setUsername("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginpage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert text incorrect");
    }
}
