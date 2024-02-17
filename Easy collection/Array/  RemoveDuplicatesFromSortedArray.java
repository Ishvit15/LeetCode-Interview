class RemoveDuplicatesFromSortedArray {
    public int removeDuplicate(int[] nums){
        int k = nums.length;
        if(k==0 || k==1)
            return k;
        int result = 1; // To count the numbers of unique numbers in the array.
        for(int i = 1; i < k ; i++) {
            /*
            If condition to remove the duplicate numbers from the array
            */
            if(nums[i] != nums[result-1]){
                nums[result] = nums[i]; 
                result++;
            }
        }
        return result;
    }
}