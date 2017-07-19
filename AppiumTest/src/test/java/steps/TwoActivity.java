package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TwoActivity {

    private AppiumDriver appiumDriver;

    @When("^Открыто приложение TwoActivity$")
    public void openAppTwoActivity() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "4.3");
        capabilities.setCapability("deviceName", "HTC One");
        capabilities.setCapability("app",
                "C:\\Users\\1111\\IdeaProjects\\AppiumTest\\app\\app-debug.apk");
        appiumDriver = new AppiumDriver(
                new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @And("^Нажимаем на кнопку \"([^\"]*)\"$")
    public void clickOnButton(String buttonName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        appiumDriver.findElement(By.id("button_one")).click();
    }

    @Then("^видим текст \"([^\"]*)\"$")
    public void seeActivityText(String textOnActivity) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        String textResult = appiumDriver.findElement(By.id("text_view")).getText();
        Assert.assertEquals("Text is matched", textOnActivity, textResult);
        Thread.sleep(5000);
    }
}
