package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;

public class DFS {

    // O(V+E)
    private static void dfs(ArrayList<Edge>[] graph, int startVertex, boolean[] visited) {
        System.out.print(startVertex + " -> ");
        
        visited[startVertex] = true;

        for(int i=0; i<graph[startVertex].size(); i++) {
            int neighbour = graph[startVertex].get(i).dest;
            if(!visited[neighbour]) {
                dfs(graph, neighbour, visited);
            }    
        } 
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        Graph.createGraph(graph);

        /*
          1 --- 3
         /      | \
        0       |  5 --- 6
         \      | /   
          2 --- 4
        */

        boolean visited[] = new boolean[V];

        System.out.println();
        System.out.println("DFS Traversal ");
        for(int i=0; i<V; i++) {
            if(visited[i] == false) {
                dfs(graph, i, visited);
            }
        }
    }
}
