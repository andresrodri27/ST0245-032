
public class Punto2
{
    public boolean groupSum(int start, int[] nums, int target){
        if(start==nums.length){
            return (target==0);
        }
        boolean universo1=groupSum(start+1,nums,target);
        boolean universo2=groupSum(start+1,nums,target-nums[start]);
        return universo1 || universo2;
    }
}
