package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MSTCostByPrimsAlgorithm {

    // Time Complexity - O(E LogE)
    private static void getMSTCostByPrimsAlgo(ArrayList<WeightedEdge>[] graph, int src) {
        boolean visited[] = new boolean[graph.length];
        int cost = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()) {
            Pair pair = pq.remove();

            if(!visited[pair.node]) {
                visited[pair.node] = true;

                cost += pair.weight;

                for(int i=0; i<graph[pair.node].size(); i++) {
                    WeightedEdge e = graph[pair.node].get(i);

                    if(!visited[e.dest]) {
                        pq.add(new Pair(e.dest, e.weight));
                    }
                }
            }
        }

        System.out.println("Minimum spanning tree cost " + cost);

    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<WeightedEdge> graph[] = new ArrayList[v];

        Graph.createWeightedGraph(graph);

        getMSTCostByPrimsAlgo(graph, 0);

    }

    
    
}
