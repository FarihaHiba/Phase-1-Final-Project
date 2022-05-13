package com.slearn.finalproject;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) throws IOException  {
		DeveloperDetailsClass.DeveloperDetails();
		while(true) {
		OptionSelectionClass.optionSelection();
		}
	}
	
}