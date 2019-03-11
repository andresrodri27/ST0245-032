
public class countClumps
{
    public int countClumps(int[] nums) {
        int index = 0;
        int a = 0;

        while(a < nums.length) {
            int kind = nums[a];
            a++;
            int length = 1;
            while(a < nums.length && nums[a] == kind){
                a++;
                length++;
            }
            if(length > 1){
                index++;
            }
        }
        return index;
    }
}
