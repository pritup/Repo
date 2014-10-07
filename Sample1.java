package Sample_TypicalCaptureGroup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.DateFormat;
public class Sample1
{

	@Given("I am available on \"(.+)\"")
	public void I_am_available_on(List<String> days)
	{
		System.out.println(days);
	    // Do something with the days
	}
//	@When("^Date is (.+)$")
//	public void Datet(String Date)
//	{
//		System.out.println(Date);
//	    // Do something with the days
//	}
//	@When("^Date is (.+)$")
//	public void Datet1(@DateFormat("yyyy-MM-dd") Date date)
//	{
//		System.out.println();
//	    // Do something with the days
//	}
}
