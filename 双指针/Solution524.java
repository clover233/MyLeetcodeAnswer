package 双指针;

import java.util.Comparator;
import java.util.List;

public class Solution524 {
    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";

        dictionary.sort(Comparator.naturalOrder()); //ArrayList sort()方法: comparator - 顺序方式 naturalOrder以自然顺序排序，字母的顺序:a-z

        for (String dic : dictionary) { //遍历每个dic元素
            for (int i = 0, j = 0; i < s.length(); i++) { //i 指向 s每个字符指针 j 指向dictionary中的dic元素中 每个字符的指针
                if (s.charAt(i) == dic.charAt(j)) 
                    j++;
                if (j == dic.length()) {
                    if(dic.length() > result.length()){
                        result = dic;
                    }
                    break;
                }
            }
        }
        return result;
    }    
}
