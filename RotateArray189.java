public class RotateArray189 {
	public static void reverse(int[] nums, int start, int end) {
		while (start<end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start += 1;
			end -= 1;
		}
	}
	public static void rotate(int[] nums, int k) {
        if (nums.length <= 1)
            return ;
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
	public static void rotate1(int[] nums, int k) {
		int hold = nums[0];
		int index = 0;
		int length = nums.length;
		boolean[] visited = new boolean[length];
		for (int i=0; i<length; i++) {
			index = (index + k) % length;
			if (visited[index]) {
				index = (index + 1) % length;
				hold = nums[index];
				i--;
			}
			else {
				visited[index] = true;
				int tmp = nums[index];
				nums[index] = hold;
				hold = tmp;
			}
		}
	}
}
