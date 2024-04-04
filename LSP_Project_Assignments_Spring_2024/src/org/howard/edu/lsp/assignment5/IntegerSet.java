package org.howard.edu.lsp.assignment5;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class IntegerSet {
	// Store the set elements in an array list
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	}

	// Returns the length of the set
	public int length() {
		return set.size();
	}

	/*
	 * Returns true if the 2 sets are equal, false otherwise; Two sets are equal if
	 * they contain all of the same values in ANY order. This overrides the equal
	 * method from the Object class.
	 */

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof IntegerSet)) {
			return false;
		}

		// Casting object
		IntegerSet otherSet = (IntegerSet) o;
		if (this.length() == otherSet.length()) {
			if (otherSet.set.containsAll(set)) {
				return true;
			}
		}
		return false;
	}

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return set.contains(value);
	}

	// Returns the largest item in the set. Throws an IntegerSetException if the set
	// is empty
	public int largest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("Set is empty");
		}

		return Collections.max(set);

	}

	// Returns the smallest item in the set. Throws an IntegerSetException if the
	// set is empty
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("Set is empty");
		}

		return Collections.min(set);
	}

	// Adds an item to the set or does nothing if item is already there
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}

	// Removes an item from the set or does nothing if item is not there
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}

	// Set Union
	public void union(IntegerSet intsetb) {
		for (int item : intsetb.set) {
			this.add(item);
		}
	}

	// Set Intersection
	public void intersect(IntegerSet intsetb) {
		set.retainAll(intsetb.set);
	}

	// Set Difference
	public void diff(IntegerSet intsetb) {
		set.removeAll(intsetb.set);
	}

	// Set Complement
	public void complement(IntegerSet intsetb) {
		List<Integer> tempSet = new ArrayList<Integer>();

		for (int item : intsetb.set) {
			if (!(set.contains(item))) {
				tempSet.add(item);
			}
		}
		set = tempSet;
	}

	// Returns true if set is empty else false
	public boolean isEmpty() {
		return set.isEmpty();
	}

	// Returns String representation of the set. Overrides the equal method from
	// Object class.
	@Override
	public String toString() {
		System.out.println(set.toString());
		return set.toString();
	}

}
