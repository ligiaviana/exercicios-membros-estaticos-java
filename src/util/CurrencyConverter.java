package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double result (double dollar, double quantity) {
		return (IOF * dollar * quantity) + (dollar * quantity); 
	}

}
