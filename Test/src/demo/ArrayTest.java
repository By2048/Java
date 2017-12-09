package demo;
import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		String[] strArray = { "", "����һ", "���ڶ�", "������", "������", "������", "������", "������" };
		
		printArray(arr);
		
		System.out.println(getMax(arr));
		System.out.println(reverse(arr));
		// ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������������(1-7)��");
		int index = sc.nextInt();
		System.out.println("��Ҫ���ҵ�����Ϊ��" + strArray[index]);

		
	}
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i=0; i<arr.length; i++) {		
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
	}
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int[] reverse(int[] arr) {
		for (int start=0,end=arr.length; start<=end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		return arr;
	}
}
