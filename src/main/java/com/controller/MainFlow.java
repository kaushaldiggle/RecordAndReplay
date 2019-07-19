package com.controller;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.browser.automation.SeleniumOperation;
import com.browser.communication.CommunicationOperation;
import com.google.gson.JsonObject;


public class MainFlow {

	public static void main(String[] args) throws MalformedURLException, FileNotFoundException {
		String operation="record";//<record> and <replay>
		if(operation.equals("record")) {
			new TestRecord().startTestRecord();
		}else {
			//TODO replay

		}
	}

}
