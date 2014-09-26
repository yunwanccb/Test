/**
 * ��������
 */
package bupt.ccb.sort;

import java.util.Random;

/**
 * @author Cloud
 * 
 */
@SuppressWarnings("unused")
public class QuickSort {
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}

	private static void quickSort(int[] list, int begin, int end) {
		// TODO Auto-generated method stub
		if (begin < end) {
			int povitIndex = partition(list, begin, end);
			quickSort(list, begin, povitIndex - 1);
			quickSort(list, povitIndex + 1, end);
		}
	}

	private static int partition(int[] list, int begin, int end) {
		// TODO Auto-generated method stub
		int index;
		int povit = list[end];//ѡȡ���һ��Ԫ�ص�����Ԫ
		for (int i = index = begin; i < end; i++) {
			if (list[i] <= povit) {//��С������Ԫ��Ԫ���Ƶ�ǰ��
				swap(list, index++, i);
			}
		}
		swap(list, index, end);//����Ԫ�����м䣬ʹ����Ԫ���С����Ԫ���ұߴ�����Ԫ
		return index;
	}

	private static void swap(int[] list, int a, int b) {
		// TODO Auto-generated method stub
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;

	}

	public static void main(String[] args) {
		int[] list = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		quickSort(list);
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}
