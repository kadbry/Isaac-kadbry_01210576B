import java.util.Scanner;

public class DCMotorSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double voltage, backEMF, motorConstant;

        // Input voltage
        System.out.print("Enter applied voltage (V): ");
        voltage = scanner.nextDouble();
        if (voltage <= 0) {
            System.out.println("Error: Voltage must be positive.");
            return;
        }

        // Input back EMF
        System.out.print("Enter back EMF (V): ");
        backEMF = scanner.nextDouble();
        if (backEMF < 0 || backEMF >= voltage) {
            System.out.println("Error: Back EMF must be non-negative and less than applied voltage.");
            return;
        }

        // Input motor constant
        System.out.print("Enter motor constant (V/(rad/s)): ");
        motorConstant = scanner.nextDouble();
        if (motorConstant <= 0) {
            System.out.println("Error: Motor constant must be positive and non-zero.");
            return;
        }

        // Calculate speed in rad/s
        double angularSpeed = (voltage - backEMF) / motorConstant;

        // Convert to RPM
        double speedRPM = angularSpeed * (60 / (2 * Math.PI));

        // Display result
        System.out.printf("The DC motor speed is: %.2f RPM%n", speedRPM);

        scanner.close();
    }
}
