package 排序;

class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSort ( nums , 0 , nums.length-1 );
        return nums[nums.length - k];
    }

    public void quickSort( int[] arr , int left , int right){
        if(left >= right){
            return;
        }
        int p = left;
        int index = left + 1;
        for(int i = index; i <= right ; i++){
            if(arr[i] < arr[p]){
                swap(arr,index,i);
                index++;
            }
        }
        swap(arr,p,index-1);
        quickSort(arr,left,index-1);
        quickSort(arr,index,right);
    }
    public void swap(int[] arr , int i , int j){
        int tmp = arr[i];
        arr[i] = arr [j];
        arr[j] = tmp;
    }
}