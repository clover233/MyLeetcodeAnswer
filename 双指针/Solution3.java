package 双指针.滑动窗口;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) 
            return s.length();
        int flag=0;//子串起始位置
        int max = 0;//最大长度
        int len = 0;//子字符串长度

        for (int i = 0; i < s.length(); i++) {  //遍历开始
            int index = s.indexOf(s.charAt(i),flag);    //返回从flag位置开始，查找指定字符在字符串中第一次出现处的索引，有的话返回index；无，返回 -1
            if(index != i){     //从flag开始 出现了重复字符
                if(max<len){    //记录len
                    max = len; 
                }
                flag = index+1;//记录子串起始位置
                len = i-flag+1;//重新计算字串长度
            }
            else{
                len++;
            }
        }
        return len>max ? len : max;//若最后一个子串没有出现重复字符就需要判断
    }
}

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0; //遍历指针
        int flag = 0;   //暂留滑动窗口初始位置
        int length = 0; //无重复子串长度
        int result = 0; //存储无重复子串的最大值
        while(i < s.length()){
            int pos = s.indexOf(s.charAt(i),flag); //返回从flag位置开始，查找指定字符在字符串中第一次出现处的索引，有的话返回pos；无，返回 -1
            
            if ( pos < i){
                if (length > result){
                    result = length;
                }
                if (result >=s.length() - pos - 1){
                    return result;
                }
                length = i - pos - 1; //重新计算字串长度
                flag = pos + 1;     //记录子串起始位置
            }
            
            length++ ;
            i++;
        }
        return length;
    }
}