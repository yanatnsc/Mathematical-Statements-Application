//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in); //non-static variable scanner cannot be referenced from a static context

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean A = getBooleanInput("Enter value for A (true/false or 1/0): ");
        boolean B = getBooleanInput("Enter value for B (true/false or 1/0): ");

        // Display results of logical operations based on user inputs
        System.out.println("AND: " + LogicalOperations.conjunction(A, B));
        System.out.println("OR: " + LogicalOperations.disjunction(A, B));
        System.out.println("NOT A: " + LogicalOperations.negation(A));
        System.out.println("NOT B: " + LogicalOperations.negation(B));
        System.out.println("A -> B: " + LogicalOperations.implication(A, B));
        System.out.println("A <-> B: " + LogicalOperations.biconditional(A, B));

        // Generate and display the truth table
        System.out.println();
        System.out.println("Truth Table:");
        LogicalOperations.displayTruthTable();

        // Close the scanner
        scanner.close();
    }

    // Method to get boolean input from user
    private static boolean getBooleanInput(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.next();
            if (input.equalsIgnoreCase("true") || input.equals("1")) {
                return true;
            } else if (input.equalsIgnoreCase("false") || input.equals("0")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter true/false or 1/0.");
            }
        }
    }
}