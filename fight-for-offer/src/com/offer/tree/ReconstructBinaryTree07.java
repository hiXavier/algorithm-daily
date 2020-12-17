package com.offer.tree;

import java.util.Arrays;

/**
 * @author wuyanfeng
 * @description 重构前序遍历与中历遍历重构二叉树并输出。例前序{1,2,4,7,3,5,6,8},中序{4,7,2,1,5,3,8,6}
 * @date 2020/6/28 16:15
 */
public class ReconstructBinaryTree07 {

    public static TreeNode constructTree(int[] preNodes, int[] inNodes) {
        if (preNodes == null || inNodes == null) {
            return null;
        }
        if (preNodes.length == 0 || inNodes.length == 0 || preNodes.length != inNodes.length) {
            return null;
        }
        TreeNode root = new TreeNode(preNodes[0]);
        for (int i = 0; i < preNodes.length; i++) {
            if (inNodes[i] == preNodes[0]) {
                root.left = constructTree(Arrays.copyOfRange(preNodes, 1, i + 1),
                        Arrays.copyOfRange(inNodes, 0, i));
                root.right = constructTree(Arrays.copyOfRange(preNodes, i + 1, preNodes.length),
                        Arrays.copyOfRange(inNodes, i + 1, inNodes.length));
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] preNodes = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inNodes = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = constructTree(preNodes, inNodes);
        StringBuilder stringBuilder = new StringBuilder();
        PrintTree.inOrderRecursivePrint(root, stringBuilder);
        System.out.println(stringBuilder.toString());
        System.out.println("中序遍历 " + PrintTree.inOrderPrint(root));
        System.out.println("前序遍历 " + PrintTree.preOrderPrint(root));
        System.out.println("后序遍历 " + PrintTree.postOrderPrint(root));
    }
}


class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val) {
        this.val = val;
    }
}
