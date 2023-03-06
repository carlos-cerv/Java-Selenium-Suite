package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main (String[]args){
        System.setProperty("webdriver.chrome.driver","/Users/carlos.eduardo/IdeaProjects/qa-automation/src/resources/mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }

}
