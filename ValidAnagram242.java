import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class ValidAnagram242 {
	public boolean isAnagram(String s, String t) {
		// 排序
		// 时间击败88.34%，内存击败88.31%
		if (s.length() != t.length())
			return false;
		char[] s_ch = s.toCharArray();
		Arrays.sort(s_ch);
		char[] t_ch = t.toCharArray();
		Arrays.sort(t_ch);
		return Arrays.equals(s_ch, t_ch);
    }
	public boolean isAnagram1(String s, String t) {
		// 哈希表
		// 时间击败16.71%，内存击败33.75%
		if (s.length() != t.length())
			return false;
		Map<Character, Integer> table = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			table.put(ch, table.getOrDefault(ch, 0)+1);
		}
		for(int i=0; i<t.length(); i++) {
			char ch = t.charAt(i);
			table.put(ch, table.getOrDefault(ch, 0)-1);
			if (table.get(ch)<0)
				return false;
		}
		return true;
	}
}
