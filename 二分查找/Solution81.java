class Solution {
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0){
            return false;
        }
        if(len == 1){
            if(nums[0] == target){
                return true;
            } else {
                return false;
            }
        }
        int left = 0;
        int right = len - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[left]==nums[mid]&&nums[right]==nums[mid]){ //二分查找时可能会有nums[left]==nums[mid]&&nums[right]==nums[mid]，此时无法判断两个区间哪个是有序的。
                ++left;
                --right;    //只能将当前二分区间的左边界加一，右边界减一，然后在新区间上继续二分查找
            } else if(nums[left]<=nums[mid]){
                if(nums[left]<=target && nums[mid]>target){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(nums[mid]<target && nums[len-1]>=target){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}


class Solution81 {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0){
            return false;
        }
        for (int i = 0 ; i <nums.length ;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}