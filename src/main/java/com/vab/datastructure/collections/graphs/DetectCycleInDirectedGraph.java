package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

    // Time Complexity - O(V+E)
    // Modified DFS - recursion_stack is to maintain current path 
    public static boolean detectCycleDirGraph(ArrayList<Edge>[] graph, boolean[] visited, int curr, boolean[] recursion_stack) {
        visited[curr] = true;
        // This is to maintain vertices in the current path to detect cycle
        recursion_stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // If neighbour is already in recursion stack, cycle is found and return true;
            if(recursion_stack[e.dest]) {
                return true;
            } // If neighbour is not visited, traverse DFS from neighbour to see if cycle is found 
            else if (!visited[e.dest] && detectCycleDirGraph(graph, visited, e.dest, recursion_stack)) {
               return true;
            }
        }

        // Mark curVertex to false in the recursion stack after all its neighbours are traversed 
        recursion_stack[curr] = false;

        return false;
    }

    public static void main(String[] args) { 
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];

        Graph.createDirectedGraph(graph);

        boolean visited[] = new boolean[V];
        boolean recursion_stack[] = new boolean[V];

        for(int i=0; i<V; i++) {
            if(visited[i] == false) {
                boolean cycleFound = detectCycleDirGraph(graph, visited, i, recursion_stack); 
                if(cycleFound) {
                    System.out.println("Found Cycle");
                    break;
                }
            }
        }
    }
}
