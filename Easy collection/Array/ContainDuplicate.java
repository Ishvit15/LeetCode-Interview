import java.util.Arrays;

class ContainDuplicate {
    public boolean containDuplicate( int[] nums){
        Arrays.sort(nums);
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}
