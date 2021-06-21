import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class IntersectionOfTwoArraysII350 {
	public void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		//int[] nums1 = {4, 9, 5};
		//int[] nums2 = {9, 4, 9, 8, 4};
		int[] result = intersect1(nums1, nums2);
		for (int i=0; i<result.length; i++)
			System.out.printf("%d ", result[i]);
	}
	public int[] intersect(int[] nums1, int[] nums2) {
		// 排序后双指针遍历
		// 时间击败91.15%，内存击败11.86%
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int nums1_len = nums1.length, nums2_len = nums2.length;
		int i = 0, j = 0, k = 0;
		int[] result = new int[Math.min(nums1_len, nums2_len)];
		while (i < nums1_len && j < nums2_len) {
			if (nums1[i] == nums2[j]) {
				result[k] = nums1[i];
				i++;
				j++;
				k++;
			}
			else if (nums1[i] < nums2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	public int[] intersect1(int[] nums1, int[] nums2) {
		//哈希表
		//时间击败69.33%，内存击败75.79%
		int nums1_length = nums1.length, nums2_length = nums2.length;
		if (nums1_length > nums2_length)
			return intersect1(nums2, nums1);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums1) {
			int count = map.getOrDefault(num, 0) + 1;
			map.put(num, count);
		}
		int[] result = new int[nums1_length];
		int index = 0;
		for (int num : nums2) {
			int count = map.getOrDefault(num, 0);
			if (count > 0) {
				result[index++] = num;
				count--;
				if (count > 0 )
					map.put(num, count);
				else
					map.remove(num);
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
