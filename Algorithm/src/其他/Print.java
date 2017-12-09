package ÆäËû;

public class Print {
	public static int Print(int n) {
		if (n == 0) {
			return 0;
		} else {
			System.out.println(n);
			return Print(n - 1);
		}
	}

	public static void main(String[] args) {
		Print(10);
	}
}
