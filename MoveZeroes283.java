public class MoveZeroes283 {
	public void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes1(nums);
		for (int n : nums)
			System.out.printf("%d ", n);
	}
	public void moveZeroes(int[] nums) {
		// 双指针
		// 时间击败100.00%，内存击败89.42%
		int num_length = nums.length;
		if (num_length==0)
			return ;
		int zero_num = 0;
		for(int i=0; i<num_length; i++) {
			if (nums[i]==0)
				zero_num++;
			else
				nums[i-zero_num] = nums[i];
		}
		for (int i=num_length-1;i>num_length-zero_num-1; i--)
			nums[i] = 0;
    }
	public void moveZeroes1(int[] nums) {
		// 非零往前挪，双指针
		// 时间击败100.00%，内存击败24.59%
		int num_length = nums.length;
		if (num_length==0)
			return ;
		int index = 0;
		for (int i=0; i<num_length; i++) {
			if (nums[i]!=0) {
				nums[index++] = nums[i];
			}
		}
		while (index<num_length) 
			nums[index++] = 0;
	}
}
