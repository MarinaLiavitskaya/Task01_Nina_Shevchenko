package com.epam.shevchenko.tip03;

import com.epam.shevchenko.util.NumberUtil;

public class Triangle {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Input should have two parameter!");
			return;
		}

		if (!NumberUtil.isDigital(args[0]) || !NumberUtil.isDigital(args[1])){
			System.out.println("Input should have two numbers less then 8 digitals each!");
			return;
		}
		
		int a = Integer.parseInt(args[0]); // the first side of a triangle
		int b = Integer.parseInt(args[1]); //the second side of a triangle
		
		if (!doesTriangleExist(a, b)){
			System.out.println("Such triangle doesn't exist.");
			return;
		}
		
		double perimeter = trianglePerimeter (a, b);
		long square = triangleSquare(a, b);
		
		System.out.println("Given triangle: a = " + a + ", b = " + b );
		System.out.println("Perimetr of a triangle = " + perimeter );
		System.out.println("Square of a triangle = " + square );
		
	}

	public static long triangleSquare(int a, int b) {
		return (long)a*b;
		
	}

	public static double trianglePerimeter(int a, int b) {
		return a+b+Math.pow((a*a+b*b), 0.5);
		
	}

	public static boolean doesTriangleExist(int a, int b) {
		if(a > 0 && b > 0){
			return true;
		}
		return false;
	}
	
	

}
