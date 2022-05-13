package com.slearn.finalproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BusinessOperationsClass {
	
	static String path="C:\\Users\\Fariha\\Desktop\\Phase1 Final Project Folder\\";
	static Scanner sc =new Scanner(System.in);
	
	public static void businessOperations() throws IOException {
		System.out.println("Select the required suboption\n1. Add new file\n2. Delete a file\n3. Search a file\n4. Go back");
		int suboption=sc.nextInt();
		switch (suboption) {
		
		case 1:  BusinessOperationsClass.addFile();
		break;
						 
		case 2:  BusinessOperationsClass.deleteFile();
		break;
				
		case 3: BusinessOperationsClass.searchFile();
		break;
					
		case 4: System.out.println("Went back");
		break;
		}
	}
		
		public static void addFile() throws IOException {
			System.out.println("Enter the file name to be added Eg.\"abc.txt\"");
			String add=sc.next();
			File addFile=new File(path.concat(add));
			if(addFile.createNewFile()) System.out.println("File created successfully");
			else System.out.println("File not created. Check if it already exists.");
		}
		
		public static void deleteFile() {
			System.out.println("Enter the file name to be deleted Eg.\"abc.txt\"");
			String delete=sc.next();
			File deleteFile=new File(path.concat(delete));
			if(deleteFile.delete()) System.out   .println("File deleted successfully");
			else System.out.println("File not found");
		}
		
		public static void searchFile() {
			System.out.println("Enter the file name to be searched Eg.\"abc.txt\"");
			String search=sc.next();
			File searchFile=new File(path.concat(search));
			if(searchFile.exists()) System.out.println("File present");
			else System.out.println("File not found");
		}

	}

