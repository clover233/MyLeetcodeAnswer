package 双指针;

class Solution633 {
    public boolean judgeSquareSum(int c) { // 0 <= c <= 2^31-1
        int a = 0;
        int b = (int) Math.sqrt (c) ; //long 以防2147483600
        while(a <= b){  //<= 以防2
            int sum = a * a + b * b; 
            if(sum == c){
                return true;
            }else if(sum < c){
                a++;
            }else{
                b--;
            }
        }
        return false;
    }
}