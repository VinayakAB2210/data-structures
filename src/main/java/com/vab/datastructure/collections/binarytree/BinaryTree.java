package com.vab.datastructure.collections.binarytree;

public class BinaryTree {

    static int idx = -1;

    static TreeNode buildPreOrderTree(int [] nodes) {
            idx++;

            if(nodes[idx] == -1) {
                return null;
            }

            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildPreOrderTree(nodes);
            newNode.right = buildPreOrderTree(nodes);

            return newNode;
        }
    
}
