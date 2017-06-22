package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.beans.Region;
import com.epam.shevchenko.calculator.BaseCalculator;

public class RegionDefiner extends BaseCalculator {

	public RegionDefiner(String[] input) {
		this.input = input;
	}

	@Override
	public String calculate() {

		if (!checkTwoDigitalArgs()) {
			message += "Error! Incorrect input!";
			return message;
		}

		int x = Integer.parseInt(input[0]); // x coordinate
		int y = Integer.parseInt(input[1]); // y coordinate
		Region region1 = new Region(-2, 2, 0, 4); // region coordinates
		Region region2 = new Region(-4, 4, -3, 0); // region coordinates

		message += (isPointInRegion(x, y, region1) || isPointInRegion(x, y, region2));
		return message;

	}

	public static boolean isPointInRegion(int x, int y, Region region) {
		if ((x >= region.getX1()) && (x <= region.getX2())) {
			if ((y >= region.getY1()) && (y <= region.getY2())) {
				return true;
			}
		}
		return false;
	}

}
