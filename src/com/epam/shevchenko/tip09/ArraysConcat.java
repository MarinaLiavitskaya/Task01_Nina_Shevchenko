package com.epam.shevchenko.tip09;

public class ArraysConcat {

	private static int[] array1 = { 2, 5, 8, 10, 6, 2, 40 };
	private static int[] array2 = { 5, 6, 7, 1, 3, 4 };

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Input should have one parameter!");
			return;
		}

		int k = Integer.parseInt(args[0]);

		if (k < 0) {
			System.out.println("Input should be a natural number!");
			return;
		}

		int[] concatArray = concatArrays(k);
		
		for (int i = 0; i < concatArray.length; i++) {
			System.out.print(concatArray[i] + " ");
		}
		

	}

	private static int[] concatArrays(int k) {
		int[] result = new int[array1.length + array2.length];
		for (int i = 0; i < result.length; i++) {
			if (i < k) {
				result[i] = array1[i];
			} else if(i < k + array2.length){
				result[i] = array2[i-k];
			} else {
				result[i] = array1[i-array2.length];
			}
		}
		return result;
	}

}
