package com.offer.list;

import java.util.Stack;

/**
 * @Author wuyanfeng
 * @Description 从后往前打印链表
 * @Date 2020/6/17 11:27
 */
public class PrintBackward {

    public static void recursive(ListNode node) {
        if (node == null) {
            return;
        }
        recursive(node.next);
        System.out.println(node.val);
    }

    public static void useStack(ListNode node) {
        if (node == null) {
            return;
        }
        Stack<Integer> integerStack = new Stack<>();
        while (node != null) {
            integerStack.push(node.val);
            node = node.next;
        }
        while (integerStack.size() > 0) {
            System.out.println(integerStack.pop());
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(null, 1);
        ListNode node1 = new ListNode(node, 2);
        ListNode node2 = new ListNode(node1, 3);
        ListNode node3 = new ListNode(node2, 4);
        recursive(node3);
        useStack(node3);
    }
}

class ListNode {
    ListNode next;
    int val;

    public ListNode(ListNode node, int val) {
        this.next = node;
        this.val = val;
    }
}
