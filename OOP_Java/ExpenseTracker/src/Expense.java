public class Expense {
    //Encapsulation: tính đóng gói
    // Object kiểm soát cách dữ liệu bên trong nó được truy cập
    private String description;
    private double amount;
    private String category;

    public Expense(String description, double amount, String category) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        if (description.isBlank() || category.isBlank()) {
            throw new IllegalArgumentException("You must type something");
        }
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}

