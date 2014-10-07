package Sample_TypicalCaptureGroup;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

	@RunWith (Cucumber.class)
	@Cucumber.Options(
	        format = {"html:target1/cucumber-html-report","json-pretty:target1/cucumber-report.json"})
	//@Cucumber.Options(format={"html:output"})
	//@Cucumber.Options(tags={"@WebDriver"})
		public class ExecuteClass 
		{
		
		}
	//http://www.youtube.com/watch?v=RR0LabeUQ88