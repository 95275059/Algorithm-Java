import java.util.HashMap;
import java.util.Map;
public class TwoSum1 {
	public int[] twoSum(int[] nums, int target) {
		// 哈希表
		// 时间击败33.18%，内存击败51.89%
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i=0; i<nums.length; i++) {
			if (hashmap.containsKey(target-nums[i])) 
				return new int[] {hashmap.get(target-nums[i]), i};
			hashmap.put(nums[i], i);
		}
		return new int[0];
    }
}
