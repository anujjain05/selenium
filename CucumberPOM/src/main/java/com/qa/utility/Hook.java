package com.qa.utility;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hook extends TestBase{
//	@After
//	public void FailureScreenShot(Scenario scenario) throws Exception
//	{
//		if(scenario.isFailed()){
//			TakesScreenshot scr = (TakesScreenshot)driver;
//			File file = scr.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(file, new File("C:\\Users\\anuj.jain\\workspace\\CucumberPOM\\ScreenShot"+ System.currentTimeMillis() +".jpeg"));
//			}
//	}
	
	
	@After
	public void FailureScreenShot(Scenario scenario) throws Exception
	{
		if(scenario.isFailed()){
			TakesScreenshot scr = (TakesScreenshot)driver;
			final byte[] file = scr.getScreenshotAs(OutputType.BYTES);
			scenario.embed(file, "C:\\Users\\jain.anuj\\git\\selenium\\CucumberPOM\\ScreenShot"+ System.currentTimeMillis() +".jpeg");
//			FileUtils.copyFile(file, new File("C:\\Users\\anuj.jain\\workspace\\CucumberPOM\\ScreenShot"+ System.currentTimeMillis() +".jpeg"));
			}
	}
	
	
		
}
