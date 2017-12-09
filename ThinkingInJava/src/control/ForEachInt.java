//: control/ForEachInt.java
package control; 

import java.util.Random;

// import static net.mindview.util.Range.*;
// import static net.mindview.util.System.out.println.*;

public class ForEachInt {
	public static void main(String[] args) {
		for (int i : range(10)) // 0..9
			System.out.println(i + " ");
		System.out.println();
		for (int i : range(5, 10)) // 5..9
			System.out.println(i + " ");
		System.out.println();
		for (int i : range(5, 20, 3)) // 5..20 step 3
			System.out.println(i + " ");
		System.out.println();
	}

	private static int[] range(int end) {
		int[] output = new int[end + 1];
		for (int i = 0; i <= end; i++) {
			output[i] = i;
		}
		return output;
	}

	private static int[] range(int start, int end) {
		int[] output = new int[end - start + 1];
		for (int i = start, cnt = 0; i <= end; i++, cnt++) {
			output[cnt] = i;
		}
		return output;
	}

	private static int[] range(int start, int end, int index) {

		int[] output = new int[(end - start) / 3 + 1];
		for (int i = start, cnt = 0; i <= end; i += index, cnt++) {
			output[cnt] = i;
		}
		return output;
	}
}
/*
 * 
 * Output: 0 1 2 3 4 5 6 7 8 9 5 6 7 8 9 5 8 11 14 17
 */// :~
