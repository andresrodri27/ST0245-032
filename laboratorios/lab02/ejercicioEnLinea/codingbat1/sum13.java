
public class sum13
{
    public int sum13(int[] nums) {
  int total= 0;
  if(nums.length == 0)
  return 0;
  else
  for(int i=0; i<nums.length; i++){
    if(nums [i]==13){
      i++;
    }else{
      total += nums[i];
    }
  }
  return total;
}

}
