public class Main {
    public static void main(String[] args) {
        Company company = new Company("Tech Corp", 10);

        company.addEmployee(new Manager("Alice", 7000, 1500));
        company.addEmployee(new Developer("Bob", 5000, 20, 25));
        company.addEmployee(new Developer("Charlie", 5500, 10, 30));
        company.addEmployee(new Manager("Diana", 8000, 2000));
        company.addEmployee(new Developer("Eve", 4800, 30, 22));

        company.displayAllEmployees();

        System.out.println("\nTotal Payroll: $" + company.getTotalPayroll());

        Employee top = company.findHighestPaidEmployee();
        System.out.println("Highest Paid Employee: " + top);

        company.generateWorkReports();
    }
}