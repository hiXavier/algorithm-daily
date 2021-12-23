package com.offer.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 *
 * @author wuyanfeng
 * @description
 * @date 2021/6/24 22:21
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> nodeList = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        while (nodeStack.size() > 0) {
            TreeNode node = nodeStack.pop();
            if (node.left == null && node.right == null) {
                nodeList.add(node.val);
            }
            if (node.right != null) {
                nodeStack.push(node.right);
                node.right = null;
            }
            nodeStack.push(node);
            if (node.left != null) {
                nodeStack.push(node.left);
                node.left = null;
            }
        }
        return nodeList;
    }
}
