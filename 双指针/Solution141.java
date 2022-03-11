package 双指针;

public class Solution141 { //双指针
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next; 
        }
        return true;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

// import java.util.HashSet;
// public class Solution141 { //哈希表
//     public boolean hasCycle(ListNode head) {
//         HashSet<ListNode> seen = new HashSet<ListNode>(); //创建哈希表
//         while (head != null){   //头节点不为空 
//             if ( !seen.add((ListNode) head) ){     //向列表中添加head所指数据
//                 return true;
//             }
//             head = head.next;    //head指针往后移动
//         }
//         return false;
//     }
//     class ListNode {
//         int val;
//         ListNode next;
//         ListNode(int x) {
//             val = x;
//             next = null;
//         }
//     }
// }

