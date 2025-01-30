package currency;

import java.util.Scanner;

public class CurrencyConverter {

    private static final double USD_TO_GHS = 8.0;    
    private static final double EUR_TO_GHS = 9.5;
    private static final double JPY_TO_GHS = 0.06;

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("USD") && toCurrency.equals("GHS")) {
            return amount * USD_TO_GHS;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("GHS")) {
            return amount * EUR_TO_GHS;
        } else if (fromCurrency.equals("JPY") && toCurrency.equals("GHS")) {
            return amount * JPY_TO_GHS;
        } else if (fromCurrency.equals("GHS") && toCurrency.equals("USD")) {
            return amount / USD_TO_GHS;
        } else if (fromCurrency.equals("GHS") && toCurrency.equals("EUR")) {
            return amount / EUR_TO_GHS;
        } else if (fromCurrency.equals("GHS") && toCurrency.equals("JPY")) {
            return amount / JPY_TO_GHS;
        }
        return -1; 
    }
}
