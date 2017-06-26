package test.calculator;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.shevchenko.calculator.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;

public class Calculator_02Test {   //  с 6-го метода, c 5 таска
	
  @Test(dataProvider = "numbersToExpenent", enabled = true)
  public void test_exponentiateAccordingPositivity(double number, double expected) {
	  double actual = Calculator.exponentiateAccordingPositivity(number);
	  assertEquals(actual, expected, 0);	  
  }  
  
  @Test(dataProvider = "sumTheBiggestAndTheSmallest", enabled = true)
  public void test_sumTheBiggest_AndTheSmallest(int[] array, int expected) {
	  int actual = Calculator.sumTheBiggestAndTheSmallest(array);
	  assertEquals(actual, expected, 0);
  }
    
  @Test(dataProvider = "trigonometricFunction", enabled = true)
  public void test_trigonometricFunction(double x, double expected) {
	  double actual = Calculator.trigonometricFunction(x);
	  assertEquals(actual, expected, 0);
  }  
  
  @Test(dataProvider = "sumNaturalNumbersMultipleK", enabled = true)
  public void test_sumNaturalNumbersMultipleK(int[] arr, int k, int expected) {
	  int actual = Calculator.sumNaturalNumbersMultipleK(arr, k);
	  assertEquals(actual, expected);
  }
    
  @Test(expectedExceptions = ArithmeticException.class, dataProvider = "sumNaturalNumbersMultipleKWithZero", enabled = true)
  public void test_sumNaturalNumbersMultipleK_negative_withZero(int[] arr, int k, int expected) {
	  Calculator.sumNaturalNumbersMultipleK(arr, k);	  
  }
      
  @Test(dataProvider = "concatArrays", enabled = true)
  public void test_length_concatArrays(int[] array1, int[] array2, int k, int[] expected) {
	  int[] actual = Calculator.concatArrays(array1, array2, k);
	  Assert.assertTrue(actual.length == expected.length);
  }
  
  @Test(dataProvider = "concatArrays", enabled = true)
  public void test_inner_concatArrays(int[] array1, int[] array2, int k, int[] expected) {
	  int[] actual = Calculator.concatArrays(array1, array2, k);
	  ArrayList<Integer> actualList = convert_intArray_toArryList(actual);
	  ArrayList<Integer> expectedList = convert_intArray_toArryList(expected);
	  Assert.assertTrue(expectedList.containsAll(actualList));
  }
    
  @Test(enabled = true)      // JUnit 4 
  public void test_inner_JUnit_concatArrays() {
	  int[] actual = Calculator.concatArrays(new int[] {7, 9, 5, 8}, new int[] {1, 2, 3, 4}, 0);
	  org.junit.Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 7, 9, 5, 8}, actual);
  }
  
  @Test(expectedExceptions = IncorrectDataException.class, enabled = true)
  public void test_concatArrays_negative_withOutOfBoundPoint() {
	  Calculator.concatArrays(new int[] {1, 1, 1}, new int[] {2, 2, 2}, 99);
  }
  
  @Test(expectedExceptions = IncorrectDataException.class, enabled = true)
  public void test_concatArrays_negative_withNegative() {
	  Calculator.concatArrays(new int[] {1, 1, 1}, new int[] {2, 2, 2}, -3);
  }
  
  // 10 Task
  @Test(dataProvider = "createMatrix", enabled = true)
  public void test_matrixSize_createMatrix(int k, int[][] expected) {
	  int[][] actual = Calculator.createMatrix(k);
	  Assert.assertTrue(actual.length == expected.length);
	  Assert.assertTrue(actual[0].length == expected[0].length);  
  }
  
  @Test(enabled = true)
  public void test_inner_ArraysDeepEquals_createMatrix() {
	  int[][] actual = Calculator.createMatrix(2);
	  int[][] expected = {{1, 2},{2, 1}};
	  Assert.assertTrue(Arrays.deepEquals(actual, expected));
  }
  
  @Test(enabled = true)
  public void test_inner_ArraysDeepEquals_createMatrix_negative() {
	  int[][] actual = Calculator.createMatrix(2);
	  int[][] expected = {{-1, 2},{3, 1}};
	  Assert.assertFalse(Arrays.deepEquals(actual, expected));
  }
  
  @Test(enabled = true)
  public void test_inner_createMatrix() {
	  int[][] actual = Calculator.createMatrix(8);
	  ArrayList<Integer> actualList = convertMultidimentional_intArray_ToArryList(actual);
	
//	 int[][]expected = {{1, 2},{2, 1}};
//	 int[][]expected = {
//			 {1, 2, 3, 4},
//			 {4, 3, 2, 1},
//			 {1, 2, 3, 4},
//			 {4, 3, 2, 1}};
	 int[][]expected = {
			 {1, 2, 3, 4, 5, 6, 7, 8},
			 {8, 7, 6, 5, 4, 3, 2, 1},
			 {1, 2, 3, 4, 5, 6, 7, 8},
			 {8, 7, 6, 5, 4, 3, 2, 1},
			 {1, 2, 3, 4, 5, 6, 7, 8},
			 {8, 7, 6, 5, 4, 3, 2, 1},
			 {1, 2, 3, 4, 5, 6, 7, 8},
			 {8, 7, 6, 5, 4, 3, 2, 1},
			 };
	 
	 ArrayList<Integer> expectedlList = convertMultidimentional_intArray_ToArryList(expected);	
	 Assert.assertTrue(expectedlList.containsAll(actualList));
  }
    
  @Test(enabled = true)      // JUnit 4  
  public void test_inner_JUnit_createMatrix() {
	  int[][] actual = Calculator.createMatrix(4);
	  org.junit.Assert.assertArrayEquals(new int[][] {
		  {1, 2, 3, 4},
		  {4, 3, 2, 1},
		  {1, 2, 3, 4},
		  {4, 3, 2, 1}
		  }, actual);
  }
      
  @Test(expectedExceptions = IncorrectDataException.class, enabled = true)
  public void test_createMatrix_negative_withZero() {
	  Calculator.createMatrix(0);
  }
  
  @Test(expectedExceptions = IncorrectDataException.class, enabled = true)
  public void test_createMatrix_negative_withOdd() {
	  Calculator.createMatrix(3);
  }
  
  @Test(expectedExceptions = IncorrectDataException.class, enabled = true)
  public void test_createMatrix_negative_withNegative() {
	  Calculator.createMatrix(-2);
  }
  
  //	--	--	--  --	--	--	--	--	--	--	--	--	--	--	DataProviders	
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
      new Object[] { new int[] {-3, 4, -1}, 1 },      //  bug
      new Object[] { new int[] {-8, 11, -2}, 3 },      //  bug
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
      new Object[] { new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE},  1, -2147483648 },
	  new Object[] { new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, -2, 0 },	  
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
  public Object[][] concatArrays() {
    return new Object[][] {
      new Object[] { new int[] {0, 0, 0},  new int[] {0, 0, 0}, 0,  new int[] {0, 0, 0, 0, 0, 0} },
      new Object[] { new int[] {5, 5, 5, 5},  new int[] {0, 0, 0}, 2,  new int[] {5, 5, 0, 0, 0, 5, 5} },
      new Object[] { new int[] {3, 3, 3, 3, 3},  new int[] {6, 6}, 5,  new int[] {3, 3, 3, 3, 3, 6, 6} },
    };
  }
  
  @DataProvider
  public Object[][] createMatrix() {
    return new Object[][] {     
      new Object[] { 2, new int[][] {{1, 2},{2, 1}} },            
	  new Object[] { 4, new int[][] {{1, 2, 3, 4},{4, 3, 2, 1},{1, 2, 3, 4},{4, 3, 2, 1}} },
    };
  }
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  

  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

	private ArrayList<Integer> convertMultidimentional_intArray_ToArryList(int[][] actual) {
		Integer[][] newArray = new Integer[actual.length][actual[0].length];
		int i = 0;
		int ii = 0;
		for (int[] value : actual) {
			for (int val : value) {
				newArray[i][ii] = Integer.valueOf(val);
				ii++;
			}
			ii = 0;
			i++;
		}
		ArrayList<Integer> actualList = new ArrayList<Integer>();
		for (Integer[] arr : newArray) {
			actualList.addAll(Arrays.asList(arr));
		}
		return actualList;
	}

	private ArrayList<Integer> convert_intArray_toArryList(int[] actual) {		
		Integer[] newArray = new Integer[actual.length];
		int i = 0;
		for (int value : actual) {
			newArray[i] = Integer.valueOf(value);
			i++;
		}
		ArrayList<Integer> actualList = new ArrayList<Integer>(Arrays.asList(newArray));		
		return actualList;
	}
}
