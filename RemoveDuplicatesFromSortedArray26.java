
public class RemoveDuplicatesFromSortedArray26 {
/*
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。

 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 思路：双指针
*/
	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int left = 0;
		for (int right = 1; right < nums.length; right++) {
			if (nums[left] != nums[right])
				nums[++left] = nums[right];
		}
		return  ++left;
	}
	public static void main(String[] arg) {
		int[] nums = new int[10];
		nums[0] = 0;
		nums[1] = 0;
		nums[2] = 1;
		nums[3] = 1;
		nums[4] = 1;
		nums[5] = 2;
		nums[6] = 2;
		nums[7] = 3;
		nums[8] = 3;
		nums[9] = 4;
		int len = removeDuplicates(nums);
		System.out.println(len);
	}
}
