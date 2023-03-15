package modals;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTests extends BaseTests {

    @Test
    public void modalTestsBox(){
        var modalPage = homePage.clickModalPage();
        modalPage.rightClickInBox();
        String message = modalPage.getPopUpText();
        modalPage.acceptPopUp();
        assertEquals(message,"You selected a context menu");
    }
}
