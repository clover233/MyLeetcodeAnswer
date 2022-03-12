package 双指针;

public class Solution345 {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int i = 0 , j = s.length() - 1;
        while(i<j){
            if ( i < s.length() && !yuan(array[i])){
                ++i;
            } else if ( j > 0 && !yuan(array[j])){
                --j;
            } else {
                char tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                ++i;
                --j;
            }
        }
        return new String(array);
    }
    public boolean yuan(char ch){
        String Str = new String("AEIOUaeiou");
        return Str.indexOf(ch)>=0;
    }    
}
