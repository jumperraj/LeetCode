
import java.util.Arrays;

class Solution {
	public static int partition(int[] arr, int low,
								int high)
	{
		int pivot = arr[high], pivotloc = low;
		for (int i = low; i <= high; i++) {
			if (arr[i] > pivot) {
				int temp = arr[i];
				arr[i] = arr[pivotloc];
				arr[pivotloc] = temp;
				pivotloc++;
			}
		}

		int temp = arr[high];
		arr[high] = arr[pivotloc];
		arr[pivotloc] = temp;

		return pivotloc;
	}

	public static int kthSmallest(int[] arr, int low,
								int high, int k)
	{
		// find the partition
		int partition = partition(arr, low, high);
     

		// if partition value is equal to the kth position,
		// return value at k.
		if (partition == k - 1)
			return arr[partition];

		// if partition value is less than kth position,
		// search right side of the array.
		else if (partition < k - 1)
			return kthSmallest(arr, partition + 1, high, k);

		// if partition value is more than kth position,
		// search left side of the array.
		else
			return kthSmallest(arr, low, partition - 1, k);
	}

	// Driver Code
	int findKthLargest(int[] nums,int k)
	{
		 return kthSmallest(nums,0,nums.length-1,k);
		
	}
}

// This code is contributed by Saiteja Pamulapati