// binary search implementation in java
// iterative solution

public static boolean binarySearch(int[] array, int number){
	boolean result = false;
	int left = array[0];
	int right = array[array.length - 1];
	while (left <= right){
		int midpoint = (left+right)/2;
		if (number == array[midpoint]){
			result = true;
			break;
		}
		else if (number > array[midpoint]){
			left = midpoint + 1;
		}
		else if (number < array[midpoint]){
			right = midpoint - 1;
		}
	}
	return result;
}