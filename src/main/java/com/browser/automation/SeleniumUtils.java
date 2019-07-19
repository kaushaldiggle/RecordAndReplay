package com.browser.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumUtils {
	private RemoteWebDriver driver;
	public SeleniumUtils(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public void injectJsToBrowser(String script) {
		((JavascriptExecutor) this.driver).executeScript(script);
	}
}
