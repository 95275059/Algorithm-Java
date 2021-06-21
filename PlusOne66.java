public class PlusOne66 {
	public int[] plusOne(int[] digits) {
		// 逢9进位，否则当前位+1后直接return
		// 时间击败100.00%，内存击败5.65%
		for(int i=digits.length-1; i>=0;i--) {
			digits[i]++;
			digits[i] = digits[i] % 10;
			if (digits[i] != 0)
				return digits;
		}
		digits = new int[digits.length+1];
		digits[0] = 1;
		return digits;
    }
}
