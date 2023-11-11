package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShortestPathUsingDijkstra {

    // Time Complexity - O(E + E log V)
    // E log V is for sorting used inside priority Queue
    // E is for traversing all edges once
    public static void dijkstrasShortesPath(ArrayList<WeightedEdge> graph[], int src) {
        int distance[] = new int[graph.length];
        boolean visited[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++) {
            if(i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> prioQueue = new PriorityQueue<>();
        prioQueue.add(new Pair(src, 0));

        while(!prioQueue.isEmpty()) {
            Pair pair = prioQueue.remove();

            if(!visited[pair.node]) {
                visited[pair.node] = true;

                for(int i=0; i<graph[pair.node].size(); i++) {
                    WeightedEdge e = graph[pair.node].get(i);

                    if(!visited[e.dest] && distance[e.src] != Integer.MAX_VALUE && (distance[e.src] + e.weight) < distance[e.dest]) {
                        distance[e.dest] = distance[e.src] + e.weight;
                        prioQueue.add(new Pair(e.dest, distance[e.dest]));
                    }
                }
            }
        }

        for(int i=0; i<graph.length; i++) {
            System.out.println(i + " - " + distance[i]);
        }
    }
    
    public static void main(String[] args) {
        int v = 6;
        ArrayList<WeightedEdge> graph[] = new ArrayList[v];

        Graph.createDirectedWeightedGraph(graph);
        dijkstrasShortesPath(graph, 0);
    }
}

