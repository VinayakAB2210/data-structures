package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;

public class PrintAllPaths {

    // O(V^V)
    private static void printPaths(ArrayList<Edge>[] graph, boolean[] visited, String path, int currVertex, int targetVertex) {
        if(currVertex == targetVertex) {
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[currVertex].size(); i++) {
            int nextVertex = graph[currVertex].get(i).dest;

            if(!visited[nextVertex]) {
                visited[currVertex] = true;
                printPaths(graph, visited, path + nextVertex, nextVertex, targetVertex);
                visited[currVertex] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        boolean visited[] = new boolean[V];
        ArrayList<Edge> graph[] = new ArrayList[V];
        Graph.createGraph(graph);

        printPaths(graph, visited, "0", 0, 6);
    }
}
