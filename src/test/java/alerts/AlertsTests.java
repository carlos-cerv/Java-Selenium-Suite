package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert (){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        alertsPage.getResult();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerPrompt();
        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: " + text);
    }
}
