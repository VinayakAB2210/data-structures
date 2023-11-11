package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;

public class FindBridgeUsingTarjansAlgorithm {

    private static void getBridge(ArrayList<Edge>[] graph, int v) {
        int disoveryTime[] = new int[v];
        int lowDT[] = new int[v];
        boolean visited[] = new boolean[v];
        int time = 0;

        for(int i=0; i<v; i++){
            dfs(graph, -1, i, disoveryTime, lowDT, visited, time);
        }
    }

    // Tarjan's alogirhtm
    public static void dfs(ArrayList<Edge>[] graph, int parent, int current, int[] disoveryTime, int[] lowDT, boolean[] visited, int time) {
        visited[current] = true;
        disoveryTime[current] = lowDT[current] = time;

        for(int i=0; i<graph[current].size(); i++) {
            Edge e = graph[current].get(i);

            if(parent == e.dest) {
                continue;
            }

            if(!visited[e.dest]) {
                dfs(graph, current, e.dest, disoveryTime, lowDT, visited, ++time);
                lowDT[current] = Math.min(lowDT[current], lowDT[e.dest]);
                if(lowDT[current] < lowDT[e.dest]) {
                    System.out.println("Bridge is " + current + " --- " + e.dest);
                }
            } else {
                lowDT[current] = Math.min(lowDT[current], disoveryTime[e.dest]);
            }
        }
        
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];

        Graph.createGraph(graph);

        getBridge(graph, v);
    }
    
}
