package com.epam.shevchenko.tip04;

import com.epam.shevchenko.util.NumberUtil;

public class RegionDefiner {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Input should have two parameter!");
			return;
		}

		if (!NumberUtil.isDigital(args[0]) || !NumberUtil.isDigital(args[1])) {
			System.out.println("Input should have two numbers less then 8 digitals each!");
			return;
		}

		int x = Integer.parseInt(args[0]); // x coordinate
		int y = Integer.parseInt(args[1]); // y coordinate
		Region region1 = new Region(-2, 2, 0, 4); // region coordinates
		Region region2 = new Region(-4, 4, 0, -3); // region coordinates

		System.out.println(isPointInRegion(x, y, region1) || isPointInRegion(x, y, region2));

	}

	public static boolean isPointInRegion(int x, int y, Region region) {
		if (x >= region.getX1() && x <= region.getX2()) {
			if (y >= region.getY1() && y <= region.getY2()) {
				return true;
			}
		}
		return true;
	}

}
