package com.offer.list;

/**
 * @Author wuyanfeng
 * @Description
 * @Date 2020/6/17 11:58
 */
public class ReverseList {

    /**
     * 递归实现
     *
     * @param node
     * @return
     */
    public static ListNode recursive(ListNode node) {
        if (node.next == null || node == null) {
            return node;
        }
        ListNode node1 = recursive(node.next);
        node.next.next = node;
        node.next = null;
        return node1;
    }

    /**
     * 循环遍历
     * 关键：设置三个临时变量
     * pre 指带前一个node
     * cur 当前遍历的node
     * next 下一级node
     * @param node
     * @return
     */
    public static ListNode traverse(ListNode node) {
        if (node.next == null || node == null) {
            return node;
        }
        ListNode pre = null;
        ListNode cur = node;
        ListNode next = cur.next;
        while (next != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return cur;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(null, 1);
        ListNode node1 = new ListNode(node, 2);
        ListNode node2 = new ListNode(node1, 3);
        ListNode node3 = new ListNode(node2, 4);
        ListNode reNode = recursive(node3);
        ListNode traverseNode = traverse(reNode);
        PrintBackward.recursive(traverseNode);
    }
}
