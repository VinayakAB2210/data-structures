package com.vab.datastructure.collections.binarysearchtree;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {

    // O(N)
    public static TreeNode insert(TreeNode root, int val) {

        if(root == null) {
            root = new TreeNode(val);
            return root;
        }
        if(val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        
        return root;
    }

    // O(N)
    public static void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // O(H) where H is height of BST
    public static boolean search(TreeNode root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key){
            return true;
        } else if(root.data < key) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }

    public static TreeNode delete(TreeNode root, int key){
        if(root.data > key) {
            root.left = delete(root.left, key);
        } else if(root.data < key) {
            root.right = delete(root.right, key);
        } else { // root.data = key
            // case 1 - No children
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 - single child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // case 3 - two children
            TreeNode inOrderSuccessor = findInOrderSuccessor(root.right);
            root.data = inOrderSuccessor.data;
            root.right = delete(root.right, inOrderSuccessor.data);
        }

        return root;
    }

    public static TreeNode findInOrderSuccessor(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInRange(TreeNode root, int x, int y) {
        if(root == null) {
            return;
        }

        if(root.data >= x && root.data <=y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if(root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    public static void printRootToLeafPaths(TreeNode root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }

        path.add(root.data);
        if(root.left == null && root.right == null) {  // Leaf nodes
            printPaths(path);
        } else { // Non-leaf nodes
            printRootToLeafPaths(root.left, path);
            printRootToLeafPaths(root.right, path);
        }

        path.remove(path.size()-1);
    }

    private static void printPaths(ArrayList<Integer> path) {
        for(Integer p : path) {
            System.out.print(p + "->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;

        // int n;
        // System.out.println("Enter number of nodes in BST");
        // n = sc.nextInt();

        // System.out.println("Enter BST nodes one by one");
        // for(int i=0; i<n; i++){
        //     root = insert(root, sc.nextInt());
        // }

        int nodes[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14};
        for(int i=0; i<nodes.length; i++){
            root = insert(root, nodes[i]);
        }

        System.out.println("InOrder BST traversal");
        inOrder(root);

        System.out.println();
        System.out.println("Key 3 Found? " +  search(root, 3));
        System.out.println("Key 7 Found? " +  search(root, 7));

        System.out.println("Deleting node 5");
        delete(root, 5);
        System.out.println("InOrder BST traversal");
        inOrder(root);

        System.out.println();
        System.out.println("Printing nodes in the range - (3, 12)");
        printInRange(root, 3, 12);
        sc.close();

        System.out.println();
        System.out.println("All paths from root to leaf");
        printRootToLeafPaths(root, new ArrayList<Integer>());
    }
}
