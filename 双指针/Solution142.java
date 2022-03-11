package 双指针;



 //Definition for singly-linked list. 
 //链表共有a+b个节点 fast/slow 步数 fast=2slow fast=slow+nb 所以，slow=nb
 //head结点走到如换点要走： slow = a + b  result = a 
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
       val = x;
       next = null;
    }
}

public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head , fast = head;
        while (true){
            if (fast == null || fast.next == null) {
                return null;
            } else {
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow) 
                    break;
            }
        }
        ListNode result = head;
        while(result != slow) {
            slow = slow.next;
            result = result.next;
        }
        return result;
    }
}
// public class Solution142 {
//     public ListNode detectCycle(ListNode head) {
//         ListNode pos = head;
//         HashSet<ListNode> seen = new HashSet<ListNode>(); //创建哈希表
//         while (pos != null){   //头节点不为空 
//             if ( seen.contains(pos)){     //向列表中添加head所指数据
//                 return pos;
//             } else {
//                 seen.add(pos);
//             }
//             pos = pos.next;    //head指针往后移动
//         }
//         return null;
//     }
// }
