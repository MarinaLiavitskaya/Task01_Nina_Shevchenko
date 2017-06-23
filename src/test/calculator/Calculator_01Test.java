package test.calculator;

import org.testng.annotations.Test;

import com.epam.shevchenko.beans.Point;
import com.epam.shevchenko.beans.Region;
import com.epam.shevchenko.calculator.Calculator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class Calculator_01Test {   // тут 5 метода калькулятора 4 таска
	private long currentTimeMillisBefore;	
	
	@Test(dataProvider = "isFirstSumEqToLastSumProvider")
	public void test_isFirstSum_EqTo_LastSum(int numberToAnalys, boolean expected) {
		boolean actual = Calculator.isFirstSumEqToLastSum(numberToAnalys);
		assertEquals(actual, expected);
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void test_isFirstSum_EqTo_LastSum_WithZero() {
		Calculator.isFirstSumEqToLastSum(0000);
	}

	@Test(dataProvider = "abcProvider", enabled = false)
	public void test_calculate_ComplexFormula(int[] input, double expected) {
		double actual = Calculator.calculateComplexFormula(input);
		assertEquals(actual, expected, 0);
	}
	@Test(dataProvider = "abcForPerimeter", enabled = false)
	public void test_calculate_Perimetr(int a, int b, double c, double expected) {
		double actual = Calculator.calculatePerimetr(a, b, c);
		assertEquals(actual, expected, 0);
	}
	@Test(dataProvider = "abForSquare", enabled = false)
	public void test_calculate_Square(int a, int b, double expected) {
		double actual = Calculator.calculateSquare(a, b);
		assertEquals(actual, expected, 0);
	}
	
	@Test(dataProvider = "isPointinRegion", enabled = false)
	public void test_isPoint_InRegion(Point p, Region region, boolean expected) {
		boolean actual = Calculator.isPointInRegion(p, region);
		assertEquals(actual, expected);
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}
	
	@DataProvider
	public Object[][] isFirstSumEqToLastSumProvider() {
		return new Object[][] {
			new Object[] { 3333, true },
			new Object[] { 1111, true },
			new Object[] { 1001, true },
			new Object[] { 0704, false },
			new Object[] { 4157, false },
			new Object[] { 0000, true },                // bug
			new Object[] { Integer.MIN_VALUE, true },
			new Object[] { Integer.MAX_VALUE, false },
		};
	}

	@DataProvider
	public Object[][] abcProvider() {
		return new Object[][] {
			new Object[] { new int[] {3, 2, 4}, -106.214816241512 },
			new Object[] { new int[] {3, 4, 8}, -213.50699912595695 },
			new Object[] { new int[] {-5, -2, 3}, Double.NaN},
			new Object[] { new int[] {01, 01, 02}, 1 },
			new Object[] { new int[] {01, 1111, 02}, 1109.001800987263 },
			new Object[] { new int[] {-1, 2, 3}, Double.NaN },
			new Object[] { new int[] {0, 0, 0},  Double.NaN },
			new Object[] { new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE},  Double.NEGATIVE_INFINITY },
			new Object[] { new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},  -2.1267647892944573E37 },
			};
	}
	
	@DataProvider
	public Object[][] abcForPerimeter() {
		return new Object[][] {
			new Object[] { 1, 2, 3, 6.0 },
			new Object[] { 2, 3, 4, 9.0 },
			new Object[] { 0, 0, 0, 0.0 },
			new Object[] { -2, -1, 4, 1 },
			new Object[] { -5, 7, 6, 8.0 },
			new Object[] { Integer.MIN_VALUE, Integer.MIN_VALUE, Double.MIN_VALUE, 4.9E-324 },
			new Object[] { Integer.MAX_VALUE, Integer.MAX_VALUE, Double.MAX_VALUE, 1.7976931348623157E308 },
		};
	}
	
	@DataProvider
	public Object[][] abForSquare() {
		return new Object[][] {
			new Object[] { 3, 2, 3.0 },
			new Object[] { 1, 1, 0 },
			new Object[] { 0, 0, 0.0 },
			new Object[] { -1, 3, -1.0 },
			new Object[] { -3, -7, 10.0 },
			new Object[] { Integer.MIN_VALUE, Integer.MIN_VALUE, 0.0 },
			new Object[] { Integer.MAX_VALUE, Integer.MAX_VALUE, 0.0 },
		};
	}
	
	@DataProvider
	public Object[][] isPointinRegion() {
		return new Object[][] {
			new Object[] { new Point(1, 1), new Region(-2, 2, 0, 4), true },
			new Object[] { new Point(-3, 1), new Region(-2, 2, 0, 4), false },
			new Object[] { new Point(1, 5), new Region(-2, 2, 0, 4), false },
			new Object[] { new Point(0, 0), new Region(-2, 2, 0, 4), true },
			new Object[] { new Point(-4, -2), new Region(-4, 4, -3, 0), true },
			new Object[] { new Point(-5, -1), new Region(-4, 4, -3, 0), false },
			new Object[] { new Point(-5, -1), new Region(-4, 4, -3, 0), false },
			new Object[] { new Point(0, 0), new Region(-4, 4, -3, 0), true },
		};
	}

	@BeforeClass
	public void beforeClass() {
		currentTimeMillisBefore = System.currentTimeMillis();
		System.out.println("BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println(System.currentTimeMillis() - currentTimeMillisBefore);
		System.out.println("AfterClass");
	}

}
