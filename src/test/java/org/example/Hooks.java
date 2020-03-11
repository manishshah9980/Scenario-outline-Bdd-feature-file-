package org.example;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static com.sun.deploy.cache.Cache.copyFile;
public class Hooks extends Utils
{
    private String timeStamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    // TO OPEN BROWSER
    public void openBrowser() { browserSelector.openBroser(); }

    @After
    // TO CLOSE BROWSER
    public void closeBrowser(Scenario scenario)
    {
        if (scenario.isFailed())
        {
            String screenshotName = scenario.getName().replaceAll("[.,:;?!]", "") + timeStamp + ".png";
            try
            {
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destinationPath = new File(System.getProperty("user.dir") + "/target/Destination/Screenshot/" + screenshotName);
                copyFile(sourcePath, destinationPath);
                scenario.write("!!!!!!!!!!!!...Scenario failed.Please see attached screenshot for the error");
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
            } catch (IOException e)
            {

            }

        }
    }



}
