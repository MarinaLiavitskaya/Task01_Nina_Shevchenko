package test.util;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.shevchenko.util.NumberUtil;

public class NumberUtilTest {
	
	@Test(dataProvider = "isArgsEnough_with_quantity", enabled = false)
	public void isArgsEnough(String[] input, int quantity) {
		boolean actual = NumberUtil.isArgsEnough(input, quantity);
		Assert.assertTrue(actual);
	}
	
	@Test(dataProvider = "isArgsEnough_with_quantity_negative", enabled = false)
	public void isArgsEnough_negative(String[] input, int quantity) {
		boolean actual = NumberUtil.isArgsEnough(input, quantity);
		Assert.assertFalse(actual);
	}
		
	@Test(dataProvider = "isArgsIntegerDigital", enabled = false)
	public void test_isArgsIntegerDigital(String[] input) {
		boolean actual = NumberUtil.isArgsIntegerDigital(input);
		Assert.assertTrue(actual);
	}
	
	@Test(dataProvider = "isArgsIntegerDigital_negative", enabled = false)
	public void test_isArgsIntegerDigital_negative(String[] expected) {
		boolean actual = NumberUtil.isArgsIntegerDigital(expected);
		Assert.assertFalse(actual);
	}
	
	@Test(expectedExceptions = NullPointerException.class, enabled = false)
	public void test_isArgsIntegerDigital_negative_withNull() {
		NumberUtil.isArgsIntegerDigital(null);
	}
		
	@Test(dataProvider = "isArgsRealNumbers", enabled = false)
	public void test_isArgsRealNumbers(String[] input) {
		boolean actual = NumberUtil.isArgsRealNumbers(input);
		Assert.assertTrue(actual);
	}
	
	@Test(dataProvider = "isArgsRealNumbers_negative", enabled = false)
	public void test_isArgsRealNumbers_negative(String[] expected) {
		boolean actual = NumberUtil.isArgsRealNumbers(expected);
		Assert.assertFalse(actual);
	}
	
	@Test(expectedExceptions = NullPointerException.class, enabled = false)
	public void test_isArgsRealNumbers_negative_withNull() {
		NumberUtil.isArgsRealNumbers(null);
	}
	
	@Test(dataProvider = "isFourDigitalNumber", enabled = false)
	public void test_isFourDigitalNumber(String input) {
		boolean actual = NumberUtil.isFourDigitalNumber(input);
		Assert.assertTrue(actual);
	}
	
	@Test(dataProvider = "isFourDigitalNumber_negative", enabled = false)
	public void test_isFourDigitalNumber_negative(String expected) {
		boolean actual = NumberUtil.isFourDigitalNumber(expected);
		Assert.assertFalse(actual);
	}
	
	@Test(expectedExceptions = NullPointerException.class, enabled = false)
	public void test_isFourDigitalNumber_negative_withNull() {
		NumberUtil.isArgsRealNumbers(null);
	}
		
	@Test(dataProvider = "doesTriangleExist", enabled = false)
	public void test_doesTriangleExist(int a, int b) {
		boolean actual = NumberUtil.doesTriangleExist(a, b);
		Assert.assertTrue(actual);
	}
	
	@Test(dataProvider = "doesTriangleExist_negative", enabled = false)
	public void test_doesTriangleExist_negative(int a, int b) {
		boolean actual = NumberUtil.doesTriangleExist(a, b);
		Assert.assertFalse(actual);
	}
	
	@Test(dataProvider = "sumDigitals", enabled = false)
	public void test_sumDigitals(int a, int expected) {
		int actual = NumberUtil.sumDigitals(a);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(dataProvider = "sumDigitals_negative", enabled = false)
	public void test_sumDigitalst_negative(int a, int expected) {
		int actual = NumberUtil.sumDigitals(a);
		Assert.assertNotEquals(actual, expected);
	}
	
	// ask for
	@Test(enabled = false)
	public void test_positiveNumbers_sortMassive() {
		int [] actual = { 5, 1, 4, 3, 2 };
		int [] expected = { 1, 2, 3, 4, 5 };
		NumberUtil.sortMassive(actual);
		Assert.assertEquals(actual, expected);
		//org.junit.Assert.assertArrayEquals(expected, actual);
	}
	
	@Test(enabled = false)
	public void test_negativeNumbers_sortMassive() {
		int [] actual = { -4, -1, -5, -3, 2, 7, 0 };
		int [] expected = { -5, -4, -3, -1, 0, 2, 7 };
		NumberUtil.sortMassive(actual);
		Assert.assertEquals(actual, expected);
		//org.junit.Assert.assertArrayEquals(expected, actual);
	}
	
	@Test(dataProvider = "arrayToString", enabled = false)		
	public void test_arrayToString(int[][] array, String expected) {
		String actual = NumberUtil.arrayToString(array);
		Assert.assertEquals(actual, expected);		
	}
	
	@Test(dataProvider = "arrayToString_negative", enabled = false)
	public void test_arrayToString_negative(int[][] array, String expected) {
		String actual = NumberUtil.arrayToString(array);		
		Assert.assertNotEquals(actual, expected);
	}			
	
//					private
//	@Test(dataProvider = "isIntegerNumber", enabled = false)
//	public void test_isIntegerNumber(String input) {
//		boolean actual = NumberUtil.isIntegerNumber(input);
//		Assert.assertTrue(actual);
//	}
//	
//	@Test(dataProvider = "isIntegerNumber_negative", enabled = false)
//	public void test_isIntegerNumber_negative(String input) {
//		boolean actual = NumberUtil.isIntegerNumber(input);
//		Assert.assertFalse(actual);
//	}
//	
//	@Test(dataProvider = "isRealNumber", enabled = false)
//	public void test_isRealNumber(String input) {
//		boolean actual = NumberUtil.isRealNumber(input);
//		Assert.assertTrue(actual);
//	}
//	
//	@Test(dataProvider = "isRealNumber_negative", enabled = true)
//	public void test_isRealNumber_negative(String expected) {
//		boolean actual = NumberUtil.isRealNumber(expected);
//		Assert.assertFalse(actual);
//	}
//	
//	@Test(dataProvider = "isArgsEnough", enabled = false)
//	public void test_isArgsEnough_Two(String[] input) {
//		boolean actual = NumberUtil.isArgsEnough(input);
//		Assert.assertTrue(actual);		
//	}
	
	@Test(enabled = false)
	public void test_isArgsEnough_negative() {
		boolean actual = NumberUtil.isArgsEnough(new String[] {});
		Assert.assertFalse(actual);
	}
	// 			------			---------			---------			-----------		DataProvider
	@DataProvider
	public Object[][] isArgsEnough_with_quantity() {
		return new Object[][] {
			new Object[] { new String[] {""}, 1 },   // bug ?
			new Object[] { new String[] {"1"}, 1 },
			new Object[] { new String[] {"-7"}, 1 },
			new Object[] { new String[] {"111", "111", "111"}, 3 },
			new Object[] { new String[] {"w"}, 1 },
			new Object[] { new String[] {"ert"}, 1 },
			};
	}
	
	@DataProvider
	public Object[][] isArgsEnough_with_quantity_negative() {
		return new Object[][] {
			new Object[] { new String[] {"1"}, 2 },
			new Object[] { new String[] {"-7"}, 2 },
			new Object[] { new String[] {"w", "r"}, -2 },
			new Object[] { new String[] {"ert"}, 3 },
			};
	}
	
	@DataProvider
	public Object[][] isArgsIntegerDigital() {
		return new Object[][] {
			new Object[] { new String[] {} },		// bug
			new Object[] { new String[] {"19"} },
			new Object[] { new String[] {"-4"} },
			new Object[] { new String[] {"000"} },
			new Object[] { new String[] {"111", "111", "111"} },			
			};
	}
	
	@DataProvider
	public Object[][] isArgsIntegerDigital_negative() {
		return new Object[][] {
			new Object[] { new String[] {"-2.5"} },
			new Object[] { new String[] {""} },
			new Object[] { new String[] {"1.9"} },
			new Object[] { new String[] {"w"} },
			new Object[] { new String[] {"ert"} },
			};
	}	
	
	@DataProvider
	public Object[][] isArgsRealNumbers() {
		return new Object[][] {			
			new Object[] { new String[] {} },		// bug 
			new Object[] { new String[] {"19"} },
			new Object[] { new String[] {"-4"} },
			new Object[] { new String[] {"-2.5"} },
			new Object[] { new String[] {"1.9"} },
			new Object[] { new String[] {"111", "111", "111"} },
			new Object[] { new String[] {"-005"} },
			new Object[] { new String[] {"009"} },
			};
	}
	
	@DataProvider
	public Object[][] isArgsRealNumbers_negative() {
		return new Object[][] {
			new Object[] { new String[] {""} },
			new Object[] { new String[] {"w"} },
			new Object[] { new String[] {"ert"} },
			new Object[] { new String[] {"000"} },
			};
	}
		
	@DataProvider
	public Object[][] isFourDigitalNumber() {
		return new Object[][] {
			new Object[] {"0111"},
			new Object[] {"1234"},
			new Object[] {"0023"},
			new Object[] {"0005"},
			new Object[] {"1991"},
			};
	}
	
	@DataProvider
	public Object[][] isFourDigitalNumber_negative() {
		return new Object[][] {
			new Object[] {"9"},
			new Object[] {"19"},
			new Object[] {"199"},
			new Object[] {"-1991"},			// ?
			new Object[] {"aaaa"},
			};
	}
		
	@DataProvider
	public Object[][] doesTriangleExist() {
		return new Object[][] {
			new Object[] { 0111, 0111 },
			new Object[] { 1234, 1234 },
			new Object[] { 0005, 0005 },
			new Object[] { 1991, 1991},
			new Object[] { 9, 9 },
			};
	}
	
	@DataProvider
	public Object[][] doesTriangleExist_negative() {
		return new Object[][] {
			new Object[] { 0, 0 },
			new Object[] { -3, -4},
			new Object[] { 00, 00 },
			};
	}

	@DataProvider
	public Object[][] sumDigitals() {
		return new Object[][] {
			new Object[] { 0111, 0111 },	// bug
			new Object[] { 9, 9 },
			new Object[] { 17, 8 },
			new Object[] { 231, 6 },
			new Object[] { -35, 2 },		// bug
			new Object[] { -8, -8 },		// bug			
			};
	}
	
	@DataProvider
	public Object[][] sumDigitals_negative() {
		return new Object[][] {
			new Object[] { 0, 6 },
			new Object[] { -3, -4},
			new Object[] { 5, 11 },
			};
	}	
	
	@DataProvider
	  public Object[][] arrayToString() {
	    return new Object[][] {
	      new Object[] { new int[][] {{1, 2}, {1, 2}}, "12" +"\n" +"12" +"\n" },
		  new Object[] { new int[][] {{1, 2, 2},{1, 2, 2,}}, "122\n122\n" },
		  new Object[] { new int[][] {{1, 2, -2},{1, -2, 2,}}, "12-2\n1-22\n" },
	    };
	  }  
	@DataProvider
	  public Object[][] arrayToString_negative() {
	    return new Object[][] {
	    	 new Object[] { new int[][] {{1, 2, 2},{1, 2, 2,}}, "122\n123" },
	    	 new Object[] { new int[][] {{1, 2, 2},{1, 2, 2,}}, "122\n123" },	    	 
	    };
	  }  
		
	@DataProvider
	  public Object[][] isIntegerNumber() {
	    return new Object[][] {
	      new Object[] { "134" },
		  new Object[] { "90" },
		  new Object[] { "02" },
		  new Object[] { "-6" },
	    };
	  }  
	@DataProvider
	  public Object[][] isIntegerNumber_negative() {
	    return new Object[][] {
	    	 new Object[] { "qw" },
	    	 new Object[] { "1.5" },
	    	 new Object[] { "-6.0" },	 
	    };
	  }  
	
	@DataProvider
	  public Object[][] isRealNumber() {
	    return new Object[][] {
	      new Object[] { "134" },
		  new Object[] { "90" },
		  new Object[] { "02" },
		  new Object[] { "-6" },
		  new Object[] { "1.5" },
	      new Object[] { "-6.0" },
	    };
	  }  
	@DataProvider
	  public Object[][] isRealNumber_negative() {
	    return new Object[][] {
	    	 new Object[] { "qw" },
	    	 new Object[] { "&*?" },
	    	 new Object[] { "2/*4" },   //?		2*4
	    	 new Object[] { "*2*4" },
	    };
	  }
	
	@DataProvider
	public Object[][] isArgsEnough() {
		return new Object[][] {
			new Object[] { new String[] {null} }, // bug ?
			new Object[] { new String[] {""} },
			new Object[] { new String[] {"1"} },
			new Object[] { new String[] {"-7"} },
			new Object[] { new String[] {"111", "111", "111"} },
			new Object[] { new String[] {"w"} },
			new Object[] { new String[] {"ert"} },
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

}
