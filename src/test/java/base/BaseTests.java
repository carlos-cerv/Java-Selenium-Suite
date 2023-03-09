package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","src/resources/mac/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
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

}
