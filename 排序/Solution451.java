package 排序;
import java.util.*;

public class Solution451 {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        //使用哈希表记录每个字符出现的频率
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c , map.getOrDefault(c , 0) + 1);
        }
        ArrayList<Character> list = new ArrayList<Character>(map.keySet());
        //字符去重后存入列表
        Collections.sort(list , (a , b)->map.get(b) - map.get(a));
        //将列表中的字符按照频率降序排序
        StringBuffer result = new StringBuffer();
        for (int j = 0 ; j < list.size() ; j++){//遍历顺序为字符按照频率递减的顺序
            char c = list.get(j); //字符c 出现了 time 次
            int time = map.get(c);
            for(int k = 0; k < time;k++)
                result.append(c); //按照出现频率拼接到排序后的字符串 拼接time个c
        }
        return result.toString();
    }
}
