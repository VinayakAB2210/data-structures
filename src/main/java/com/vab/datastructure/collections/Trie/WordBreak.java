package com.vab.datastructure.collections.Trie;

public class WordBreak {
    private static boolean wordBreak(String key) {
        if(key.length() == 0) {
            return true;
        }

        for(int i=1; i<=key.length(); i++) {
            String part1 = key.substring(0, i);
            String part2 = key.substring(i);

            if(TrieOperations.search(part1) && wordBreak(part2)) {
                return true;
            } 
            
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        String key1 = "ilikesamsung";
        String key2 = "ilikemobile";
        String key3 = "ilikesung";

        for(int i=0; i<words.length; i++){
            TrieOperations.insert(words[i]);
        }

        System.out.println("Input key " + key1 + " word can be broken into dictionary words? " + wordBreak(key1));
        System.out.println("Input key " + key2 + " word can be broken into dictionary words? " + wordBreak(key2));
        System.out.println("Input key " + key3 + " word can be broken into dictionary words? " + wordBreak(key3));
    }
}
