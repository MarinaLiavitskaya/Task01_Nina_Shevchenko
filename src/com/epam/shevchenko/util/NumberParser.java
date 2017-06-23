package com.epam.shevchenko.util;

import com.epam.shevchenko.beans.FourDigitalNumber;
import com.epam.shevchenko.beans.ThreeIntNumbersObject;
import com.epam.shevchenko.exceptions.IncorrectDataException;

public class NumberParser {

	//for task 01
	public static FourDigitalNumber toFourDigitalNumber(String[] input) {
		
		if (!NumberUtil.checkDigitalArgs(input, 1) || !NumberUtil.isFourDigitalNumber(input[0])) {
			throw new IncorrectDataException("Error. Enter one four-digital positive number.", input);
		}
		 
		return new FourDigitalNumber(Integer.parseInt(input[0]));
	}

	//for task 02
		
	public static ThreeIntNumbersObject toThreeIntNumberObject(String[] input) {
		
		if (!NumberUtil.checkDigitalArgs(input, 3) || !NumberUtil.isNaturalDigitalArgs(input)) {
			throw new IncorrectDataException("Error. Enter three integer number.", input);
		}
	
		return new ThreeIntNumbersObject(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
		 
	}
	
}
