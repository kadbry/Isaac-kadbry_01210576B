import currency.CurrencyConverter;
import distance.DistanceConverter;
import time.TimeConverter;
import java.util.Scanner;

public class ConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;  

        while (!exit) {
            
            System.out.println("\n===== Converter App =====");
            System.out.println("1. Currency Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Time Converter");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    
                    System.out.println("\n--- Currency Converter ---");
                    System.out.print("Enter amount: ");
                    double currencyAmount = scanner.nextDouble();
                    scanner.nextLine(); 
                    

                    System.out.print("Enter source currency (USD, EUR, JPY, GHS): ");
                    String fromCurrency = scanner.nextLine().toUpperCase();

                    System.out.print("Enter target currency (USD, EUR, JPY, GHS): ");
                    String toCurrency = scanner.nextLine().toUpperCase();

                    double convertedCurrency = CurrencyConverter.convertCurrency(currencyAmount, fromCurrency, toCurrency);
                    System.out.println("Converted Amount: " + convertedCurrency);
                    break;

                case 2:
                    
                    System.out.println("\n--- Distance Converter ---");
                    System.out.print("Enter distance value: ");
                    double distanceValue = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.print("Enter source unit (meter, km, mile): ");
                    String fromDistance = scanner.nextLine().toLowerCase();

                    System.out.print("Enter target unit (meter, km, mile): ");
                    String toDistance = scanner.nextLine().toLowerCase();

                    double convertedDistance = DistanceConverter.convertDistance(distanceValue, fromDistance, toDistance);
                    System.out.println("Converted Distance: " + convertedDistance);
                    break;

                case 3:
                    
                    System.out.println("\n--- Time Converter ---");
                    System.out.print("Enter time value: ");
                    double timeValue = scanner.nextDouble();
                    scanner.nextLine(); 

                    System.out.print("Enter source unit (hours, minutes, seconds): ");
                    String fromTime = scanner.nextLine().toLowerCase();

                    System.out.print("Enter target unit (hours, minutes, seconds): ");
                    String toTime = scanner.nextLine().toLowerCase();

                    double convertedTime = TimeConverter.convertTime(timeValue, fromTime, toTime);
                    System.out.println("Converted Time: " + convertedTime);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("\nExiting the Converter App. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("\nInvalid choice! Please select a valid option.");
            }
        }
        scanner.close();
    }
}