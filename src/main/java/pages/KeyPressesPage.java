package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickField(String text){
        driver.findElement(inputField).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void enterText(String text){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(inputField).sendKeys();
    }
    public String getResult(){
        return driver.findElement(resultText).getText();
    }

}
