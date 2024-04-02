package org.howard.edu.assignment5;

import java.util.ArrayList;


public class Driver {
    public static void main(String[] args) throws IntegerSetException {
        IntegerSet SetA1 = new IntegerSet();
        SetA1.add(1);
        SetA1.add(2);
        SetA1.add(3);
        System.out.println("Set 1: " + SetA1.toString()); // Expected: 123

        // Test constructor with initialized ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        IntegerSet SetB1 = new IntegerSet(list);
        System.out.println("Set 2: " + SetB1.toString()); // Expected: 345

        // Test clear method
        SetA1.clear();
        System.out.println("Set 1 after clear: " + SetA1.toString()); // Expected: Empty

        // Test length method
        System.out.println("Length of Set 2: " + SetB1.length()); // Expected: 3

        // Test equals method
        System.out.println("Set 1 equals Set 2: " + SetA1.equals(SetB1)); // Expected: false

        // Test contains method
        System.out.println("Set 2 contains 4: " + SetB1.contains(4)); // Expected: true

        // Test largest method
        System.out.println("Largest element in Set 2: " + SetB1.largest()); // Expected: 5

        // Test smallest method
        System.out.println("Smallest element in Set 2: " + SetB1.smallest()); // Expected: 3

        // Test remove method
        SetB1.remove(4);
        System.out.println("Set 2 after removing 4: " + SetB1.toString()); // Expected: 35
    	
        // Test Case 1: SetA
        System.out.println("\nIndividual Tests on Each Method");
        System.out.println("\nCaseI:");
        IntegerSet SetA = new IntegerSet();
        SetA.add(1);
        SetA.add(2);
        SetA.add(3);
        System.out.print("SetA: ");
        SetA.toString();
        System.out.println("\nSmallest value in SetA: " + SetA.smallest());
        System.out.println("Largest value in SetA: " + SetA.largest());

        // Test Case 2: SetB
        System.out.println("\nTest Case 2:");
        IntegerSet SetB = new IntegerSet();
        SetB.add(3);
        SetB.add(4);
        SetB.add(5);
        System.out.print("SetB: ");
        SetB.toString();

        // Test Case 3: Union of SetA and SetB
        System.out.println("\nTest Case 4:");
        SetA.clear(); // Clear SetA for union test
        SetA.add(1);
        SetA.add(2);
        SetA.add(3);
        System.out.print("SetA: ");
        SetA.toString();
        System.out.println("\nUnion of SetA and SetB");
        SetA.union(SetB);
        System.out.print("Result: ");
        SetA.toString();
        
        // Test Case 4: Intersection of SetA and SetB
        System.out.println("\nTest Case 3:");
        System.out.println("Intersection of SetA and SetB");
        SetA.intersect(SetB);
        System.out.print("Result: ");
        SetA.toString();

        // Test Case 5: Difference of SetA and SetB
        System.out.println("\nTest Case 5:");
        SetA.clear(); // Clear SetA for difference test
        SetA.add(1);
        SetA.add(2);
        SetA.add(3);
        System.out.print("SetA: ");
        SetA.toString();
        System.out.println("\nDifference of SetA and SetB");
        SetA.diff(SetB);
        System.out.println("Result: " + SetA.toString());

        // Test Case 6: Complement of SetA with respect to SetB
        System.out.println("\nTest Case 6:");
        SetA.clear(); // Clear SetA for complement test
        SetA.add(1);
        SetA.add(2);
        SetA.add(3);
        System.out.print("SetA: ");
        SetA.toString();
        System.out.println("\nComplement of SetA with respect to SetB");
        SetA.complement(SetB);
        System.out.println("Result: " + SetA.toString());

        // Test Case 7: Testing equals method
        System.out.println("\nTest Case 7:");
        IntegerSet SetC = new IntegerSet();
        SetC.add(1);
        SetC.add(2);
        SetC.add(3);
        System.out.print("SetA: ");
        SetA.toString();
        System.out.println("\nSetC: " + SetC.toString());
        System.out.print("Are SetA and SetC equal? " + SetA.equals(SetC));

    }
}