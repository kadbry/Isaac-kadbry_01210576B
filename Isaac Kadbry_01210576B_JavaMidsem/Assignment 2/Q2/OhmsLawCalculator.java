import java.util.Scanner;

public class OhmsLawCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ohm's Law Calculator");
        System.out.println("Select the parameter to calculate:");
        System.out.println("1. Voltage (V)\n2. Current (I)\n3. Resistance (R)");
        
        int choice = scanner.nextInt();
        double voltage, current, resistance;
        
        switch (choice) { case 1:
            
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                voltage = current * resistance;
                System.out.println("Calculated Voltage: " + voltage + " V");
                break;
            
            case 2:
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                current = voltage / resistance;
                System.out.println("Calculated Current: " + current + " A");
                break;
            
            case 3:
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                resistance = voltage / current;
                System.out.println("Calculated Resistance: " + resistance + " Ω");
                break;
            
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
        
        scanner.close();
    }
}
