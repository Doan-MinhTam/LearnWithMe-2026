import java.util.ArrayList;

public class ExpenseTracker {
    ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void showExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expense found");
        } else {
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    public double getTotalExpenses() {
        double totalExpenses = 0.0;
        for (int i = 0; i < expenses.size(); i++) {
           totalExpenses += expenses.get(i).getAmount();
        }
        return totalExpenses;
    }

    public void removeExpense(int index) {
        try {
            expenses.remove(index);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    public void showExpensesByCategory(String category) {
        int matchedExpense = 0;
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getCategory().equals(category)) {
                System.out.println(expenses.get(i));
                matchedExpense++;
            }
        }
        if (matchedExpense == 0) {
            System.out.println("No category match");
        }
    }
    public void editExpense(int index, String newDes,double newAmount,String newCate) {
        expenses.get(index).updateExpense(newDes, newAmount, newCate);
        expenses.get(index).updateExpense(newDes, newAmount, newCate);
        expenses.get(index).updateExpense(newDes, newAmount, newCate);
    }
}
