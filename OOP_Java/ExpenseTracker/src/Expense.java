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

    public void setDescription(String description) {
        if (description.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.description = description;
    }

    public void setAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }

    public void setCategory(String category) {
        if (category.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.category = category;
    }

    public void updateExpense(String description, double amount, String category) {

        // Bước 1: kiểm tra tất cả dữ liệu
        if (description.isBlank()) {
            throw new IllegalArgumentException();
        }

        if (amount <= 0) {
            throw new IllegalArgumentException();
        }

        if (category.isBlank()) {
            throw new IllegalArgumentException();
        }

        // Bước 2: tất cả đều hợp lệ → mới thay đổi object
        this.description = description;
        this.amount = amount;
        this.category = category;
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

