package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditorPage();
        editorPage.clearTextArea();
        String text1 = "hello";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(),text1+text2);
    }
}
