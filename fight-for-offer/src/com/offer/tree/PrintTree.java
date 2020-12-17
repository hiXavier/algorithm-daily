package com.offer.tree;

import java.util.Stack;

/**
 * @author wuyanfeng
 * @description 打印树
 * @date 2020/6/28 17:22
 */
public class PrintTree {

    /**
     * 前序遍历打印
     *
     * @param tree
     * @return
     */
    public static String preOrderPrint(TreeNode tree) {
        if (tree == null) {
            return null;
        }
        StringBuilder treeSb = new StringBuilder();
        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(tree);
        while (treeNodeStack.size() > 0) {
            TreeNode treeNode = treeNodeStack.pop();
            treeSb.append(treeNode.val + " ");
            if (treeNode.right != null) {
                treeNodeStack.push(treeNode.right);
            }
            if (treeNode.left != null) {
                treeNodeStack.push(treeNode.left);
            }
        }
        return treeSb.toString();
    }

    public static void preOrderRecursivePrint(TreeNode tree, StringBuilder stringBuilder) {
        if (tree == null) {
            return;
        }
        stringBuilder.append(tree.val + " ");
        if (tree.left != null) {
            preOrderRecursivePrint(tree.left, stringBuilder);
        }
        if (tree.right != null) {
            preOrderRecursivePrint(tree.right, stringBuilder);
        }
    }

    /**
     * 中序遍历打印
     *
     * @param tree
     * @return
     */
    public static String inOrderPrint(TreeNode tree) {
        if (tree == null) {
            return null;
        }
        StringBuilder treeSb = new StringBuilder();
        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(tree);
        while (treeNodeStack.size() > 0) {
            TreeNode treeNode = treeNodeStack.pop();
            if (treeNode.right != null) {
                treeNodeStack.push(treeNode.right);
                treeNode.right = null;
            }
            if (treeNode.left == null && treeNode.right == null) {
                treeSb.append(treeNode.val + " ");
                continue;
            }
            treeNodeStack.add(treeNode);
            if (treeNode.left != null) {
                treeNodeStack.push(treeNode.left);
                treeNode.left = null;
            }
        }
        return treeSb.toString();
    }

    public static void inOrderRecursivePrint(TreeNode tree, StringBuilder stringBuilder) {
        if (tree.left != null) {
            inOrderRecursivePrint(tree.left, stringBuilder);
        }
        stringBuilder.append(tree.val + " ");
        if (tree.right != null) {
            inOrderRecursivePrint(tree.right, stringBuilder);
        }
    }

    public static void postOrderRecursivePrint(TreeNode tree, StringBuilder stringBuilder) {
        if (tree.left != null) {
            postOrderRecursivePrint(tree.left, stringBuilder);
        }
        if (tree.right != null) {
            postOrderRecursivePrint(tree.right, stringBuilder);
        }
        stringBuilder.append(tree.val + " ");
    }

    /**
     * 后序遍历打印
     *
     * @param tree
     * @return
     */
    public static String postOrderPrint(TreeNode tree) {
        if (tree == null) {
            return null;
        }
        StringBuilder treeSb = new StringBuilder();
        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(tree);
        while (treeNodeStack.size() > 0) {
            TreeNode treeNode = treeNodeStack.pop();
            if (treeNode.left == null && treeNode.right == null) {
                treeSb.append(treeNode.val + " ");
                continue;
            }
            treeNodeStack.add(treeNode);
            if (treeNode.right != null) {
                treeNodeStack.push(treeNode.right);
                treeNode.right = null;
            }
            if (treeNode.left != null) {
                treeNodeStack.push(treeNode.left);
                treeNode.left = null;
            }
        }
        return treeSb.toString();
    }
}
