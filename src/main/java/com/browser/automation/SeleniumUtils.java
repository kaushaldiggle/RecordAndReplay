package com.browser.automation;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

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
	public String getDataFromResource(String fileName) {
		 
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		//InputStream inputStream = classloader.getResourceAsStream(fileName);
		return new BufferedReader(new InputStreamReader(classloader.getResourceAsStream(fileName)))
				  .lines().collect(Collectors.joining("\n"));
	}
}
