package 其他;

import java.util.*;

// 链接：https://www.nowcoder.com/questionTerminal/28c1dc06bc9b4afd957b01acdf046e69?commentTags=Java
// 来源：牛客网

public class 构造回文串 {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);  
		while (in.hasNextLine()) {
			String str =in.nextLine();  
			int i =deleteLength(str);
			System.out.println(i);
		}
	}

	private static int deleteLength(String str) {
		int length = str.length();
		char[] chars = str.toCharArray();
		int[][] lcs = new int[length + 1][length + 1];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (chars[i] == chars[length - j - 1]) {
					lcs[i + 1][j + 1] = lcs[i][j] + 1;
				} else {
					int max = lcs[i][j + 1] > lcs[i + 1][j] ? lcs[i][j + 1] : lcs[i + 1][j];
					lcs[i + 1][j + 1] = max;
				}
			}
		}
		return length - lcs[length][length];
	}
	
}
