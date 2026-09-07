public class Main {
    public static void main(String[] args) {
        Expense expense = new Expense("Lunch", -4513.123,"Food");
        System.out.println(expense.getAmount());
    }
}