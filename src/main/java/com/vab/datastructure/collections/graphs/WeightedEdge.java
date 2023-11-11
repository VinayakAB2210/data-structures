package com.vab.datastructure.collections.graphs;

public class WeightedEdge extends Edge implements Comparable<WeightedEdge> {

    int weight;

    public WeightedEdge(int src, int dest, int weight) {
        super(src, dest);
        this.weight = weight;
    }

    @Override
    public int compareTo(WeightedEdge e2) {
        return this.weight - e2.weight;
    }
    
}
