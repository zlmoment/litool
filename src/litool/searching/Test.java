package litool.searching;

import litool.sorting.QuickSort;

public class Test {
	static int[] a = { 3, 2, 6, 4, 8, 5, 23, 4, 5, 7, 7, 4, 2, 1, 3, 5, 7, 8,
			0, 89, 7867, 5, 34, 3, 23, 2, 4, 5, 6, 67 };

	public static void main(String[] args) {
		QuickSort.quickSort(a, 0, a.length - 1);
		for (int i : a)
			System.out.print(i + " ");
		// int index = BinarySearch.binarySearch(a, 34);
		int index = BinarySearchRecursive.binarySearchRecursive(a, 34, 0, a.length - 1);
		System.out.println(index);
	}
}
