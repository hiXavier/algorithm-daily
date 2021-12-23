package com.offer.list;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/8/22 11:30
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(head, 0);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(null, 1);
        ListNode node1 = new ListNode(node, 2);
        ListNode node2 = new ListNode(node1, 3);
        ListNode node3 = new ListNode(node2, 4);

        ListNode delNode = new RemoveNthNodeFromEndOfList().removeNthFromEnd(node3,2);
        System.out.println(delNode);

    }
}
