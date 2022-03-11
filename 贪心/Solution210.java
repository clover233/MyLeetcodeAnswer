package 贪心;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution210 { //DFS+拓扑排序
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(numCourses <= 0) {
            return new int[0];
        }

        HashSet<Integer>[] adj = new HashSet[numCourses];
        for(int i = 0 ; i < numCourses ;i++){
            adj[i] = new HashSet<>();
        }

        int[] inDegree = new int[numCourses];
        for(int[] p : prerequisites){
            adj[p[1]].add(p[0]);
            inDegree[p[0]]++;
        }

        Queue<Integer> Queue = new LinkedList<>();
        for(int i = 0; i < numCourses ; i++){
            if(inDegree[i] == 0)
                Queue.offer(i);
        }

        int[] res = new int[numCourses];
        int count = 0;

        while(!Queue.isEmpty()){
            Integer head =Queue.poll();
            res[count] = head;
            count++;

            Set<Integer> suc = adj[head];
            for(Integer next : suc) {
                inDegree[next]--;
                if (inDegree[next] == 0){
                    Queue.offer(next);
                }
            }
        }
        if ( count ==numCourses)
            return res;
        return new int[0];
    }
}