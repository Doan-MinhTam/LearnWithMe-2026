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

        }
        return total;
    }
}
