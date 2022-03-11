package 贪心;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        //先第一个元素降序，第二个元素升序
        Arrays.sort(people , new Comparator <int[]>(){
            public int compare(int[] people1,int[] people2){
                if (people1[0] != people2[0]){
                    return people2[0] - people1 [0];
                }else{
                    return people1[1] - people2 [1];
                }
            }
        });
        ArrayList <int[]> result = new ArrayList<int[]>();
        for (int[] j : people){ //数组的值 ： 数组
            result.add(j[1], j); //把 元素依次出去 加入到 result的 第 第二个纬度位置
        }
        return result.toArray(new int[people.length][]);
    }
}
