public class SingleNumber136 {
	public int singleNumber(int[] nums) {
		// 异或
		// 时间击败100.00%，内存击败58.76%
		int result = 0;
		for (int n : nums) 
			result = result ^ n;
		return result;
	}
}
