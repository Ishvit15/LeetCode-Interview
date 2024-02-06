class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n ==0)
            return;

        int offset = k % n; // n times rotation will five us the original array.
        reverse(nums, 0, n-1);
        reverse(nums, 0, offset-1);
        reverse(nums, offset, n-1);
    }
    
    void reverse(int[] nums, int start, int end) {
        int low = start , high = end ;
        while(low < high) {
            int temp = nums[high];
            nums[high] = nums[low];
            nums[low] =temp;
            low++;
            high--;
        }
    }
}
