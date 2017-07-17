package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HomePageSteps {
    @When("^I launch Quikr app$")
    public void iLaunchQuikrApp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "4.3");
        capabilities.setCapability("deviceName", "Nexus4");
        capabilities.setCapability("app",
                "C:\\Users\\1111\\IdeaProjects\\AppiumTest\\app\\quikr.apk");
        AppiumDriver appiumDriver = new AppiumDriver(
                new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        throw new PendingException();
    }
}
