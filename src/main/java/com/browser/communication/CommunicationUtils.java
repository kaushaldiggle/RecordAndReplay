package com.browser.communication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.google.gson.JsonObject;

public class CommunicationUtils {
	public int getAvailablePort() {
		// TODO get available port
		return 0000;
	}
	public Boolean isFilePresent() {
		String baseFilePath=System.getProperty("user.dir");
		baseFilePath=baseFilePath.substring(0,baseFilePath.lastIndexOf("/")+1)+"download/action.json";
		//System.out.println(baseFilePath);
		File tempFile = new File(baseFilePath);
		return tempFile.exists();
	}
	public String getDataFromFile() {
		String baseFilePath=System.getProperty("user.dir");
		baseFilePath=baseFilePath.substring(0,baseFilePath.lastIndexOf("/")+1)+"download/action.json";
		File tempFile = new File(baseFilePath);
		//System.out.println(baseFilePath);
		FileReader fr;
		String resourceData="";
		Scanner sc;
		try {
			sc = new Scanner(tempFile);
			while(sc.hasNext())
				resourceData+=sc.nextLine()+"\n";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resourceData;
	}
	public void deleteFileFromDownload() {
		String baseFilePath=System.getProperty("user.dir");
		baseFilePath=baseFilePath.substring(0,baseFilePath.lastIndexOf("/")+1)+"download/action.json";
		File tempFile = new File(baseFilePath);
		if(tempFile.exists())
			try {
				Files.deleteIfExists(Paths.get(baseFilePath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
}
