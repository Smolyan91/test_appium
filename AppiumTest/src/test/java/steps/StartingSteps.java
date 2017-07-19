package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class StartingSteps {

    private AppiumDriverLocalService appiumDriverLocalService;
    @Before
    public void startAppiumServer(){
        appiumDriverLocalService = AppiumDriverLocalService.buildDefaultService();
        appiumDriverLocalService.start();
    }

    @After
    public void stopAppiumServer(){
        appiumDriverLocalService.stop();
    }
}
