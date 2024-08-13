public class LogicalOperations {
    public static boolean conjunction(boolean A, boolean B) {
        return A && B;
    }

    public static boolean disjunction(boolean A, boolean B) {
        return A || B;
    }

    public static boolean negation(boolean A) {
        return !A;
    }

    // If A is true then B should be true (when A is false there's no constraints on B)
    public static boolean implication(boolean A, boolean B) {
        //https://www.reddit.com/r/mathematics/comments/191taes/why_is_b_a_true_when_b_is_false_and_a_is_true/
        if (A) {
            if (B) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
    }

    // If A B both are true then true, if A B both are false then true as well
    public static boolean biconditional(boolean A, boolean B) {
        return A == B;
    }

    // Method to generate the truth table
    public static void displayTruthTable() {
        System.out.println("A \t\tB \t\tAND \tOR \t\tNOT A \tNOT B \tA -> B \tA <-> B");

        boolean[] values = {false, true};

        for (boolean A : values) {
            for (boolean B : values) {
                System.out.print(A + "\t" + B + "\t");
                System.out.print(conjunction(A, B) + "\t");
                System.out.print(disjunction(A, B) + "\t");
                System.out.print(negation(A) + "\t");
                System.out.print(negation(B) + "\t");
                System.out.print(implication(A, B) + "\t");
                System.out.println(biconditional(A, B));
            }
        }
    }
}
