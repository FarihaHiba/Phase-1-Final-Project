package com.slearn.finalproject;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OptionSelectionClass {
	
	static String path="C:\\Users\\Fariha\\Desktop\\Phase1 Final Project Folder\\";
	static Scanner sc=new Scanner(System.in);
	
	public static void optionSelection() throws IOException {
		System.out.println("Select the required option\n1. Get file names in ascending order\n2. Business Level Operation\n3. Close the Application");
		int option=sc.nextInt();
		if(option==1) OptionSelectionClass.sortFiles();
		else if(option==2) BusinessOperationsClass.businessOperations();
		else if(option==3) System.exit(1);
		else System.out.println("Kindly select an option from below");
	}
	
	public static void sortFiles() {
		File file=new File(path);
		File[] fileList=file.listFiles();
		Arrays.sort(fileList);
		for(File eachFile:fileList) System.out.println(eachFile.getName());
	}
	

}
