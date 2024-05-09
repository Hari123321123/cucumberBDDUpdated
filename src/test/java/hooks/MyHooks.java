package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class MyHooks {
	
	private WebDriver driver;

	@Before
	public void setup() throws Throwable {
		
	
		
		Properties prop = new ConfigReader().intializeProperties();
		driver = DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));int s =prop.size();
		System.out.println(s); 
	
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		String scenarioName = scenario.getName().replaceAll(" ","_");

		if(scenario.isFailed()) {
			
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot,"image/png", scenarioName);
		}
		else
		{
			
			String scenarioName1 = scenario.getName().replaceAll(" ","_");
			
			
				
				byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(srcScreenshot,"image/png", scenarioName1);
		}
		
		driver.quit();
		
	
	}

}
