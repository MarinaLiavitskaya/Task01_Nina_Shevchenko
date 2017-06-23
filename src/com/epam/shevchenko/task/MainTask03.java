package com.epam.shevchenko.task;


import com.epam.shevchenko.beans.RectangularTriangle;
import com.epam.shevchenko.calculator.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;

public class MainTask03 {

	public static void main(String[] args) {

		try {
			RectangularTriangle triangle = NumberParser.toTriangle(args);
			double perimetr = Calculator.calculatePerimetr(triangle.getA(), triangle.getB(), triangle.getC());
			double square = Calculator.calculateSquare(triangle.getA(), triangle.getB());
			System.out.println("Perimetr: " + perimetr + "\nSquare: " + square);
		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
