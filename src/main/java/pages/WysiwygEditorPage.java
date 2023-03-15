package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaceIndentButton = By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(3) div.tox.tox-tinymce:nth-child(3) div.tox-editor-container div.tox-editor-header div.tox-toolbar-overlord div.tox-toolbar__primary div.tox-toolbar__group:nth-child(5) button.tox-tbtn.tox-tbtn--disabled:nth-child(1) > span.tox-icon.tox-tbtn__icon-wrap");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void decreaseIndention(){
        decreaceIndentButton.findElement(driver).click();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }
    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
