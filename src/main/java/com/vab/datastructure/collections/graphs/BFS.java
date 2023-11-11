package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    // O(V+E)
    private static void bfs(ArrayList<Edge>[] graph, int startVertex, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startVertex);

        while(!queue.isEmpty()) {
            Integer curr = queue.remove();
            
            if(!visited[curr]) {

                System.out.print(curr + " -> ");
                for(int i=0; i<graph[curr].size(); i++) {
                    queue.add(graph[curr].get(i).dest);
                }
                
            }
            visited[curr] = true;
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

        System.out.println("BFS Traversal ");
        for(int i=0; i<V; i++) {
            if(visited[i] == false) {
                bfs(graph, i, visited);
            }
        }
    }
}
