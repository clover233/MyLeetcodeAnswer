class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        if(nums.length == 0){
            return result;
        }

        while(left <= right){
            mid = left + (right - left)/2;
            if (nums[mid] < target){
                left = mid + 1 ;
            } else {
                right = mid - 1;
            }
        }
        if (left == nums.length || nums[left] != target){
            return result;
        } else {
            result[0] = left ;  //left = right+1
        }

        left = 0 ;
        right = nums.length - 1;
        while(left <= right){
            mid = left + (right - left)/2;
            if (nums[mid] <= target){ //这使得left总是在右边界的后面（如果边界存在），右边界 = left - 1
                left = mid + 1 ;
            } else {
                right = mid - 1;
            }
        }
        result[1] = right;
        return result;
    }
}

class Solution34_1 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        if(nums.length == 0){
            return result;
        }
        if(nums.length == 1){
            if(nums[0]==target){
                result[0] = 0;
                result[1] = 0;
            }
            return result;
        }

        while(left <= right){
            mid = left + (right - left)/2;
            if (nums[mid] < target){
                left = mid + 1 ;
            } else {
                right = mid - 1;
            }
        }
        if (left == nums.length || nums[left] != target){
            return result;
        } else {
            result[0] = left ;  //left = right+1
        }
        
        right = left;
        int tmp = left;
        while(tmp<nums.length){
            if(nums[tmp] == target){
                right = tmp;
            }else{
                result[1] = right;
            }
            tmp = tmp + 1;
        }
        if(nums[nums.length - 1]==target){
            result[1] = nums.length - 1;
        }
        return result;
    }
}