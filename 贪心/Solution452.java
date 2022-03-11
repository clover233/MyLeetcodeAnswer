package 贪心;
import java.util.Arrays;
import java.util.Comparator;

class Solution452 {
    public int findMinArrowShots(int[][] points) { //points[]=[xstart , xend]
        if ( points.length == 0){
            return 0;
        }

        Arrays.sort(points, new Comparator<int []>(){ //将points按照右边界升序排序
            public int compare(int[] first, int[]next) {
                if ( first[1] > next[1] ){
                    return 1;
                } else if ( first[1] < next[1] ) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        int pos = points[0][1]; //获取排序后第一个气球右边界的位置，我们可以认为是箭 初始射入的位置
        int result = 1 ;    //射出的箭数

        for (int[] ball : points) { //读取气球位置，从points ball[0]为左 ball[1]为右
            if (ball[0] > pos) { //如果箭射入的位置pos小于下标为i这个气球的左边位置（第0+1列），说明这支箭不能击爆下标为i的这个气球
                pos = ball[1];  //需要再拿出一支箭
                result++;       //并且要更新这支箭射入的位置
            }
        }
        return result;
    }
}