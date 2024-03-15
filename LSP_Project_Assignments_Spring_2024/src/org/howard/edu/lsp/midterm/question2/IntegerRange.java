package org.howard.edu.lsp.midterm.question2;

/**
 * The IntegerRange class represents a range of integers defined by a lower and upper bound.
 * It implements the Range interface.
 */
public class IntegerRange implements Range {
    /**
     * The lower bound of the integer range.
     */
    private int lowerBound;

    /**
     * The upper bound of the integer range.
     */
    private int upperBound;

    /**
     * Constructs an IntegerRange object with the specified lower and upper bounds.
     * @param lowerBound The lower bound of the integer range.
     * @param upperBound The upper bound of the integer range.
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the specified value is within the range.
     * @param value The value to check.
     * @return true if the value is within the range, otherwise false.
     */
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Checks if the range overlaps with another range.
     * @param other The other range to check for overlap.
     * @return true if the ranges overlap, otherwise false.
     */
    @Override
    public boolean overlaps(Range other) {
        return this.contains(((IntegerRange) other).lowerBound) ||
                this.contains(((IntegerRange) other).upperBound);
    }

    /**
     * Calculates the size of the range.
     * @return The number of integers in the range.
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Checks if this range is equal to another object.
     * @param obj The object to compare with.
     * @return true if the ranges are equal, otherwise false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerRange range = (IntegerRange) obj;
        return lowerBound == range.lowerBound && upperBound == range.upperBound;
    }
}



