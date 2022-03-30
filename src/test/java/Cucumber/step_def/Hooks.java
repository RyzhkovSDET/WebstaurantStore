package Cucumber.step_def;


import Cucumber.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void tearDownScenario(Scenario scenario){

        //IF MY SCENARIO FAILS
        // TAKE A SCREENSHOT
        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        // ClosedDriver
        //Driver.closeDriver();
    }

}
