package org.howard.edu.lsp.midterm.question2;

/**
 * The RangeTester class is used to test the functionality of the IntegerRange class.
 */
public class RangeTester {
    /**
     * The main method creates instances of IntegerRange and tests their functionality.
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Create two IntegerRange instances
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);

        // Test the contains method of range1
        System.out.println("Expected: true, Actual: " + range1.contains(5));
        // Test the contains method of range1
        System.out.println("Expected: false, Actual: " + range1.contains(15));
        // Test the overlaps method of range1 with range2
        System.out.println("Expected: true, Actual: " + range1.overlaps(range2));
        // Test the size method of range1
        System.out.println("Expected: 10, Actual: " + range1.size());
        // Test the equals method of range1 with range2
        System.out.println("Expected: false, Actual: " + range1.equals(range2));
    }
}