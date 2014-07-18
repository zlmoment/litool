package litool.sorting;

public class QuickSort {

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

	public static void swap(int[] array, int a, int b) {
		array[b] = (array[a] + array[b]) - (array[a] = array[b]);
	}

}
