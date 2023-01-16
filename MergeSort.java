public class MergeSort {

	public static void mergeSort(int[] arr) {
		int length = arr.length;
		if (length < 2) { // base case
			return;
		}
		else { // step case
			/* compute the size of the two sub arrays */
			int halfSize = length/2;
			
			/* declare these as `left` and `right` arrays */
			int[] left = new int[halfSize];
			int[] right = new int[length-halfSize];
			
			/* TODO: populate the left array with values */
			int index = 0;
			while (index < halfSize) {
				// TODO
				
				index++;
			}
			
			/* TODO: populate the right array with values */
			index = 0;
			while (index < length-halfSize) {
				// TODO
				
				index++;
			}
			
			/* TODO: perform merge sort on the two sub arrays */
			
			
			/* TODO: merge the sorted sub arrays and write back into the `arr` array */
			
		}
		
	}
	
	// to assist mergeSort
	public static void merge(int[] left, int[] right, int[] arr) {
		int index = 0;
		int lindex = 0;
		int rindex = 0;
		
		/* TODO step 1: compare elementwise `left` and `right` arrays
		 * and write the smaller of the two values into the `arr` array
		 */
		while(lindex < left.length && rindex < right.length) {
			if (left[lindex] <= right[rindex]) {
				// TODO
				
				lindex++;
			}
			else {
				// TODO
				
				rindex++;
			}
		}
		
		// TODO step 2: write any remaining values in the `left` array into the `arr` array
		while (lindex < left.length) {
			// TODO
			
			lindex++;
		}
		
		// TODO step 2: write any remaining values in the `right` array into the `arr` array
		while (rindex < right.length) {
			// TODO
			
			rindex++;
		}
	}
	
	// checks if the array is sorted, useful for the unit tests.
	public static boolean isSorted(int[] arr){
		for(int i = 0; i < arr.length-1;i++)
			if(arr[i] > arr[i+1])
				return false;
		return true;
	}
	
}
