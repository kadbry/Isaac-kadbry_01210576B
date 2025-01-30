class Employee {
    String Emp_name;
    int Emp_id;
    String Address;
    String Mail_id;
    String Mobile_no;
    double Basic_Pay;

    Employee(String name, int id, String address, String email, String mobile, double basicPay) {
        this.Emp_name = name;
        this.Emp_id = id;
        this.Address = address;
        this.Mail_id = email;
        this.Mobile_no = mobile;
        this.Basic_Pay = basicPay;
    }

    void generatePaySlip() {
        double DA = 0.97 * Basic_Pay;
        double HRA = 0.10 * Basic_Pay;
        double PF = 0.12 * Basic_Pay;
        double staff_club_fund = 0.001 * Basic_Pay;
        double grossSalary = Basic_Pay + DA + HRA;
        double netSalary = grossSalary - PF - staff_club_fund;

        System.out.println("Pay Slip for " + Emp_name + " (Employee ID: " + Emp_id + ")");
        System.out.println("Address: " + Address);
        System.out.println("Mail ID: " + Mail_id);
        System.out.println("Mobile No: " + Mobile_no);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

