package com.epam.shevchenko.tip01;

public class Main {

	public static void main(String[] args) {

		NumberAnalyser analyser = new NumberAnalyser(args);
		
		System.out.println(analyser.analyse());
	}
}
