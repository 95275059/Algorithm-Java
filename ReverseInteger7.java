public class ReverseInteger7 {
	public int reverse(int x) {
		// 时间击败27.40%，内存击败57.90%
		int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
