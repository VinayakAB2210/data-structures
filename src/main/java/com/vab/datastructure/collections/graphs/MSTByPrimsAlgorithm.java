package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MSTByPrimsAlgorithm {

    private static void printMSTByPrimsAlgo(ArrayList<WeightedEdge>[] graph, int src) {
        boolean visited[] = new boolean[graph.length];
        ArrayList<WeightedEdge> mst = new ArrayList<>();

        PriorityQueue<WeightedEdge> pq = new PriorityQueue<>();

        pq.add(new WeightedEdge(src, src, 0));

        while(!pq.isEmpty()) {
            WeightedEdge edge = pq.remove();

            if(!visited[edge.dest]) {
                visited[edge.dest] = true;

                mst.add(edge);

                for(int i=0; i< graph[edge.dest].size(); i++) {
                    WeightedEdge e = graph[edge.dest].get(i);

                    if(!visited[e.dest]) {
                        pq.add(e);
                    }
                }

            }

        }

        for(int i=1; i<mst.size(); i++) {
            WeightedEdge edge = mst.get(i);
            System.out.println(edge.src + " -> " + edge.dest + " with cost " + edge.weight);
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<WeightedEdge> graph[] = new ArrayList[v];

        Graph.createWeightedGraph(graph);

        printMSTByPrimsAlgo(graph, 0);
    }
    
}
