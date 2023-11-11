package com.vab.datastructure.collections.binarytree;

public class SubTreeOfTree {

    public static boolean isSubTree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) {
            return true;
        }

        if(root == null) {
            return false;
        }

        if(root.data == subRoot.data) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    private static boolean isIdentical(TreeNode root, TreeNode subRoot) {

        // If subTree needs to be checked if it part of main tree
        // if(subRoot == null) {
        //     return true;
        // }

        // Proper sub tree where sub tree will be at the bottom of main tree
        if(root == null && subRoot == null) {
            return true;
        }

        if(root == null || subRoot == null) {
            return false;
        }

        if(root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        } 
        
        return false;
    }

    public static void main(String[] args) {
        int treeNodes[] = { 1, 2, 4, 7, -1, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int treeNodes1[] = {4, 7, -1, -1, -1};
        int treeNodes2[] = {4, 5, -1, -1, -1};
        int treeNodes3[] = {2, 4, -1, -1, 5, -1, -1};
        
        TreeNode root = BinaryTreeUtil.buildPreOrderTree(treeNodes);
        BinaryTreeUtil.idx = -1;
        TreeNode subRoot1 = BinaryTreeUtil.buildPreOrderTree(treeNodes1);
        BinaryTreeUtil.idx = -1;
        TreeNode subRoot2 = BinaryTreeUtil.buildPreOrderTree(treeNodes2);
        BinaryTreeUtil.idx = -1;
        TreeNode subRoot3 = BinaryTreeUtil.buildPreOrderTree(treeNodes3);

        System.out.println();
        System.out.println("Main Tree");
        BinaryTreeUtil.printBinaryTree(root);

        System.out.println();
        System.out.println("Sub Tree 1");
        BinaryTreeUtil.printBinaryTree(subRoot1);

        System.out.println();
        System.out.println("Sub Tree 2");
        BinaryTreeUtil.printBinaryTree(subRoot2);

        System.out.println();
        System.out.println("Sub Tree 3");
        BinaryTreeUtil.printBinaryTree(subRoot3);

        System.out.println("Tree 1 is subTree ? " + isSubTree(root, subRoot1));
        System.out.println("Tree 2 is subTree ? " + isSubTree(root, subRoot2));
        System.out.println("Tree 3 is subTree ? " + isSubTree(root, subRoot3));
    }
    
}
