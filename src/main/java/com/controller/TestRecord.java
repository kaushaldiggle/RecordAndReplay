package com.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.browser.automation.SeleniumOperation;
import com.browser.communication.CommunicationOperation;
import com.google.gson.JsonObject;

public class TestRecord {
	private URL seleniumAddress;

	public TestRecord() throws MalformedURLException {
		this.seleniumAddress=new URL("http://localhost:4444/wd/hub");
	}

	public void startTestRecord() throws IOException, InterruptedException {
		SeleniumOperation KCBrowser=new SeleniumOperation(seleniumAddress);
		//SeleniumOperation RPBrowser=new SeleniumOperation(seleniumAddress);

		CommunicationOperation co=new CommunicationOperation();
		int recordSteps=0;
		Boolean terminte=false;
		do {
			//TODO : selecting browser on which operation to be performed
			//initial : KCBrowser
			System.out.println("Start Recording Action "+(++recordSteps));
			KCBrowser.addListners();

			String bresponse=co.getResponseFromBrowser();
			System.out.println("BROWSER RESPONSE : \n[\n"+bresponse+"]");
			KCBrowser.removeListners();
			
			System.out.println("To continue press 'Y' to terminate 'N' : ");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			if((s.toUpperCase()).equals("N"))
				terminte=true;
			//TODO : to determine terminate event
		}while(!terminte);

	}

}
