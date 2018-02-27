package com.xaver.pract;

import java.util.LinkedList;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/2/23
 */
public class ReverseLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    Node getLinkedNode(int ... nums){
        Node hn = new Node(0);
        Node curNode = hn;
        for(int num : nums){
            curNode.next = new Node(num);
            curNode = curNode.next;
        }
        return hn.next;
    }
    void outputNode(Node node){
        while (node != null){
            System.out.print(node.val);
            node = node.next;
        }
    }

    /**
     * 迭代方法
     * @param orgNode
     * @return
     */
    Node reverseInIterationWay(Node orgNode){
        Node curNode = new Node(orgNode.val).next;
        Node hn = new Node(0);
        while (orgNode != null){
            hn = new Node(orgNode.val);
            hn.next = curNode;
            curNode = hn ;
            orgNode = orgNode.next;
        }
        return hn;
    }

    Node reverseInRecursionWay(Node orgNode){
        if(orgNode == null || orgNode.next == null){
            return orgNode;
        }
        Node node = reverseInRecursionWay(orgNode.next);
        //反转
        orgNode.next.next = orgNode;
        orgNode.next = null;
        return node;
    }

    public static void main(String[] args) {
        ReverseLinkedList rl = new ReverseLinkedList();

        Node orgNode = rl.getLinkedNode(3,8,5);
        System.out.println("迭代反转前" );
        rl.outputNode(orgNode);
        System.out.println();
        System.out.println("迭代反转后");
        orgNode = rl.reverseInIterationWay(orgNode);
        rl.outputNode(orgNode);
        System.out.println();
        System.out.println("递归反转前" );
        rl.outputNode(orgNode);
        System.out.println();
        System.out.println("递归反转后");
        orgNode = rl.reverseInRecursionWay(orgNode);
        rl.outputNode(orgNode);
    }


}
