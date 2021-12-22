package Stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void beforeallscenario() {
	System.setProperty("webdriver.chrome.driver", "C:\\installations\\chromedriver.exe");
	booking.driver = new ChromeDriver();
	booking.driver.get("http://localhost:8081/FlyAway/");
	}

	@After
	public void afterallscenario() {
	// TODO Auto-generated method stub

	}

}
