// binary search implementation in javascript
// iterative solution

function binarySearch(array, number){
	var result = false;
	var length = array.length;
	var left = array[0];
	var right = array[length-1];

	while (left <= right){
		var midpoint = (left+right)/2;
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