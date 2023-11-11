package com.vab.datastructure.collections.binarytree;

import com.vab.datastructure.collections.binarytree.BinaryTreeUtil.TreeInfo;

public class BinaryTreeOperations {

    // Time Complexity - O(N)
    public static int countBinaryTreeNodes(TreeNode root){
        if(root == null) {
            return 0;
        }

        int leftSubTreeCount = countBinaryTreeNodes(root.left);
        int rightSubTreeCount = countBinaryTreeNodes(root.right);

        return leftSubTreeCount + rightSubTreeCount + 1;
    }

    // Time Complexity - O(N)
    public static int sumBinaryTreeNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftSubTreeSum = sumBinaryTreeNodes(root.left);
        int rightSubTreeSum = sumBinaryTreeNodes(root.right);

        return leftSubTreeSum + rightSubTreeSum + root.data;
    }

    // Time Complexity - O(N)
    public static int heightOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)) + 1;
    }

    // Time Complexity - O(N^2) as there are calls to find diameter as well as to find heaight
    public static int diameterOfTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int diam1 = diameterOfTree(root.left);
        int diam2 = diameterOfTree(root.right);
        int diam3 = heightOfBinaryTree(root.left) + heightOfBinaryTree(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    public static TreeInfo diameterOfTreeOptimized(TreeNode root) {
        if(root ==  null) {
            return new TreeInfo(0, 0);
        }
        
        TreeInfo left = diameterOfTreeOptimized(root.left);
        TreeInfo right = diameterOfTreeOptimized(root.right);

        int ht = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int diam = (Math.max(Math.max(diam1, diam2), diam3));

        return new TreeInfo(ht, diam);
    }
    
    public static void main(String[] args) {

        int nodes[] = { 1, 2, 3, 7, -1, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};
        TreeNode root = BinaryTreeUtil.buildPreOrderTree(nodes);

        System.out.println("Building tree ");
        System.out.println("Root is - " + root.data);
        BinaryTreeUtil.printBinaryTree(root);

        System.out.println("Count of Nodes - " + BinaryTreeOperations.countBinaryTreeNodes(root));  
        System.out.println("Sum of Nodes - " + BinaryTreeOperations.sumBinaryTreeNodes(root));
        System.out.println("Height of Binary Tree - " + BinaryTreeOperations.heightOfBinaryTree(root));
        System.out.println("Diameter of Binary Tree - " + BinaryTreeOperations.diameterOfTree(root));      
        System.out.println("Diameter (Optimized) of Binary Tree - " + BinaryTreeOperations.diameterOfTreeOptimized(root).diam); 
    }
}
