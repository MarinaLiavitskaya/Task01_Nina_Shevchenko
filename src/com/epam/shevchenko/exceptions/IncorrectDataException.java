package com.epam.shevchenko.exceptions;

public class IncorrectDataException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String[] input;

	public String[] getInput() {
		return input;
	}

	public IncorrectDataException(String message, String[] input) {
		super(message);
		this.input = input;
	}

}
