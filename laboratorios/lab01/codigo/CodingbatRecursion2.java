
public class CodingbatRecursion2
{
public boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    return groupNoAdj(start + 2, nums, target - nums[start])
            || groupNoAdj(start + 1, nums, target);
}


public boolean groupSum6(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    if (nums[start] == 6)
        return groupSum6(start + 1, nums, target - nums[start]);
    return groupSum6(start + 1, nums, target - nums[start])
            || groupSum6(start + 1, nums, target);
}


public boolean groupSumClump(int start, int[] nums, int target)
{
	if(start >= nums.length)
 	{
		if(target == 0)
  		return true;
  	return false;
 	}
 	int i = start + 1;
 	for(;  i < nums.length && nums[start] == nums[i]; i++);
 	if(groupSumClump(i, nums, target - ((i - start) * nums[start])))
 		return true;
 	return groupSumClump(i, nums, target);	
}


public boolean splitOdd10(int[] nums) {
    return helper(0, nums, 0, 0);
}
private boolean helper(int start, int[] nums, int sum1, int sum2) {
    if (start >= nums.length)
        return sum1 % 10 == 0 && sum2 % 2 == 1 || sum1 % 2 == 1
                && sum2 % 10 == 0;
    return helper(start + 1, nums, sum1 + nums[start], sum2)
            || helper(start + 1, nums, sum1, sum2 + nums[start]);
}


public boolean split53(int[] nums) {
    return helper(0, nums, 0, 0);
}
private boolean helper(int start, int[] nums, int sum1, int sum2) {
    if (start >= nums.length) return sum1 == sum2;
    if (nums[start] % 5 == 0)
        return helper(start + 1, nums, sum1 + nums[start], sum2);
    if (nums[start] % 3 == 0)
        return helper(start + 1, nums, sum1, sum2 + nums[start]);
 
    return helper(start + 1, nums, sum1 + nums[start], sum2)
            || helper(start + 1, nums, sum1, sum2 + nums[start]);
}


}
