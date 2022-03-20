class Solution153 {
    public int findMin(int[] nums) { //互不相同的数组
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int pivot = (high - low)/2 + low;
            if (nums[pivot] < nums[high]){
                high = pivot;
            }
            if (nums[pivot] > nums[high]){
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}