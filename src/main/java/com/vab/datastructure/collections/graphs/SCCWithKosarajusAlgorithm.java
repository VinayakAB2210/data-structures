package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;
import java.util.Stack;

public class SCCWithKosarajusAlgorithm {

    // 1. Get nodes in stack (Topological sorting) - O(V+E)
    // 2. Transpose the graph - O(V+E)
    // 3. Do DFS accordining to stack nodes on the transpose graph - O(V+E)
    private static void kosarajuAlgo(ArrayList<Edge> graph[], int v) {
        boolean visited[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        // Step 1 - Get nodes in stack (Topological sorting) - O(V+E)
        for(int i=0; i<graph.length; i++) {
            if(!visited[i]) {
                topSort(graph, stack, visited, i);
            }
        }

        // Step 2 - Transpose the graph - O(V+E)
        ArrayList<Edge> transpose[] = new ArrayList[v];
        for(int i=0; i < transpose.length; i++) {
            visited[i] = false;
            transpose[i] = new ArrayList<>();
        }

        for(int i=0; i<graph.length; i++) {
            for(int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);

                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3 -  Do DFS accordining to stack nodes on the transpose graph - O(V+E)
        while(!stack.isEmpty()) {
            Integer curr = stack.pop();
            
            if(!visited[curr]) {
                dfs(transpose, visited, curr);
                System.out.println();
            }
        }
    }

    private static void dfs(ArrayList<Edge>[] transpose, boolean[] visited, Integer curr) {
        visited[curr] = true;
        System.out.print(curr + " ");

        for(int i=0; i<transpose[curr].size(); i++) {
            Edge e = transpose[curr].get(i);

            if(!visited[e.dest]) {
                dfs(transpose, visited, e.dest);
            }
        }

    }

    private static void topSort(ArrayList<Edge>[] graph, Stack<Integer> stack, boolean[] visited, int src) {
        visited[src] = true;

        for(int i=0; i<graph[src].size(); i++) {
            Edge neighbour = graph[src].get(i);

            if(!visited[neighbour.dest]) {
                topSort(graph, stack, visited, neighbour.dest);
            }
        }

        stack.push(src);
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];

        Graph.createDirectedGraph(graph);
        kosarajuAlgo(graph, v);
    } 
}
