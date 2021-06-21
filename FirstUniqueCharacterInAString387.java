import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
public class FirstUniqueCharacterInAString387 {
	public int firstUniqChar(String s) {
		// 哈希表存储频数
		// 时间击败27.82%，内存击败50.86%
		Map<Character, Integer> frequency = new HashMap<Character, Integer>();
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			frequency.put(ch, frequency.getOrDefault(ch, 0)+1);
		}
		for (int i=0; i<s.length(); i++) {
			if (frequency.get(s.charAt(i))==1)
				return i;
		}
		return -1;
	}
	
	public int firstUniqChar1(String s) {
		// 哈希表存储索引
		// 时间击败63.06%，内存击败41.80%
		Map<Character, Integer> position = new HashMap<Character, Integer>();
		int n = s.length();
		for (int i=0; i<n; i++) {
			char ch = s.charAt(i);
			if (position.containsKey(ch)) 
				position.put(ch, -1);
			else
				position.put(ch, i);
		}
		int first = n;
		for (Map.Entry<Character, Integer> entry : position.entrySet()) {
			int pos = entry.getValue();
			if (pos != -1 && pos < first)
				first = pos;
		}
		if (first == n)
			first = -1;
		return first;
	}
	public int firstUniqChar2(String s) {
		// 队列
		// 时间击败35.16%，内存击败86.55%
		Map<Character, Integer> position = new HashMap<Character, Integer>();
		Queue<Pair> queue = new LinkedList<Pair>();
		int n = s.length();
		for (int i=0; i<n; i++) {
			char ch = s.charAt(i);
			if (position.containsKey(ch)) {
				position.put(ch, -1);
				while (!queue.isEmpty() && position.get(queue.peek().ch)==-1) 
					queue.poll();
			}
			else {
				position.put(ch, i);
				queue.offer(new Pair(ch, i));
			}
		}
		return queue.isEmpty() ? -1 : queue.poll().pos;
	}
	class Pair {
		char ch;
		int pos;
		
		Pair(char ch, int pos) {
			this.ch = ch;
			this.pos = pos;
		}
	}
}
