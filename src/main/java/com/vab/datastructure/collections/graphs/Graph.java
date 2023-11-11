package com.vab.datastructure.collections.graphs;

import java.util.ArrayList;

public class Graph {

    /*
          1 --- 3
         /      | \
        0       |  5 --- 6
         \      | /   
          2 --- 4
    */
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

   /*
            1 -7- 3
         /2 |     | \1
        0   1     2  5 -4- 6
         \4 |     | /5   
            2 -3- 4
    */
    public static void createWeightedGraph(ArrayList<WeightedEdge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new WeightedEdge(0, 1, 2));
        graph[0].add(new WeightedEdge(0, 2, 4));

        graph[1].add(new WeightedEdge(1, 0, 2));
        graph[1].add(new WeightedEdge(1, 2, 1));
        graph[1].add(new WeightedEdge(1, 3, 7));

        graph[2].add(new WeightedEdge(2, 0, 4));
        graph[2].add(new WeightedEdge(2, 1, 1));
        graph[2].add(new WeightedEdge(2, 4, 3));

        graph[3].add(new WeightedEdge(3, 1, 7));
        graph[3].add(new WeightedEdge(3, 4, 2));
        graph[3].add(new WeightedEdge(3, 5, 1));

        graph[4].add(new WeightedEdge(4, 2, 3));
        graph[4].add(new WeightedEdge(4, 3, 2));
        graph[4].add(new WeightedEdge(4, 5, 5));

        graph[5].add(new WeightedEdge(5, 3, 1));
        graph[5].add(new WeightedEdge(5, 4, 5));
        graph[5].add(new WeightedEdge(5, 6, 4));

        graph[6].add(new WeightedEdge(6, 5, 4));
    }


    /*
          1 ---> 3
         /       | \
        0        |  5 ---> 6
         \       v /   
          2 <--- 4
    */
    public static void createDirectedGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 6));

    }

    /*
            1 -7-> 3
         /2 |       ^  \1
        0   1       2   5
         \4 |       | /5   
            2 -3-> 4
    */
    public static void createDirectedWeightedGraph(ArrayList<WeightedEdge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new WeightedEdge(0, 1, 2));
        graph[0].add(new WeightedEdge(0, 2, 4));

        graph[1].add(new WeightedEdge(1, 2, 1));
        graph[1].add(new WeightedEdge(1, 3, 7));

        graph[2].add(new WeightedEdge(2, 4, 3));

        graph[3].add(new WeightedEdge(3, 5, 1));

        graph[4].add(new WeightedEdge(4, 3, 2));
        graph[4].add(new WeightedEdge(4, 5, 5));

    }

     /*
            1 <- -1 - 4
         /2 |         |
        0   -4        4
         \4 |         |
            2 - 2 ->  3
    */
    public static void createDirectedWeightedGraphWithNegativeDistnace(ArrayList<WeightedEdge>[] graph, int v) {
         for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new WeightedEdge(0, 1, 2));
        graph[0].add(new WeightedEdge(0, 2, 4));

        graph[1].add(new WeightedEdge(1, 2, -4));
    
        graph[2].add(new WeightedEdge(2, 3, 2));

        graph[3].add(new WeightedEdge(3, 4, 4));

        graph[4].add(new WeightedEdge(4, 1, -1));
    }

}
