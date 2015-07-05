package test;

public class TestDataIsHere {
// this class exist just to find the test data files
	
	public static void main(String[] args) {
		// ust print the folder
		System.out.println("The folder of the test data file is " +  TestDataIsHere.class.getResource("rootfile.txt"));
	}

}
