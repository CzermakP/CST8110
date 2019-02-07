//Name: Patrick Czermak
//Section: 314
//Lab Instructor: Jason Mombourquette
//Assignment 4
//Main Assign4.java holds the source code which tests the methods in the SortedStringArray.java class for function and accuracy

public class Assign4 {

	public static void main(String[] args) {
		boolean testSucceeds;

		// Test that the default constructor works properly
		testSucceeds = true;
		SortedStringArray ssa = new SortedStringArray();
		if (ssa.size() != 0) {
			System.err.println("Default Constructor: initial size is wrong");
			testSucceeds = false;
		}
		if (ssa.capacity() != 10) {
			System.err.println("Default Constructor: initial capacity is wrong");
			testSucceeds = false;
		}
		if (testSucceeds) {
			System.out.println("Default Constructor: working correctly");
		}

		// Test that the initial constructor works properly
		int initialCapacity = 10;
		testSucceeds = true;
		ssa = new SortedStringArray(initialCapacity);
		if (ssa.size() != 0) {
			System.err.println("Initial Constructor: initial size is wrong");
			testSucceeds = false;
		}
		if (ssa.capacity() != initialCapacity) {
			System.err.println("Initial Constructor: initial capacity is wrong");
			testSucceeds = false;
		}
		if (testSucceeds) {
			System.out.println("Initial Constructor: working correctly");
		}

		// Test that the add method works properly (add's an index value, duplicate
		// value's)
		testSucceeds = true;
		initialCapacity = 3;
		ssa = new SortedStringArray(initialCapacity);

		ssa.add("Amy");
		ssa.add("Cathy");
		ssa.add("Cathy");
		ssa.add("Franca");
		ssa.add("Brenda");
		ssa.add("Daisy");
		ssa.add("Emma");
		ssa.add("Gertrude");
		ssa.add("Hillory");
		ssa.add("Ilsa");
		ssa.add("Jenn");

		if (ssa.capacity() != 10 && ssa.size() != 10) {
			System.err.println("Add Method: capacity is wrong");
			testSucceeds = false;
		}
		if (ssa.getIndex("Amy") != 0 || ssa.getIndex("Jenn") != 9) {
			System.err.println("Add Method: sorting not working");
		}
		if (testSucceeds = true) {
			System.out.println("Add Method: working correctly ");
		}

		// Test that the get method works properly (from a specific position)
		testSucceeds = true;
		if (!(ssa.get(4).equals("Emma"))) {
			System.err.println("Get Method: ERROR");
			testSucceeds = false;
		}
		if (testSucceeds = true) {
			System.out.println("Get Method: working correctly");
		}

		// Test that the getIndex method works properly (from a specific value and
		// position)
		testSucceeds = true;
		if (ssa.getIndex("Emma") != 4) {
			System.err.println("Get Index Method: NOT working");
			testSucceeds = false;
		}
		if (testSucceeds = true) {
			System.out.println("Get Index Method: working correctly");
		}

		// Test that the delete entry method works properly
		testSucceeds = true;
		if (ssa.delete("Daisy")) {
			System.out.println("Delete Entry Method: working correctly");
		} else {
			System.err.println("Delete Entry Method: not working");
		}

		// Test that the delete index method works properly
		testSucceeds = true;
		if (ssa.delete(7)==true && ssa.delete(9)==false) {
			System.out.println("Delete Index Method: working correctly");
		} else {
			System.err.println("Delete Index Method: not working");
		}

		ssa.print();
	}
}