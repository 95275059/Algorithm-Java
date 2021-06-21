import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class ContainsDuplicate217 {
	public boolean containsDuplicate(int[] nums) {
		// hash
		// 时间击败56.40%，内存击败58.87%
		Set<Integer> set = new HashSet<Integer>();
		for (int x : nums) {
			if (!set.add(x))
				return true;
		}
		return false;
	}
	public boolean containsDuplicate1(int[] nums) {
		//排序
		// 时间击败96.86%，内存击败90.13%
		Arrays.sort(nums);
		for (int i=0; i<nums.length-1; i++) {
			if(nums[i] == nums[i+1])
				return true;
		}
		return false;
	}
}
