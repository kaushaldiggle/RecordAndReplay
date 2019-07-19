package com.browser.automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumOperation {
public RemoteWebDriver driver;
public SeleniumUtils sUtils;
public  SeleniumOperation(URL seleniumURL) throws MalformedURLException {
	 this.driver= new RemoteWebDriver(seleniumURL,DesiredCapabilities.chrome());
	 sUtils=new SeleniumUtils(this.driver);
}

public void addListners() {
	//TODO : read the addlistner from resources as input stream
	String script="";
	sUtils.injectJsToBrowser(script);
}
public void removeListners() {
	//TODO : read the removeListner from resources as input stream
	String script="";
	sUtils.injectJsToBrowser(script);
}


}
