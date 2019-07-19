package com.browser.communication;

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

	public JsonObject getResponseFromBrowser() {
		//TODO : wait for the response from the browser
		//TODO : get response from the browser and return it
		return null;
	}

	public void closeTheServer() {
		//TODO : to close the server
	}

}
