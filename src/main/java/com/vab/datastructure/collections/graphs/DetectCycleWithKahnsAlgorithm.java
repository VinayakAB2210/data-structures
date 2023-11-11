package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleWithKahnsAlgorithm {

    /*
     * Kahn's algorithm 
     * 1. Track indegree of each node.
     * 2. Start with queue with all indegree[node] == 0.
     * 3. Check the neighbours of node with indegree 0 and delete edge by decrementing indegree of the neighbour.
     * 4. Keep adding to queue if the node indegree is 0 after decrementing.
     * 5. If visited node count is not equal to total nodes, cycle is found.
     * 6. Note - can be used for topological sorting where visited node count will be equal to total nodes.
     */
    public static boolean detectCycleKahnsAlgorithm(ArrayList<Edge> graph[], int v) {
        int visited = 0;
        int indegree[] = new int[v];

        for(int i=0; i<v; i++) {
            for(int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.println(e.src + " -> " + e.dest);

                indegree[e.dest]++;
            }
        }

        for(int i=0; i<v; i++) {
          System.out.println("Indegree[" + i + "] -> " + indegree[i]);
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<v; i++) {
            if(indegree[i] == 0) {
                queue.add(i);
            }
        }

        while(!queue.isEmpty()) {
            Integer node = queue.remove();
            visited++;

            for(int i=0; i<graph[node].size(); i++) {
                Edge neighbour = graph[node].get(i);
                indegree[neighbour.dest]--;

                if(indegree[neighbour.dest] == 0) {
                    queue.add(neighbour.dest);
                }
            }
        }

        return visited != v;
    }
   
    public static void main(String[] args) {
        int v = 7;
    
        ArrayList<Edge> graph[] = new ArrayList[v];
        
        Graph.createDirectedGraph(graph);

        System.out.println("Cycle found? : " + detectCycleKahnsAlgorithm(graph, v));
    }
}