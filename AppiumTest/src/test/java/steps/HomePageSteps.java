package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HomePageSteps {

    private AppiumDriver appiumDriver;

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
        appiumDriver = new AppiumDriver(
                new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @And("^I choose to log in using Google$")
    public void iChooseToLogInUsingGoogle() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        appiumDriver.findElement(By.id("sign_in_button")).click();
    }

    @Then("^I see account picker screen with my email address \"([^\"]*)\"$")
    public void iSeeAccountPickerScreenWithMyEmailAddress(String expected) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        Assert.assertEquals("Email id is matched", expected, appiumDriver.findElementsByName(
                "com.google.android.gms:id/account_name"));
    }
}
