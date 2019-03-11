
public class sum67
{
    public int sum67(int[] nums) {
  int total = 0;
  for(int i =0; i<nums.length;i++){
    if(nums[i]!=6)
    total += nums[i];
    else
    while(nums[i]!=7)
    i++;
  }
  return total;
}

}
