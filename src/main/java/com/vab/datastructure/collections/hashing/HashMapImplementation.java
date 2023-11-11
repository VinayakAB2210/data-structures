package com.vab.datastructure.collections.hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n -> nodes
        private int N; // N -> buckets
        LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            buckets = new LinkedList[N];
            n = 0;
            
            for(int i=0; i<this.N; i++){
                this.buckets[i] = new LinkedList<>();
            }

        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1) {
                return null;
            } else {
                return buckets[bi].get(di).value;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return !(di == -1);
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1) {
                return null; //Key doesn't exist
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } 
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keyList = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> list = buckets[i];
                for(int j=0; j<list.size(); j++) {
                    keyList.add(list.get(j).key);
                }

            }

            return keyList;
        }

        public boolean isEmpty() {
            return n==0;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            N = N*2;
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N];

            for(int i=0; i<N; i++) {
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldBuckets.length; i++) {
                LinkedList<Node> list = oldBuckets[i];

                for(int j=0; j<list.size(); j++) {
                    Node node = list.get(j);

                    put(node.key, node.value);
                }
            }
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> list = buckets[bi];

            for(int i=0; i<list.size(); i++){
                if(list.get(i).key == key) {
                    return i;
                }
            }

            return -1;
        }

        private int hashFunction(K key) {
            int hash = key.hashCode();
            return Math.abs(hash) % N;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("China", 130);
        map.put("Srilanka", 35);
        map.put("Bangladesh", 25);
        map.put("Nepal", 10);

        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++) {
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
 
}
