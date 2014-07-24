package litool.sorting;

public class QuickSort {
	
	/**
	 * The entrance of quicksort
	 * @param array The array to be sorted
	 * @param left The starting index of the array
	 * @param right The ending index of the array
	 */
	public static void quickSort(int[] array, int left, int right) {
		/*
		 * on the left of the index, elements are all <= array[index] ont the
		 * right of the index, elements are all > array[index]
		 */
		int index = partition(array, left, right);

		/* sort left half */
		if (left < index - 1) {
			quickSort(array, left, index - 1);
		}
		/* sort right half */
		if (index < right) {
			quickSort(array, index, right);
		}
	}

	/**
	 * Partition the array into two parts by a pivot, left part contains
	 * all the elements less or equal to pivot, right part contains all the
	 * elements bigger than pivot.
	 * @param array The array to be sorted
	 * @param left The left index
	 * @param right The right index
	 * @return The index of the pivot at last
	 */
	public static int partition(int[] array, int left, int right) {
		int pivot = array[(left + right) / 2];
		while (left < right) {
			while (array[left] < pivot)
				left++;
			while (array[right] > pivot)
				right--;

			if (left <= right) {
				swap(array, left++, right--);
			}
		}
		return left;
	}

	/**
	 * Swap two elements in an array
	 * @param array The array
	 * @param a	The index of the first element
	 * @param b	The index of the second element
	 */
	public static void swap(int[] array, int a, int b) {
		array[b] = (array[a] + array[b]) - (array[a] = array[b]);
	}

}
