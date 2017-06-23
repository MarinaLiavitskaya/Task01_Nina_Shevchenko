package com.epam.shevchenko.beans;

public class RectangularTriangle {

	private int a;
	private int b;
	private double c;

	public RectangularTriangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		c = Math.pow((a * a + b * b), 0.5);
	}

	@Override
	public String toString() {
		return "RectangularTriangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		long temp;
		temp = Double.doubleToLongBits(c);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RectangularTriangle other = (RectangularTriangle) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		return true;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
