package 双指针;

import java.util.Arrays;

public class Solution88 { 
    //双指针
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] nums3 = new int[m + n];
        int tmp;
        while ( p1 < m || p2 < n) {
            if (p1 == m){
                tmp = nums2[p2++];
            }else if (p2 == n ){
                tmp = nums1[p1++];
            }else if (nums1[p1] < nums2[p2]){
                tmp = nums1[p1++];
            }else{
                tmp = nums2[p2++];
            }
            nums3[p1 + p2 - 1] = tmp;
        }
        for (int i = 0 ; i< m + n ; i++){
            nums1[i] = nums3 [i];
        }
        
    }
}

class Solution88_1 {
    //合并后排序 并没用到nums1和nums2有序
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for ( int i = 0 ; i < n ; i++ ){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}

