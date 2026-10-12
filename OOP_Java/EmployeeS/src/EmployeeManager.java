import java.util.*;

class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee findEmployeeById(String employeeId) {
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employeeId)) {
                return e;
            }
        }
        return null;
    }

    public List<Employee> searchEmployeesByName(String keyword) {
        List<Employee> result = new ArrayList<>();
        if (keyword == null) return result;
        String key = keyword.toLowerCase();
        for (Employee e : employees) {
            if (e.getName().toLowerCase().contains(key)) {
                result.add(e);
            }
        }
        return result;
    }

    public List<Employee> getEmployeesEligibleForBonus() {
        List<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (e.eligibleForBonus()) {
                result.add(e);
            }
        }
        return result;
    }

    public List<Employee> getTopEmployees(int n) {
        List<Employee> sorted = sortBySalary(false);
        if (n <= 0) return new ArrayList<>();
        if (n >= sorted.size()) return sorted;
        return new ArrayList<>(sorted.subList(0, n));
    }

    public List<Employee> sortBySalary(boolean ascending) {
        List<Employee> sorted = new ArrayList<>(employees);
        int n = sorted.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                double s1 = sorted.get(j).calculateSalary();
                double s2 = sorted.get(j + 1).calculateSalary();
                boolean shouldSwap = ascending ? (s1 > s2) : (s1 < s2);
                if (shouldSwap) {
                    Employee temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j + 1, temp);
                }
            }
        }
        return sorted;
    }

    public List<Employee> sortByName() {
        List<Employee> sorted = new ArrayList<>(employees);
        int n = sorted.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sorted.get(j).getName().compareTo(sorted.get(j + 1).getName()) > 0) {
                    Employee temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j + 1, temp);
                }
            }
        }
        return sorted;
    }

    public double calculateAverageSalary() {
        if (employees.isEmpty()) return 0;
        return calculateTotalPayroll() / employees.size();
    }

    public double calculateTotalPayroll() {
        double total = 0;
        for (Employee e : employees) {
            total += e.calculateSalary();
        }
        return total;
    }
}