//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 5348 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        setListNode(l1, l2, listNode, 0);
        return listNode;
    }

    public ListNode setListNode(ListNode l1, ListNode l2, ListNode listNode, int nextSum) {
        if (l1 == null) {
            l1 = new ListNode(0,null);
        }
        if (l2 == null) {
            l2 = new ListNode(0,null);
        }

        int sum = l1.val + l2.val + nextSum;
        listNode.val = (sum % 10);

        if(l1.next == null && l2.next == null && sum / 10 == 0){
            return listNode;
        }
        listNode.next = new ListNode();

        return setListNode(l1.next, l2.next, listNode.next, sum / 10);
    }

}
//leetcode submit region end(Prohibit modification and deletion)
