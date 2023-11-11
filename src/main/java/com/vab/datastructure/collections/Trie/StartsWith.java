package com.vab.datastructure.collections.Trie;

public class StartsWith {

    private static boolean startsWith(String prefix) {
        TrieNode currNode = TrieOperations.root;

        for(int i=0; i<prefix.length()-1; i++) {
            int idx = prefix.charAt(i) - 'a';
            if(currNode.children[idx] == null) {
                return false;
            }

            currNode = currNode.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

        for(int i=0; i<words.length; i++){
            TrieOperations.insert(words[i]);
        }

        System.out.println("String with prefix sams exists? " + startsWith("sams"));
        System.out.println("String with prefix all exists? " + startsWith("all"));
        
    }
    
}
