package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ModalPage {
    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ModalPage(WebDriver driver){
        this.driver = driver;
    }
    public void rightClickInBox(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(box)).perform();
    }
    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }
    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }
}
