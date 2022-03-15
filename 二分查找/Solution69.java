class Solution39 {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        if(x == 1)
            return 1;
        int left = 1;
        int right = x / 2;
        while (left < right){
            int mid = left + (right - left + 1)/2; //这里为了避免乘法溢出，改用除法
            if (mid > x / mid){ //下一轮搜索区间是 [left..mid - 1]
                right = mid - 1;
            } else {    //下一轮搜索区间是 [mid..right]
                left = mid;
            }
        }
        return left ;
    }
}