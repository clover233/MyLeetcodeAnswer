import java.util.Arrays;

class Solution154_1 {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            int mid = low + (high - low)/2;
            if (nums[mid] < nums[high]){
                high = mid;
            }else if (nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high = high - 1;
            }         
        }
        return nums[low];
    }
}

public class Solution154 {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}

class Solution154_2 {
    public int findMin(int[] nums) {
        int result = 5001;
        for(int i = 0; i<=nums.length-1 ;i++){
            if (nums[i]<result){
                result = nums[i];
            }
        }
        return result;
    }
}