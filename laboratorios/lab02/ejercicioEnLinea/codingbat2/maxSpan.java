
public class maxSpan
{
  public int maxSpan(int[] nums){
  int max = 0;
  for(int i=0; i<nums.length;i++){
    for(int j=nums.length-1; j>=0;j--){
      if(nums[i]==nums[j]){
        max = Math.max(max,Math.abs(i-j+1));
      }
    }
  }
  return max;
}
}
