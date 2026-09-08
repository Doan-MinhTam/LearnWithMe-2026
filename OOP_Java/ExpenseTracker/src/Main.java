import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker expenseTracker = new ExpenseTracker();
        int choice = 1;
        while (choice != 0) {
            System.out.print("===== EXPENSE TRACKER =====\n" +
                    "1. Add expense\n" +
                    "2. Show expenses\n" +
                    "3. Show total\n" +
                    "4. Remove expense\n" +
                    "5. Search by category\n" +
                    "6. Edit expense\n" +
                    "7. Show expenses from [] to []\n" +
                    "0. Exit\n" +
                    "\n" +
                    "Choose an option:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Category: ");
                    String category = scanner.nextLine();

                    System.out.print("Date: ");
                    LocalDate date = LocalDate.parse(scanner.nextLine());
                    try {
                        Expense expense = new Expense(description, amount, category, date);
                        expenseTracker.addExpense(expense);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 2 -> expenseTracker.showExpenses();
                case 3 -> System.out.println("Total Expense is: " + expenseTracker.getTotalExpenses());
                case 4 -> {
                    System.out.println("Which expense you want to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine();
                    expenseTracker.removeExpense(removeIndex);
                }
                case 5 -> {
                    System.out.println("Which category you want to search: ");
                    String category = scanner.nextLine();
                    expenseTracker.showExpensesByCategory(category);
                }
                case 6 -> {
                    System.out.println("Which expence do you want to change?: ");
                    int indexPosition = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("New description: ");
                    String newDes = scanner.nextLine();
                    System.out.println("New amount: ");
                    Double newAmount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("New category: ");
                    String newCate = scanner.nextLine();
                    System.out.println("New date: ");
                    LocalDate newDate = LocalDate.parse(scanner.nextLine());
                    expenseTracker.editExpense(indexPosition - 1, newDes, newAmount, newCate, newDate);
                }
                case 7 -> {
                    System.out.println("Start Date: ");
                    LocalDate startDate = LocalDate.parse(scanner.nextLine());
                    System.out.println("End Date: ");
                    LocalDate endDate = LocalDate.parse(scanner.nextLine());
                    expenseTracker.showExpensesByDate(startDate, endDate);
                }
                case 0 -> System.out.println("EXITed!!");
                default -> System.out.println("Error: Not in range!!!");
            }
        }


        scanner.close();
    }
}