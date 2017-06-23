package com.epam.shevchenko.task;

import com.epam.shevchenko.beans.Point;
import com.epam.shevchenko.beans.Region;
import com.epam.shevchenko.calculator.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;

public class MainTask04 {
	private static Region region1 = new Region(-2, 2, 0, 4); // region coordinates
	private static Region region2 = new Region(-4, 4, -3, 0); // region coordinates

	public static void main(String[] args) {

		try {
			Point p = NumberParser.toPoint(args);
			boolean result = Calculator.isPointInRegion(p, region1) || Calculator.isPointInRegion(p, region2);
			System.out.println(result);
		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}

	}
}
