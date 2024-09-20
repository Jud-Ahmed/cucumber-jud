package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(


// we can give the path to run / faeture 
//features = "src/test/resources/features/",

features ="src/test/resources/features/",
glue = "com.neotech.steps",



dryRun=false
)



public class TestRunner {

	
	
	
}
