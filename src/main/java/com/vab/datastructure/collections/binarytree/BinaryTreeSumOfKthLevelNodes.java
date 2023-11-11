package com.vab.datastructure.collections.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeSumOfKthLevelNodes {

    static int sumOfKthLevelNodes(TreeNode root, int k) {
        if(root == null) {
            return 0;
        }

        if(k==1) {
            return root.data;
        }

        int currLevel = 1;
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()) {
            TreeNode currNode = queue.remove();
            
            if(currNode == null) {
                if(!queue.isEmpty()) {
                    currLevel++;
                    queue.add(null);
                } else {
                    break;
                }  
            } else {
                if(currLevel == k) {
                    sum += currNode.data;
                }

                if(currLevel < k) {
                    if(currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    
                    if(currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            } 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nodes[] = { 1, 2, 4, 7, -1, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        TreeNode root = BinaryTreeUtil.buildPreOrderTree(nodes);
        System.out.println("Enter level of sub tree to find the sum (only 4 levels allowed in the test data)");
        int k = sc.nextInt();

        int sum = sumOfKthLevelNodes(root, k);
        System.out.println("Sum of tree nodes at level " + k + " is " + sum);

        sc.close();
    }
}
