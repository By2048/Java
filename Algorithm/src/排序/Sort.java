package 排序;

public class Sort {
	public static void main(String[] args) {
		Sort st = new Sort();
		int arr[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56 };
		// st.BubbleSort(arr);
		// st.SelectSort(arr);
		st.QuickSort(arr, 0, arr.length - 1);
		st.ArrPrint(arr);
	}

	public void ArrPrint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// 冒泡排序
	// 每次排序会将最大值移到后面
	// for 0 arr.length-1
	// for 0 arr.length-i-1
	// swap()
	public void BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	// 选择排序
	// 找到最大元素放置到最后
	// for 0 arr.length-1
	// for i+1 arr.length
	// swap()
	public void SelectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;// 将当前下标定为最小值下标
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (i != min) {
				int tmp = arr[i];
				arr[i] = arr[min];
				arr[min] = tmp;
			}
		}
	}

	// 快速排序
	public void QuickSort(int[] data, int start, int end) {
		// 设置关键数据key为要排序数组的第一个元素，
		// 即第一趟排序后，key右边的数全部比key大，key左边的数全部比key小
		int key = data[start];
		// 设置数组左边的索引，往右移动比key大的数
		int i = start;
		// 设置数组右边的索引，往左移动比key小的数
		int j = end;
		// 如果左边索引比右边索引小，则还有数据没有排序
		while (i < j) {
			while (data[j] > key && j > i) {
				j--;
			}
			data[i] = data[j];
			while (data[i] <= key && i < j) {
				i++;
			}
			data[j] = data[i];
		}
		// 此时 i==j
		data[i] = key;
		// 递归调用
		if (i - 1 > start) {
			// 递归调用，把key前面的完成排序
			QuickSort(data, start, i - 1);
		}
		if (i + 1 < end) {
			// 递归调用，把key后面的完成排序
			QuickSort(data, i + 1, end);
		}
	}
}