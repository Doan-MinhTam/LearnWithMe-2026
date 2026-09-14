public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        this.bonus = bonus;
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return  baseSalary + bonus;
    }

    @Override
    public String getWorkReport() {
        return  "Manager " + name + " is managing the team and projects.";
    }
}
