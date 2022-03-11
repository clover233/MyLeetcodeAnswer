package 双指针;

public class Solution76 {
    public String minWindow(String s, String t) {
        int[] map = new int[512];

        for (char ch : t.toCharArray())
            map[ch]++;

        int len = t.length();
        int left = 0;
        int right = 0;

        int winlen = Integer.MAX_VALUE;
        int start = 0;
        
        while (right < s.length()){
            if (map[s.charAt(right++)]-- > 0)
                len--;
            while(len == 0){
                if (right - left < winlen){
                    winlen = right - left;
                    start = left;
                }
                if (map[s.charAt(left++)]++ == 0)
                    len++;
            }
        }
        if(winlen != Integer.MAX_VALUE)
            return s.substring(start , start + winlen);
        return "";
    }
}
