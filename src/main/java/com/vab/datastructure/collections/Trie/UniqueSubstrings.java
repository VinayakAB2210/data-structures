package com.vab.datastructure.collections.Trie;

import java.util.Scanner;

public class UniqueSubstrings {

    private static Integer countNodes(TrieNode currNode) {
        if(currNode == null) {
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++) {
            if(currNode.children[i] != null) {
                count += countNodes(currNode.children[i]);
            }
        }

        return count + 1;
    }

    private static void addAllSuffixToTrie(String str) {
        for(int i=0; i<str.length(); i++) {
            String subStr = str.substring(i);
            TrieOperations.insert(subStr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to find the count of unique substrings");
        String str = sc.next();

        addAllSuffixToTrie(str);
        TrieNode currNode = TrieOperations.root;

        System.out.println("Count of unique substrings - " + countNodes(currNode));
        sc.close();
    }

}
