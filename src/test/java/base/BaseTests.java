package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/resources/mac/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

        driver.quit();
    }

    //Selenium Chapter 3
    public void exercise1(){
        System.setProperty("webdriver.chrome.driver","src/resources/mac/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(375,812));
        driver.get("https://the-internet.herokuapp.com/");

        //Find Shifting content Link
        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();

        //Find Example Menu Element Link
        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        //Display Size off Menu Elements
        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size());


        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main (String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }


}
