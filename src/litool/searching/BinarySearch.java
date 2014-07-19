package litool.searching;

public class BinarySearch {
	
	public static int binarySearch(int[] array, int x) {
		int low = 0;
		int high = array.length - 1;
		int middle;

		while (low <= high) {
			middle = (low + high) / 2;
			if (x < array[middle]) {
				high = middle - 1;
			} else if (x > array[middle]) {
				low = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

}
