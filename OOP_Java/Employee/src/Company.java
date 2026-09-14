public class Company {
    private final String companyName;
    private final Employee[] employees;
    private int employeeCount;

    public Company(String companyName, int maxEmployees) {
        this.companyName = companyName;
        this.employees = new Employee[maxEmployees];
        this.employeeCount = 0;
    }

    public void addEmployee (Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("Cannot add more employees. The company is full.");
        }
    }

    public double getTotalPayroll() {
        double total = 0;
        for (int i = 0; i < employeeCount; i++) {
            total += employees[i].calculateSalary();
        }
        return total;
    }

    public Employee findHighestPaidEmployee() {
        if (employeeCount == 0) {
            return null;
        }
        Employee highestSalary = employees[0];
        for (int i = 1; i < employeeCount; i++) {
            if (employees[i].calculateSalary() > highestSalary.calculateSalary()) {
                highestSalary = employees[i];
            }
        }
        return highestSalary;
    }

    public void generateWorkReports() {
        System.out.println("\n--- Work Reports for " + companyName + " ---");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i].getWorkReport());
        }
    }
}
