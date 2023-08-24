class Solution {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0, j = 0, t = 0;
		int length = nums1.length + nums2.length;
		int mid = ((length - 1) / 2);
		int[] nums3 = new int[length];
		while ((i < nums1.length) && (j < nums2.length) && (t <= (mid + 1))){
			try{while ((nums1[i] > nums2[j])) {
				nums3[t] = nums2[j];
				t++;
				j++;
			}
            }
            catch(Exception e){continue;}
			nums3[t] = nums1[i];
			t++;
			i++;
		}
		while ((i < nums1.length) && (t <= (mid + 1))) {
			nums3[t] = nums1[i];
			t++;
			i++;
		}
		while ((j < nums2.length) && (t <= (mid + 1))) {
			nums3[t] = nums2[j];
			t++;
			j++;
		}
		double sum = (((length % 2) == 0) ? (((double) nums3[mid] + nums3[mid + 1]) / 2) : nums3[mid]);
		return (sum);

	}
}