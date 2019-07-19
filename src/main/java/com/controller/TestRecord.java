package com.controller;

import java.net.MalformedURLException;
import java.net.URL;

import com.browser.automation.SeleniumOperation;
import com.browser.communication.CommunicationOperation;
import com.google.gson.JsonObject;

public class TestRecord {
	private URL seleniumAddress;
	
	public TestRecord() throws MalformedURLException {
		this.seleniumAddress=new URL("http://localhost:4444/wd/hub");
	}
	
	public void startTestRecord() throws MalformedURLException {
		SeleniumOperation KCBrowser=new SeleniumOperation(seleniumAddress);
		//SeleniumOperation RPBrowser=new SeleniumOperation(seleniumAddress);

		CommunicationOperation co=new CommunicationOperation();

		Boolean terminte=true;
		do {
			//TODO : selecting browser on which operation to be performed
			//initial : KCBrowser

			KCBrowser.addListners();

			JsonObject bresponse=co.getResponseFromBrowser();

			KCBrowser.removeListners
			
			//TODO : processing the bresponse for action and selector

			//TODO : to determine terminate event
			terminte=false;//continous process;

		}while(!terminte);

	}

}
