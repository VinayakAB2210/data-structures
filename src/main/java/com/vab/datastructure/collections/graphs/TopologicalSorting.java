package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

    // O(V+E)
    public static void topSortUtil(ArrayList<Edge> graph[], boolean[] visited, int curVertex, Stack<Integer> stack) {
        visited[curVertex] = true;

        for(int i=0; i<graph[curVertex].size(); i++) {
            Edge e = graph[curVertex].get(i);

            if(!visited[e.dest]) {
                topSortUtil(graph, visited, e.dest, stack);
            }
        }

        stack.push(curVertex);
    }

    public static void topSort(ArrayList<Edge> graph[], int V) {
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<V; i++) {
            if(!visited[i]) {
                topSortUtil(graph, visited, i, stack);
            }
        }

        System.out.println();
        System.out.println("Topological Sorting");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " -> ");
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];

        /*
             1 ---> 3
            /       | \
           0        |  5 ---> 6
            \       v /   
             2 <--- 4
        */
        Graph.createDirectedGraph(graph);
        topSort(graph, V);
    }
    
}
