public class ValidPalindrome125 {
	public boolean isPalindrome(String s) {
		// 双指针
		// 时间击败92.45%，内存击败38.39%
		int len = s.length();
		if(len==0)
			return true;
		int left = 0, right = len-1;
		while(left<right) {
			while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
				++left;
			while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
				--right;
			if(left<right) {
				if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))
					return false;
				++left;
				--right;
			}
		}
		return true;
    }
	public boolean isPalindrome1(String s) {
		// 先筛选再翻转判断
		// 时间击败29.99%，内存击败87.05%
		StringBuffer sgood = new StringBuffer();
		int len = s.length();
		for(int i=0;i<len;++i) {
			char ch = s.charAt(i);
			if(Character.isLetterOrDigit(ch))
				sgood.append(Character.toLowerCase(ch));
		}
		StringBuffer sgood_new = new StringBuffer(sgood).reverse();
		return sgood.toString().equals(sgood_new.toString());
	}
}
