package test.util;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.shevchenko.beans.Point;
import com.epam.shevchenko.beans.RectangularTriangle;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;

public class NumberParserTest {
	
	@Test(dataProvider = "toIntNumbers", enabled = true)
	public void test_toIntNumbers(String[] input, int[] expected) {
		int[] actual = NumberParser.toIntNumbers(input);
		ArrayList<Integer> actualList = convert_intArray_toArryList(actual);
		ArrayList<Integer> expectedList = convert_intArray_toArryList(expected);
		Assert.assertTrue(expectedList.containsAll(actualList));
	}

	@Test(dataProvider = "toIntNumbers_negative", expectedExceptions = IncorrectDataException.class, enabled = true)
	public void test_toIntNumbers_negative(String[] input, int[] expected) {
		NumberParser.toIntNumbers(input);
	}

	@Test(dataProvider = "toIntNumbers_withTwoArgs", enabled = true)
	public void test_toIntNumbers_withTwoArgs(String[] input, int quantity, int[] expected) {
		int[] actual = NumberParser.toIntNumbers(input, quantity);
		ArrayList<Integer> actualList = convert_intArray_toArryList(actual);
		ArrayList<Integer> expectedList = convert_intArray_toArryList(expected);
		Assert.assertTrue(expectedList.containsAll(actualList));
	}

	@Test(dataProvider = "toIntNumbers_negative_withTwoArgs", expectedExceptions = IncorrectDataException.class, enabled = true)
	public void test_toIntNumbers_negative_withTwoArgs(String[] input, int quantity, int[] expected) {
		NumberParser.toIntNumbers(input, quantity);
	}
	
	@Test(dataProvider = "toDoubleNumbers", enabled = true)
	public void test_toDoubleNumbers(String[] input, int quantity, double[] expected) {
		double[] actual = NumberParser.toDoubleNumbers(input, quantity);
		ArrayList<Double> actualList = convert_doubleArray_toArryList(actual);
		ArrayList<Double> expectedList = convert_doubleArray_toArryList(expected);
		Assert.assertTrue(expectedList.containsAll(actualList));
	}

	@Test(dataProvider = "toDoubleNumbers_negative", expectedExceptions = IncorrectDataException.class, enabled = true)
	public void test_toIntNumbers_negative(String[] input, int quantity, double[] expected) {
		NumberParser.toIntNumbers(input, quantity);
	}	
	
	@Test(dataProvider = "toFourDigitalNumber", enabled = true)
	public void test_toDoubleNumbers(String[] input, int expected) {
		int actual = NumberParser.toFourDigitalNumber(input);
		Assert.assertEquals(actual, expected);
	}

	@Test(dataProvider = "toFourDigitalNumber_negative", expectedExceptions = IncorrectDataException.class, enabled = true)
	public void test_toFourDigitalNumber_negative(String[] input, int expected) {
		NumberParser.toFourDigitalNumber(input);
	}
	
	@Test(dataProvider = "toTriangle")
	public void test_toTriangle(String[] input, RectangularTriangle expected) {
		RectangularTriangle actual = NumberParser.toTriangle(input);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(dataProvider = "toTriangle_negative")
	public void test_toTriangle_negative(String[] input, RectangularTriangle expected) {
		RectangularTriangle actual = NumberParser.toTriangle(input);
		Assert.assertNotEquals(actual, expected);
	}

	@Test(dataProvider = "toTriangle_expectExceptions_negative", expectedExceptions = IncorrectDataException.class)
	public void test_toTriangle_expectExceptions_negative(String[] input, RectangularTriangle expected) {
		NumberParser.toTriangle(input);
	}
		
	@Test(dataProvider = "toPoint", enabled = true)
	public void test_toPoint(String[] input, Point expected) {
		Point actual = NumberParser.toPoint(input);
		Assert.assertTrue(expected.getX() == actual.getX());
		Assert.assertTrue(expected.getY() == actual.getY());
	}

	@Test(dataProvider = "toPoint_negative", expectedExceptions = IncorrectDataException.class, enabled = true)
	public void test_toPoint_negative(String[] input, Point expected) {
		NumberParser.toPoint(input);
	}	

			// 	---		---		---		---		---		---		---		---		---		DataProvider
	  @DataProvider
	  public Object[][] toIntNumbers() {
	    return new Object[][] {
	      new Object[] { new String[] {"1", "2"}, new int[] {1, 2} },
	      new Object[] { new String[] {"0", "-3"}, new int[] {0, -3} },
	    };
	  }
	  
	  @DataProvider
	  public Object[][] toIntNumbers_negative() {
	    return new Object[][] {
	      new Object[] { new String[] {"s", "e"}, new int[] {1, 2} },
	      new Object[] { new String[] {"0", "g"}, new int[] {0, -3} },	     
	    };
	  }	  
	 	
		  @DataProvider
		  public Object[][] toIntNumbers_withTwoArgs() {
		    return new Object[][] {
		      new Object[] { new String[] {"1", "2"}, 2, new int[] {1, 2} },
		      new Object[] { new String[] {"0", "-3"}, 2, new int[] {0, -3} },
		    };
		  }
		  
		  @DataProvider
		  public Object[][] toIntNumbers_negative_withTwoArgs() {
		    return new Object[][] {
		      new Object[] { new String[] {"3", "2"}, 8, new int[] {3, 2} },
		      new Object[] { new String[] {"0", "0"}, 7, new int[] {0, 0} },
		    };
		  }
	  
		  @DataProvider
		  public Object[][] toDoubleNumbers() {
		    return new Object[][] {
		      new Object[] { new String[] {"1", "2"}, 2, new double[] {1, 2} },
		      new Object[] { new String[] {"0", "-3"}, 2, new double[] {0, -3} },		     
		    };
		  }
		  
		  @DataProvider
		  public Object[][] toDoubleNumbers_negative() {
		    return new Object[][] {
		      new Object[] { new String[] {"s", "e"}, -2, new double[] {1, 2} },
		      new Object[] { new String[] {"0", "g"}, 9, new double[] {0, -3} },
		      new Object[] { new String[] {"1", "1", "1"}, 78, new double[] {1, 1, 1} },
		    };
		  }
	  
		  @DataProvider
		  public Object[][] toFourDigitalNumber() {
		    return new Object[][] {
		      new Object[] { new String[] {"1787"}, 1787 },
		      new Object[] { new String[] {"9999"}, 9999 },
		      new Object[] { new String[] {"5131"}, 5131 },
		      new Object[] { new String[] {"0005"}, 0005 },
		    };
		  }
		  
		  @DataProvider
		  public Object[][] toFourDigitalNumber_negative() {
		    return new Object[][] {
		      new Object[] { new String[] {"sjyr"}, 0000 },
		      new Object[] { new String[] {"0"}, 0 },
		      new Object[] { new String[] {"22"}, 22 },
		      new Object[] { new String[] {"333"}, 333 },
		      new Object[] { new String[] {"-5"}, -5 },	
		    };
		  }	  	  
		  
		  @DataProvider
		  public Object[][] toTriangle() {
		    return new Object[][] {
		      new Object[] { new String[] {"2", "2"}, new RectangularTriangle(2, 2) },
		      new Object[] { new String[] {"3", "3"}, new RectangularTriangle(3, 3) },
		      new Object[] { new String[] {"4", "4"}, new RectangularTriangle(4, 4) },
		      new Object[] { new String[] {"1", "1"}, new RectangularTriangle(1, 1) },
		    };
		  }
		  
		  @DataProvider
		  public Object[][] toTriangle_negative() {
		    return new Object[][] {
		    	new Object[] { new String[] {"2", "2"}, new RectangularTriangle(0, 0) },
		      new Object[] { new String[] {"1", "1"}, new RectangularTriangle(5, 5) },
		      new Object[] { new String[] {"2", "3"}, null },
		    };
		  }
		  
		  @DataProvider
		  public Object[][] toTriangle_expectExceptions_negative() {
		    return new Object[][] {
		      new Object[] { new String[] {"sjyr"}, new RectangularTriangle(0, 0) },
		      new Object[] { new String[] {"0"}, new RectangularTriangle(0, 0) },
		      new Object[] { new String[] {"22"}, new RectangularTriangle(0, 0) },
		    };
		  }	
		  		  
		  @DataProvider
		  public Object[][] toPoint() {
		    return new Object[][] {
		      new Object[] { new String[] {"1", "2"}, new Point(1, 2) },
		      new Object[] { new String[] {"0", "-3"}, new Point(0, -3) },
		    };
		  }
		  
		  @DataProvider
		  public Object[][] toPoint_negative() {
		    return new Object[][] {
		      new Object[] { new String[] {"s", "e"}, new Point(1, 2) },
		      new Object[] { new String[] {"0", "g"}, new Point(1, 2) },	     
		    };
		  }
		  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
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
  private ArrayList<Double> convert_doubleArray_toArryList(double[] actual) {		
		Double[] newArray = new Double[actual.length];
		int i = 0;
		for (double value : actual) {
			newArray[i] = Double.valueOf(value);
			i++;
		}
		ArrayList<Double> actualList = new ArrayList<Double>(Arrays.asList(newArray));		
		return actualList;
	}
}
