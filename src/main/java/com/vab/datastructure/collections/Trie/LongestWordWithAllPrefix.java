package com.vab.datastructure.collections.Trie;

public class LongestWordWithAllPrefix {

    private static String answer = "";

    private static void longestWord(TrieNode root, StringBuilder temp) {
        if(root == null) {
            return;
        }

        for(int i=0; i<26; i++) {
            if(root.children[i] != null && root.children[i].endOfWord == true) {
                temp.append((char) (i + 'a'));

                if(temp.length() > answer.length()) {
                    answer = temp.toString();
                }

                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "ap", "app", "appl", "apples", "apply", "banana" };

        for(int i=0; i<words.length; i++){
            TrieOperations.insert(words[i]);
        }

        longestWord(TrieOperations.root, new StringBuilder(""));
        System.out.println("Longest word with with all prefix - " + answer);      
        
    }
    
}
