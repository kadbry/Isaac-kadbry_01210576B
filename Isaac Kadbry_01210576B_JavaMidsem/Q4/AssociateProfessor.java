class AssociateProfessor extends Employee {
    double Basic_Pay;

    AssociateProfessor(String Emp_name, int Emp_id, String Address, String Mail_id, String Mobile_no, double Basic_Pay) {
        super(Emp_name, Emp_id, Address, Mail_id, Mobile_no);
        this.Basic_Pay = Basic_Pay;
    }

    void generatePaySlip() {
        double DA = 0.97 * Basic_Pay;
        double HRA = 0.10 * Basic_Pay;
        double PF = 0.12 * Basic_Pay;
        double staff_club_fund = 0.001 * Basic_Pay;
        double gross_salary = Basic_Pay + DA + HRA;
        double net_salary = gross_salary - PF - staff_club_fund;

        System.out.println("Pay Slip for Associate Professor:");
        System.out.println("Name: " + Emp_name);
        System.out.println("ID: " + Emp_id);
        System.out.println("Gross Salary: " + gross_salary);
        System.out.println("Net Salary: " + net_salary);
    }
}
