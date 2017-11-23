package com.knowledge.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteExternalProgram {

	public static void main(String [] args) throws IOException {
		String [] commandArray = new String[1];
//		commandArray[0] = "D:\\Notepad++\\notepad++.exe";
//		commandArray[1] = "D:\\output\\external.bat";
		commandArray[0] = "D:\\output\\external.bat";
		
		Process process = Runtime.getRuntime().exec(commandArray,null);
		BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream() ));

		String output;
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}
	}
	
}
