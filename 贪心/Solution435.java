package 贪心;
import java.util.Arrays;
import java.util.Comparator;

class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int result = 0;
        if ( n == 0){
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b) {
            return a[0]-b[0];              //如果这个值大于0，则是升序
            }
        }); //[a,b]的b尾部排序

        int end = intervals [0][1];  //记录区间尾部位置
        for ( int i = 1; i < n ; i++){
            if(intervals[i][0] < end){  //如果重叠了 必须移除一个 result++
                result++;
                end = Math.min(end , intervals[i][1]);  //更新尾部 取更小的
            } else {
                end = intervals[i][1];  //没重叠的话，只需更新尾部位置即可
            }
        }
        return result;
    }
}