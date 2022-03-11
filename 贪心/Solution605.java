package 贪心;
class Solution605_1 {   //跳格子，还可以用贪心
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for ( int i = 0 ; i < len && n > 0 ; i++){
            if (flowerbed[i] == 1){
                i++;
            } else if  ( i == len-1 || flowerbed[ i + 1 ] == 0){    //len-1 防止1000100 末尾两个0这种
                n--;
                i++;
            } else {
                i++;
                i++;
            }
        }
        return n <= 0;
    }
}

