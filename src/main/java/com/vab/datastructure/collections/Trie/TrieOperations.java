package com.vab.datastructure.collections.Trie;

public class TrieOperations {
    static TrieNode root = new TrieNode();

    // O(L) where L is length of longest string in given array
    static void insert(String word) {
        System.out.println("Inserting - " + word);
        TrieNode currNode = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(currNode.children[idx] == null) {
                currNode.children[idx] = new TrieNode();
            } 

            currNode = currNode.children[idx];
        }

        currNode.endOfWord = true;
    }

    static boolean search(String key) {
        TrieNode currNode = root;
        for(int i=0; i<key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if(currNode.children[idx] == null) {
                return false;
            } 

            if(i == key.length()-1 && currNode.children[idx].endOfWord == false) {
                return false;
            }   

            currNode = currNode.children[idx];
        }

        return true;
    }
}
