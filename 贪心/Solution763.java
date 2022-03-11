package 贪心;
import java.util.ArrayList;
import java.util.List;

public class Solution763 {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26]; //最长长度为26
        int start = 0;
        int end = 0;
        int len = s.length();
        List <Integer> result = new ArrayList<Integer>(); //初始化一个数组队列
        for (int i = 0; i < len ; i++){
            last[s.charAt(i) - 'a'] = i ;   //i处字符与a的差，为最后出现的地方
        }
        for (int i = 0; i < len ; i++){
            end = Math.max(end , last[s.charAt(i) - 'a']);
            if ( i == end ){
                result.add(end - start + 1);
                start = end++;
            }
        }
        return result;
    }
}
