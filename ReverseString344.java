public class ReverseString344 {
	public void reverseString(char[] s) {
		// 时间击败100.00%，内存击败67.79%
		for (int i=0; i<s.length/2; i++) {
			char tmp = s[i];
			s[i] = s[s.length-i-1];
			s[s.length-i-1] = tmp;
		}
	}

}
