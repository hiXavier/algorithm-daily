package com.xaver.pract;

/**
 * @authore Xavier
 * @description You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * @date 2018/2/24
 */
public class AddTwoNumbers {

    /**
     * 思路:单链表的反转(错误:溢出）
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstVal = 0;
        for(int i = 0; l1 != null; i++){
            firstVal += l1.val * Math.pow(10,i);
            l1 = l1.next;
        }
        int secVal = 0;
        for(int j = 0; l2 != null; j++){
            secVal += l2.val * Math.pow(10,j);
            l2 = l2.next;
        }
        int sum = firstVal + secVal;
        if(sum == 0){
            return  new ListNode(0);
        }
        ListNode headNode = new ListNode(0);
        ListNode tail = headNode;
        while (sum > 0){
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            sum = sum/10;
        }
        return headNode.next;
    }

    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

      ListNode getAListNode(int...nums){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for(int num:nums){
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return head.next;
    }

    void outputNode(ListNode ln){
          while (ln != null){
              System.out.print(ln.val);
              ln = ln.next;
          }
    }
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode ln1 = addTwoNumbers.getAListNode(9);
        ListNode ln2 = addTwoNumbers.getAListNode(1,9,9,9,9,9,9,9,9,9);
        ListNode listNode = addTwoNumbers.addTwoNumbers(ln1,ln2);
        addTwoNumbers.outputNode(listNode);
    }


}
