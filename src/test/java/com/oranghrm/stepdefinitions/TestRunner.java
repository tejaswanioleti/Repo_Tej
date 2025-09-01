package com.oranghrm.stepdefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\oleti tejaswani\\eclipse-workspace\\Cgi_aug_2025\\src\\test\\resources\\Features1"
,glue= {"com.oranghrm.stepdefinitions"}
,tags="@smoke"
,dryRun=false
,monochrome=true) 
public class TestRunner { 
	
}

 
