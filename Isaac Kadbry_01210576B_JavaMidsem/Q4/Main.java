import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empName = input.nextLine();

        System.out.print("Enter Employee ID: ");
        int empId = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter Address: ");
        String address = input.nextLine();

        System.out.print("Enter Mail ID: ");
        String mailId = input.nextLine();

        System.out.print("Enter Mobile No: ");
        String mobileNo = input.nextLine();

        System.out.print("Enter Basic Pay: ");
        double basicPay = input.nextDouble();
        input.nextLine(); 

        System.out.print("Enter Job Title (Programmer, AssistantProfessor, AssociateProfessor, Professor): ");
        String jobTitle = input.nextLine();

        Employee employee = null;

        switch (jobTitle.toLowerCase()) {
            case "programmer":
                employee = new Programmer(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            case "assistantprofessor":
                employee = new AssistantProfessor(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            case "associateprofessor":
                employee = new AssociateProfessor(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            case "professor":
                employee = new Professor(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            default:
                System.out.println("Invalid job title.");
                System.exit(1);
        }

        employee.generatePaySlip();
        input.close();
    }
}
