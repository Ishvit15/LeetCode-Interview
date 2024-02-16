class MoveZeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j =0;
        // Bringing the Non-Zero numbers forward in the Array.
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        // Putting Zeros to the remaining places of the Array.
        while(j < n){
            nums[j++] = 0;
        }
    }
}
