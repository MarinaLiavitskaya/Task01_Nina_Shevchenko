package test.calculator;

import org.testng.annotations.Test;

import com.epam.shevchenko.calculator.Calculator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class Calculator_02Test {   // тут с 6-го метода 5 таска
	
  @Test(dataProvider = "numbersToExpenent", enabled = false)
  public void test_exponentiateAccordingPositivity(double number, double expected) {
	  double actual = Calculator.exponentiateAccordingPositivity(number);
	  assertEquals(actual, expected, 0);	  
  }  
  
  @Test(dataProvider = "sumTheBiggestAndTheSmallest", enabled = false)
  public void test_sumTheBiggestAndTheSmallest(int[] array, int expected) {
	  int actual = Calculator.sumTheBiggestAndTheSmallest(array);
	  assertEquals(actual, expected, 0);
  }
    
  @Test(dataProvider = "trigonometricFunction", enabled = false)
  public void test_trigonometricFunction(double x, double expected) {
	  double actual = Calculator.trigonometricFunction(x);
	  assertEquals(actual, expected, 0);
  }
  
  @Test(dataProvider = "sumNaturalNumbersMultipleK", enabled = false)
  public void test_sumNaturalNumbersMultipleK(int[] arr, int k, int expected) {
	  int actual = Calculator.sumNaturalNumbersMultipleK(arr, k);
	  assertEquals(actual, expected);
  }
  
  @Test(expectedExceptions = ArithmeticException.class, dataProvider = "sumNaturalNumbersMultipleKWithZero", enabled = false)
  public void test_sumNaturalNumbersMultipleK_WithZero(int[] arr, int k, int expected) {
	  Calculator.sumNaturalNumbersMultipleK(arr, k);	  
  }
  
  @Test(dataProvider = "createMatrix")
  public void test_createMatrix(int k, int[] expected) {
	  int[][] actual = Calculator.createMatrix(k);
	  assertEquals(actual, expected);
  }
    
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] numbersToExpenent() {
    return new Object[][] {
      new Object[] { 1, 1.0 },
      new Object[] { 2, 4.0 },
      new Object[] { -3, 81.0 },
      new Object[] { -5, 625.0 },
      new Object[] { 0, 0.0 },
    };
  }
  
  @DataProvider
  public Object[][] sumTheBiggestAndTheSmallest() {
    return new Object[][] {
      new Object[] { new int[] {1, 2, 3}, 4 },
      new Object[] { new int[] {2, 5, 4}, 6 },
      new Object[] { new int[] {-3, 4, -1}, 1 },      // bug
      new Object[] { new int[] {7, 7, 7}, 14 },
      new Object[] { new int[] {-3, -7, -9}, -12 },
      new Object[] { new int[] {0, 0, 0}, 0 },
      new Object[] { new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE},  0 },
	  new Object[] { new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, -2 },
    };
  }
  
  @DataProvider
  public Object[][] trigonometricFunction() {
    return new Object[][] {
      new Object[] { 0, -1 },
      new Object[] { 1, 1.1242202548207136 },
      new Object[] { -2, 1.480465431295418 },
      new Object[] { 007, 0.2948941726882496 },
      new Object[] { Double.MAX_VALUE, Double.NaN },
	  new Object[] { Double.MAX_VALUE, Double.NaN },
	  new Object[] { Double.NaN, Double.NaN },
	  new Object[] { Double.POSITIVE_INFINITY, Double.NaN },
	  new Object[] { Double.NEGATIVE_INFINITY, Double.NaN },
    };
  }
  
  @DataProvider
  public Object[][] sumNaturalNumbersMultipleK() {
    return new Object[][] {
      new Object[] { new int[] {1, 2, 3}, 4, 0 },
      new Object[] { new int[] {2, 5, 4}, 6, 0 },
      new Object[] { new int[] {-3, 4, -1}, 1, 0 },  
      new Object[] { new int[] {7, 7, 7}, 7, 21 },
      new Object[] { new int[] {-3, -7, -8}, -2, -8 },
      new Object[] { new int[] {0, 0, 0}, 0, 0 },         // bug
      new Object[] { new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE},  0, 0 },    // bug
      new Object[] { new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE},  1, -2147483648 },
	  new Object[] { new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, -2, 0 },
	  new Object[] { new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, 0, 0 },     // bug
    };
  }
  
  @DataProvider
  public Object[][] sumNaturalNumbersMultipleKWithZero() {
    return new Object[][] {     
      new Object[] { new int[] {0, 0, 0}, 0, 0 },
      new Object[] { new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE},  0, 0 },        
	  new Object[] { new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, 0, 0 },
    };
  }
  
  @DataProvider
  public Object[][] createMatrix() {
    return new Object[][] {     
      new Object[] { 1, new int[] {0, 0, 0} },
      new Object[] { 0, new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE} },        
	  new Object[] { 3, new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE} },
    };
  }  
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
