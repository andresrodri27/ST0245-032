
public class lucky13
{
    public boolean lucky13(int[] nums) {
  boolean a = true;
  for(int i =0; i<nums.length; i++){
    if(nums[i]==1 || nums [i]==3){
      return false;
  }
  }
  return a;
}

}
