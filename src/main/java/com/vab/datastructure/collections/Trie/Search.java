package com.vab.datastructure.collections.Trie;

public class Search {

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

        for(int i=0; i<words.length; i++){
            TrieOperations.insert(words[i]);
        }

        System.out.println("Word samsung exist? " + TrieOperations.search("samsung")); // true
        System.out.println("Word sung exist? " + TrieOperations.search("sung")); // false
    }
    
}
