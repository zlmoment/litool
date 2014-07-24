package litool.sorting;

public class MergeSort {
	
	/**
	 * The entrance of MergeSort
	 * @param array The array to be sorted
	 */
	public static void mergesort(int[] array) {
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length - 1);
	}
	
	/**
	 * Recursively mergesort
	 * @param array The array to be sorted
	 * @param helper The extra memory as a helper
	 * @param low The beginning index
	 * @param high The end index
	 */
	public static void mergesort(int[] array, int[] helper, int low, int high) {
		/* the classical recurse divide and conquer */
		if (low < high) {
			int middle = (low + high) / 2;
			mergesort(array, helper, low, middle);
			mergesort(array, helper, middle + 1, high);
			merge(array, helper, low, middle, high);
		}
	}
	
	/**
	 * Merge two parts of the array
	 * @param array The array to be sorted
	 * @param helper The extra memory
	 * @param low The beginning index
	 * @param middle The middle index
	 * @param high The last index
	 */
	public static void merge(int[] array, int[] helper, int low, int middle, int high) {
		/* copy both halves into a helper array */
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		
		/* compare each pair of elements in two halves, put the small
		 * one into original array */
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;

		while (helperLeft <= middle && helperRight <= high) {
			if (helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				helperLeft++;
			} else {
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		/* if left half still have elements that have not been
		 * put into array, here put it into array */
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i];
		}
	}

}
