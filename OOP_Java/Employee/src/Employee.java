public abstract class Employee {
    private static int nextId = 1;
    protected int id;
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.id = nextId++;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();
    public abstract String getWorkReport();


    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Calculated Salary: $" + String.format("%.2f", calculateSalary());
    }
}
