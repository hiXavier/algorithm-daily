package com.offer.list;

public class ListNode {
    ListNode next;
    int val;

    public ListNode(ListNode node, int val) {
        this.next = node;
        this.val = val;
    }
          ListNode() {}
      ListNode(int val) { this.val = val; }
}
