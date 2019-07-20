package com.browser.communication;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import com.google.gson.JsonObject;

public class CommunicationOperation {
	public int port;
	public int serverUrl;
	private CommunicationUtils cUtils;

	public CommunicationOperation() {
		//TODO : initiate the rest API server at specific port
		this.cUtils=new CommunicationUtils();
		this.port=cUtils.getAvailablePort();
		//TODO : create the serverUrl
	}

	public String getResponseFromBrowser() throws InterruptedException {
		//TODO : wait for the response from the browser
		//TODO : get response from the browser and return it
		Instant start = Instant.now();
		Boolean fileFound=false;
		long timelapse=0;
		String dataFromFile="";
		do {

			fileFound=cUtils.isFilePresent();
			if(fileFound)
				dataFromFile= cUtils.getDataFromFile();
			//System.out.println("File Found : "+ fileFound);
			timelapse = Duration.between(start, Instant.now()).getSeconds();
			//System.out.println("Execution time in seconds: "+ timelapse);
		}while(!fileFound&&timelapse<180);//3 min elapsed for 1 event to record
		cUtils.deleteFileFromDownload();
		return dataFromFile;

	}

	public void closeTheServer() {
		//TODO : to close the server
	}

}
