package org.howard.edu.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

    private IntegerSet integerSet;

    @BeforeEach
    void setUp() {
        integerSet = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear method")
    void testClear() {
        integerSet.add(1);
        integerSet.add(2);
        integerSet.clear();
        assertTrue(integerSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for length method")
    void testLength() {
        integerSet.add(1);
        integerSet.add(2);
        assertEquals(2, integerSet.length());
    }

    @Test
    @DisplayName("Test case for equals method")
    void testEquals() {
        IntegerSet otherSet = new IntegerSet();
        integerSet.add(1);
        integerSet.add(2);
        otherSet.add(2);
        otherSet.add(1);
        assertTrue(integerSet.equals(otherSet));
    }

    @Test
    @DisplayName("Test case for contains method")
    void testContains() {
        integerSet.add(1);
        integerSet.add(2);
        assertTrue(integerSet.contains(2));
    }

    @Test
    @DisplayName("Test case for largest method")
    void testLargest() {
        integerSet.add(1);
        integerSet.add(2);
        assertDoesNotThrow(() -> assertEquals(2, integerSet.largest()));
    }

    @Test
    @DisplayName("Test case for smallest method")
    void testSmallest() {
        integerSet.add(1);
        integerSet.add(2);
        assertDoesNotThrow(() -> assertEquals(1, integerSet.smallest()));
    }

    @Test
    @DisplayName("Test case for add method")
    void testAdd() {
        integerSet.add(1);
        integerSet.add(2);
        assertTrue(integerSet.contains(1));
        assertTrue(integerSet.contains(2));
    }

    @Test
    @DisplayName("Test case for remove method")
    void testRemove() {
        integerSet.add(1);
        integerSet.add(2);
        integerSet.remove(1);
        assertFalse(integerSet.contains(1));
    }

    @Test
    @DisplayName("Test case for union method")
    void testUnion() {
        IntegerSet otherSet = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4)));
        integerSet.add(1);
        integerSet.add(2);
        integerSet.union(otherSet);
        assertTrue(integerSet.contains(1));
        assertTrue(integerSet.contains(2));
        assertTrue(integerSet.contains(3));
        assertTrue(integerSet.contains(4));
    }

    @Test
    @DisplayName("Test case for intersect method")
    void testIntersect() {
        IntegerSet otherSet = new IntegerSet(new ArrayList<>(Arrays.asList(2, 3)));
        integerSet.add(1);
        integerSet.add(2);
        integerSet.intersect(otherSet);
        assertTrue(integerSet.contains(2));
        assertFalse(integerSet.contains(1));
        assertFalse(integerSet.contains(3));
    }

    @Test
    @DisplayName("Test case for diff method")
    void testDiff() {
        IntegerSet otherSet = new IntegerSet(new ArrayList<>(Arrays.asList(2, 3)));
        integerSet.add(1);
        integerSet.add(2);
        integerSet.diff(otherSet);
        assertTrue(integerSet.contains(1));
        assertFalse(integerSet.contains(2));
        assertFalse(integerSet.contains(3));
    }

    @Test
    @DisplayName("Test case for complement method")
    void testComplement() {
        IntegerSet otherSet = new IntegerSet(new ArrayList<>(Arrays.asList(2, 3)));
        integerSet.add(1);
        integerSet.add(2);
        integerSet.complement(otherSet);
        assertFalse(integerSet.contains(1));
        assertTrue(integerSet.contains(2));
        assertTrue(integerSet.contains(3));
    }

    @Test
    @DisplayName("Test case for isEmpty method")
    void testIsEmpty() {
        assertTrue(integerSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString method")
    void testToString() {
        integerSet.add(1);
        integerSet.add(2);
        assertEquals("[1, 2]", integerSet.toString());
    }

    @Test
    @DisplayName("Test case for largest method with empty set")
    void testLargestWithEmptySet() {
        assertThrows(IntegerSetException.class, () -> integerSet.largest());
    }

    @Test
    @DisplayName("Test case for smallest method with empty set")
    void testSmallestWithEmptySet() {
        assertThrows(IntegerSetException.class, () -> integerSet.smallest());
    }
}
