class SingleNumber {
    public int singleNumber(int[] nums){

        int result = 0;
        /*
         * Using XOR operation to give 0 as output for same numbers 
         * and Single Number will be left after all the XOR operation.
         */
        for(int i =0; i < nums.length; i++){
            result = result^nums[i];
        }
        return result;
    }
    
}
