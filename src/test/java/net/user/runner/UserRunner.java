package net.user.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\vishn\\GitHub\\IETMUser\\src\\test\\java\\net\\user\\features\\EnterIETM.feature",
		glue ="net.ei.user.stepdefinitions",
		dryRun = false,
		monochrome = true,
		publish = true,
		plugin = {"pretty","html:target/IETMReports/IETM.html","junit:target/IETMReports/IETM.json","junit:target/IETMReports/IETM.xml"}
		
	
		
		
		
		
		)








public class UserRunner {

	
	
	
	
}
