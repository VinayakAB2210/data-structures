package com.vab.datastructure.collections.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {

    // Time Complexity - O(N)
    static void preOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // Time Complexity - O(N)
    static void inOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    // Time Complexity - O(N)
    static void postOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    // Time Complexity - O(N)
    static void levelOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()) {
            TreeNode currNode = queue.remove();

            if(currNode ==  null) {
                System.out.println();
                if(!queue.isEmpty()) {
                    queue.add(null);
                } else {
                    break;
                }
                
            } else {
                System.out.print(currNode.data + " ");

                if(currNode.left != null) {
                    queue.add(currNode.left);   
                }
                
                if(currNode.right != null) {
                    queue.add(currNode.right);
                }
                
            }
           
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, 7, -1, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeNode root = BinaryTreeUtil.buildPreOrderTree(nodes);

        System.out.println("Building tree ");
        System.out.println("Root is - " + root.data);
        BinaryTreeUtil.printBinaryTree(root);

        System.out.println("PreOrder Traversal");
        BinaryTreeTraversal.preOrderTraversal(root);

        System.out.println();
        System.out.println("InOrder Traversal");
        BinaryTreeTraversal.inOrderTraversal(root);


        System.out.println();
        System.out.println("PostOrder Traversal");
        BinaryTreeTraversal.postOrderTraversal(root);

        System.out.println();
        System.out.println("LevelOrder Traversal");
        BinaryTreeTraversal.levelOrderTraversal(root);
    }
}