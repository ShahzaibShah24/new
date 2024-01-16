package lab7;

public class Lab7 {
	public static <E> void printArray(E[] inputArray) {

		for (int i = inputArray.length - 1; i >= 0; i--) {
		    System.out.printf("%s ", inputArray[i]);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Integer[] intArray = { 13, 32, 23, 54, 75 };

		Double[] doubleArray = { 3.69, 3.94, 3.88, 3.84 };

		Character[] charArray = { 'B', 'I', 'A', 'Z', 'H', 'A', 'H', 'S' };

		System.out.println("IntegerArray in reverse order:");
		printArray(intArray);

		System.out.println("\nDoubleArray in reverse order:");
		printArray(doubleArray);

		System.out.println("\nCharacterArray in reverse order:");
		printArray(charArray);
	}
}


