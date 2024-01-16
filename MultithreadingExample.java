package lab12;

public class MultithreadingExample {
	public static void main(String[] args) {
		MultiThreading thread1 = new MultiThreading();
		MultiThreading thread2 = new MultiThreading();

		thread1.start(); // Starts execution of thread1
		thread2.start(); // Starts execution of thread2
	}
}
