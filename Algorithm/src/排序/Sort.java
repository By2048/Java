package ����;

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

	// ð������
	// ÿ������Ὣ���ֵ�Ƶ�����
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

	// ѡ������
	// �ҵ����Ԫ�ط��õ����
	// for 0 arr.length-1
	// for i+1 arr.length
	// swap()
	public void SelectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;// ����ǰ�±궨Ϊ��Сֵ�±�
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

	// ��������
	public void QuickSort(int[] data, int start, int end) {
		// ���ùؼ�����keyΪҪ��������ĵ�һ��Ԫ�أ�
		// ����һ�������key�ұߵ���ȫ����key��key��ߵ���ȫ����keyС
		int key = data[start];
		// ����������ߵ������������ƶ���key�����
		int i = start;
		// ���������ұߵ������������ƶ���keyС����
		int j = end;
		// �������������ұ�����С����������û������
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
		// ��ʱ i==j
		data[i] = key;
		// �ݹ����
		if (i - 1 > start) {
			// �ݹ���ã���keyǰ����������
			QuickSort(data, start, i - 1);
		}
		if (i + 1 < end) {
			// �ݹ���ã���key������������
			QuickSort(data, i + 1, end);
		}
	}
}