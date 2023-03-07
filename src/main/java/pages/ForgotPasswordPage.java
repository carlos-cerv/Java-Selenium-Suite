package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By forgotPassword = By.id("email");
    private By recoveryButton = By.id("form_submit");
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setForgotEmail (String email){
        driver.findElement(forgotPassword).sendKeys(email);
    }
    public void clickRecoveryButton (){
        driver.findElement(recoveryButton).click();
    }



}
