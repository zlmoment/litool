package litool.searching;

public class BinarySearchRecursive {
	
	public static int binarySearchRecursive(int[] array, int x, int low, int high) {
		if (low > high)
			return -1;
		
		int middle = (low + high) / 2;
		if (x < array[middle]) {
			return binarySearchRecursive(array, x, low, middle - 1);
		} else if (x > array[middle]) {
			return binarySearchRecursive(array, x, middle + 1, high);
		} else {
			return middle;
		}
	}
}
