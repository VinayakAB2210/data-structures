package com.vab.datastructure.collections.binarytree;

public class BinaryTreeUtil {
    static int idx = -1;

    public static void printBinaryTree(TreeNode root) {
        if(root == null) {
            return;
        }

        String leftNodeData = root.left == null ? null : String.valueOf(root.left.data);
        String rightNodeData = root.right == null ? null : String.valueOf(root.right.data); 
        System.out.println(root.data + " -> " + leftNodeData + " " + rightNodeData);
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }

    public static TreeNode buildPreOrderTree(int [] nodes) {
        idx++;

        if(nodes[idx] == -1) {
            return null;
        }

        TreeNode newNode = new TreeNode(nodes[idx]);
        newNode.left = buildPreOrderTree(nodes);
        newNode.right = buildPreOrderTree(nodes);

        return newNode;
    }

    public static class TreeInfo {
        int ht;
        int diam;

        public TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }
}
