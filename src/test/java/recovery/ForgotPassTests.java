package recovery;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

import static  junit.framework.Assert.assertEquals;

public class ForgotPassTests extends BaseTests {

    @Test
    public void testPasswordRecovery(){
        ForgotPasswordPage forgotPassTests = homePage.clickForgotPassword();
        forgotPassTests.setForgotEmail("tau@example.com");
        forgotPassTests.clickRecoveryButton();
        //Note needs to integrate validation to email was sent it succesfully but API is not working for URL TEST
    }

}
