package com.vab.datastructure.collections.graphs;

public class Pair implements Comparable<Pair> {
    public int node;
    public int weight;

    public Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    @Override
    public int compareTo(Pair p2) {
        return this.weight - p2.weight;
    }
    
}
