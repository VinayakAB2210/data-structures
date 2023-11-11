package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;

public class DetectCycleInUnDirectedGraph {

    public static boolean detectCycleUndirGraph(ArrayList<Edge> graph[], boolean[] visited, int curVertex, int parentVertex) {
        visited[curVertex] = true;

        for(int i=0; i<graph[curVertex].size(); i++) {
            Edge e = graph[curVertex].get(i);

            // If neighbour is already visited and not the parent of the current vertex, cycle is found.
            if(visited[e.dest] && parentVertex != e.dest) {
                return true;
            } // If neighbour is not visited, traverse DFS from that to check if cycle is found
            else if(!visited[e.dest] && detectCycleUndirGraph(graph, visited, e.dest, curVertex)) {
                return true;    
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean visited[] = new boolean[V];

        Graph.createGraph(graph);

        for(int i=0; i<V; i++) {
            if(!visited[i]) {
                boolean cycleFound = detectCycleUndirGraph(graph, visited, i, -1);
                if(cycleFound) {
                    System.out.println("Cycle Found");
                    break;
                }
            }
        }
    }
    
}
