package 排序;

public class Solution75 {
    public void sortColors(int[] nums) {
        int ptr = 0;
        for (int i = 0 ; i < nums.length ;i++){
            if(nums[i] == 0){
                int tmp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = tmp;
                ptr++;
            }
        }
        for (int i = ptr ; i < nums.length ;i++){
            if(nums[i] == 1){
                int tmp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = tmp;
                ptr++;
            }
        }
    }
}