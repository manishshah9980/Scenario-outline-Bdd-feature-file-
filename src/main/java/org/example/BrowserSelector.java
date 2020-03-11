package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {


    public void openBroser()
    {
        LoadProp loadProp = new LoadProp();
        String browser = loadProp.getProperty("Browser");
        System.out.println("You are using " + browser + "Browser");
     // TO SELECT CHROME BROWSER
        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/Resources/BrowserDriver/chromedriver.exe");
            driver  = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");
        }
        // TO OPEN FIREFOX BROWSER
        else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.firefox.driver", "src/test/Resources/BrowserDriver/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");
        }

        else {
            System.out.println("Please enter valid Browser Name ");

        }

    }

}