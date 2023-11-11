package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;

public class PrintNeighbours {
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

        System.out.println("Neighbours of 2 ");
        for(int i=0; i<graph[2].size(); i++) {
            System.out.println(graph[2].get(i).dest);
        }
    }
    
}
