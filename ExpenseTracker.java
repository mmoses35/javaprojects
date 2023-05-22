import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Expense> expenses = new ArrayList<Expense>();

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("Expense Tracker");
            System.out.println("1. Add an expense");
            System.out.println("2. View expenses");
            System.out.println("3. Quit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("Goodbye!");
    }

    private static void addExpense() {
        System.out.print("Enter a description: ");
        String description = input.next();

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        Expense expense = new Expense(description, amount);
        expenses.add(expense);

        System.out.println("Expense added.");
    }

    private static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        System.out.println("Expenses:");

        for (int i = 0; i < expenses.size(); i++) {
            Expense expense = expenses.get(i);
            System.out.printf("%d. %s: $%.2f%n", i + 1, expense.getDescription(), expense.getAmount());
        }
    }
}

class Expense {
    private String description;
    private double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

