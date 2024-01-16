package lab12;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int result = divide(10, 0);

			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero");
		} finally {

			System.out.println("This block will always be executed");
		}
	}

	private static int divide(int dividend, int divisor) {
		return dividend / divisor;
	}
}
