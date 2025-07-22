package com.hooks;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.reusable.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookMethods extends BaseClass {
	@Before
	public void beforeHook(Scenario s) {
		String name = s.getName();
		System.out.println(name);
	
		
		
		
	}
	@After
	public void afterHook(Scenario s) {
		if(s.isFailed()) {
			TakesScreenshot t = (TakesScreenshot)driver;
			byte[] screenshotAs = t.getScreenshotAs(OutputType.BYTES);
			s.attach(screenshotAs, "image/png", "is failed");
		}
		
		else {
			TakesScreenshot t = (TakesScreenshot)driver;
			byte[] screenshotAs = t.getScreenshotAs(OutputType.BYTES);
			s.attach(screenshotAs, "image/png", "is passed");
		}
		
	}

}
