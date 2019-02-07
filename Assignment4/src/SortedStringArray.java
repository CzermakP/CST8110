//Name: Patrick Czermak
//Section: 314
//Lab Instructor: Jason Mombourquette
//Assignment 4
//Class SortedStringArray program holds the source code which creates and manipulates an array. 
//I understood the capacity as how many indexes the array can hold in total
//I understood the size as how many indexes are actually in the array

import java.util.*;

public class SortedStringArray {
	private String stringArray[] = null;// declaring array object stringArray
	
	
	// DEFAULT CONSTRUCTOR
	SortedStringArray() {
		stringArray = new String[10]; // initializing stringArray to capacity of 10 string objects
//		initializeEmptyStrings();
	
	}

	// INITIAL CONSTRUCTOR
	SortedStringArray(int initialCapacity) {
		stringArray = new String[initialCapacity];// parameterized constructor initializing stringArray to a new String
													// with initialCapacity
	}

	// ADD METHOD
	boolean add(String s) {
			for (int i = 0; i < stringArray.length; i++) { // loops through entire array
			if (stringArray[i] != null && stringArray[i].compareTo(s) == 0) { // if added string is same as string in
																				// current position...won't add it there
				return false;
			} else if (stringArray[i] == null) { // if array position is null....
				stringArray[i] = s; // add new string in
				Arrays.sort(stringArray,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)); // sorts strings alphabetically
				return true;
			} else if (i == stringArray.length - 1) {// if the array is full,
				String[] tempArray = new String[stringArray.length + 1]; // creating new tempArray with size of
																			// stringArray +1
				for (int k = 0; k < stringArray.length; k++) { // loops through entire stringArray
					tempArray[k] = stringArray[k]; // assigns tempArray the indexes of stringArray
				}
				tempArray[size()] = s; // assigns the added string into the last position of the newly increased
											// stringArray
				stringArray = tempArray;
				Arrays.sort(stringArray,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)); // sorts stringArray values alphabetically
				return true;
			}
		}
		return false;
	}

	// PRINT METHOD
	void print() {
		for (int i = 0; i < stringArray.length; i++) { // loops through entire array
			System.out.print(" | " + stringArray[i]); // out prints all array values to console
		}
	}

	// GET METHOD
	String get(int index) {
		return stringArray[index]; // returns the stringArrays Index
	}

	// GET INDEX METHOD
	int getIndex(String entry) {
		for (int i = 0; i < stringArray.length; i++) { // loops through entire array
			if (entry.compareTo(stringArray[i]) == 0) { // compares string entry to the stringArray specified position
														// and if they are the same
				return i; // return the stringArray index 							
			}
		}
		return -1;
	}

	// DELETE ENTRY AT GIVEN INDEX METHOD
	boolean delete(int index) { 
		if (stringArray[index] != null) { // if the specified index already has a value...
			stringArray[index] = null; // deletes the specified index position
			Arrays.sort(stringArray,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)); // sorts stringArray values alphabetically
			return true;
		} else {
			return false;
		}
	}

	// DELETE GIVEN ENTRY METHOD
	boolean delete(String entry) { 
		for (int i = 0; i <= size(); i++) { // loops through the entire array
			if (stringArray[i].equalsIgnoreCase(entry)) { // if the specific stringArray value is equal to the entry value
				stringArray[i] = null; // deleting the index
				Arrays.sort(stringArray,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)); // sorts stringArray values alphabetically
				return true;
			}
		}
		return false;
	}

	// RETURNS ARRAY SIZE METHOD
	int size() { 
		int count = 0; // declaring and initializing "count" to use in this method
		for (int i = 0; i < stringArray.length; i++) { // will loop through the entire array
			if (stringArray[i] != null) { // if the loop doesn't encounter a null value
				count++; // will add up all the positions
			}
		}
		return count; // will return total positions filled in the array

	}

	// RETURNS ARRAY CAPACITY METHOD
	int capacity() { 
		return stringArray.length; // returns the total length/capacity of the array
	}
	
}
