package test.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.epam.shevchenko.calculator.Calculator;

public class Calculator_10TaskJUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		int[][] actual = Calculator.createMatrix(4);
		assertArrayEquals(new int[][] { { 1, 2, 3, 4 }, { 4, 3, 2, 1 }, { 1, 2, 3, 4 }, { 4, 3, 2, 1 } }, actual);
	}

	@Test
	public void test2() {
		int[][] actual = Calculator.createMatrix(2);
		assertArrayEquals(new int[][] { { 1, 2 }, { 2, 1 } }, actual);
	}
	
//	@Test
//	public void test3() {
//		int[][] actual = Calculator.createMatrix(2);
//		int act = 2;
//		assertThat(act, 
//				allOf(
//						is(greaterThan(0)),
//						is(lessThan(3))
//						)
//				);
//	}
}
