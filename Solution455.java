import java.util.Arrays;
class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);     //胃口值排序
        Arrays.sort(s);     //饼干值排序
        int a = g.length;   //胃口数组的长度
        int b = s.length;   //饼干数组的长度
        int child = 0;      //孩子胃口指针
        int cookie = 0;     //饼干大小指针
        while(child < a && cookie < b){     
            if (g[child] <= s[cookie]){     //胃口 <= 饼干
                child++;    //孩子胃口 往右移
            }
            cookie++;       //饼干 往右移
        }
        return child;       //孩子/胃口数
    }
}