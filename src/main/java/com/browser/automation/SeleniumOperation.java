package com.browser.automation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumOperation {
	public RemoteWebDriver driver;
	public SeleniumUtils sUtils;
	public  SeleniumOperation(URL seleniumURL) throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		this.driver= new RemoteWebDriver(seleniumURL,capabilities);
		sUtils=new SeleniumUtils(this.driver);
	}

	public void addListners(String downloadFileName) throws IOException {
		//TODO : read the addlistner from resources as input stream
		
		String fileName = "addListners.js";
		//System.out.println(sUtils.getDataFromResource(fileName));
		String script=sUtils.getDataFromResource(fileName);
		script=script.replace("action.json",downloadFileName);
		sUtils.injectJsToBrowser(script);
	}
	public void removeListners() {
		//TODO : read the removeListner from resources as input stream

		String fileName = "removingListners.js";
		sUtils.injectJsToBrowser(sUtils.getDataFromResource(fileName));
	}


}
