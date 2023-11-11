package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;

public class ShortestPathBellmanFord {

    // Note - Belmman Ford Algorithm doesn't work for negative weight cycles as the shortest path for cycle goes on increasing negative values
    private static void bellmanFordAlgorithm(ArrayList<WeightedEdge> graph[], int v, int src) {
        int distance[] = new int[v];

        for(int i=0; i<v; i++) {
            if(i != src) {
                distance[i] = Integer.MAX_VALUE;    
            }
        }

        for(int i=0; i<v-1; i++) { // O(V)
            for(int j=0; j<graph.length; j++) { // O(E) - 2 inner for loops have combined O(E) as these loops tracks total edges
                for(int k=0; k<graph[j].size(); k++) {
                    WeightedEdge weightedEdge = graph[j].get(k);

                    if(distance[weightedEdge.src] != Integer.MAX_VALUE && (distance[weightedEdge.src] + weightedEdge.weight) < distance[weightedEdge.dest]) {
                        distance[weightedEdge.dest] = distance[weightedEdge.src] + weightedEdge.weight;
                    }
                }
            }
        }

        // // Detect nagative weight cycle
        // for(int j=0; j<graph.length; j++) { // O(E) - 2 inner for loops have combined O(E) as these loops tracks total edges
        //     for(int k=0; k<graph[j].size(); k++) {
        //         WeightedEdge weightedEdge = graph[j].get(k);

        //         if(distance[weightedEdge.src] != Integer.MAX_VALUE && (distance[weightedEdge.src] + weightedEdge.weight) < distance[weightedEdge.dest]) {
        //             System.out.println("Negative weight cycle found");
        //         }
        //     }
        // }

        System.out.println("Shortest distance from source to all vertices");
        for(int i=0; i<v; i++) {
            System.out.println(i + " --> " + distance[i]);
        }

    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<WeightedEdge> graph[] = new ArrayList[v];

        Graph.createDirectedWeightedGraphWithNegativeDistnace(graph, v);

        bellmanFordAlgorithm(graph, v, 0);
    }
    
}
