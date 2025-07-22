package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
                 features = {"src\\test\\resources\\FeatureFile\\LumaLogin.feature",
                		 "src\\test\\resources\\FeatureFile\\OrderHoodie.feature",
                		 "src\\test\\resources\\FeatureFile\\OrderJacketPant.feature"},
                 glue = {"com.stepDefinitions","com.hooks"},
                 plugin = {"html:Reports/LumaHtml.html",
                					"json:JasonReports/LumaJason.json",
                					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 dryRun=false,
               //  publish=true,
                 tags= "@smoke"
            
		
		)
            
public class LumaRunner { 
	

}
