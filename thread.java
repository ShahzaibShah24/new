package lab12;
public class thread {
	public static void main(String[] args) {
		MyThread1 obj1 = new MyThread1();
		MyThread2 obj2 = new MyThread2();

		obj1.start(); // Use start() instead of run() for creating a new thread
		obj2.start();
	}
}
class MyThread1 extends Thread {
	public void run() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " is even number");
			}
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i] + " is odd number");
			}
		}
	}
}



