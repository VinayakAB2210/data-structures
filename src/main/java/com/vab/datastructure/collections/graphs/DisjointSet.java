package com.vab.datastructure.collections.graphs;

public class DisjointSet {
    int root[];

    public DisjointSet(int v) {
        root = new int[v];

        for(int i=0; i<v; i++) {
            root[i] = i;
        }
    }

    // Quick Find
    // public int find(int x) {
    //     return root[x];
    // }

    // public void union(int x, int y) {
    //     int rootX = find(x);
    //     int rootY = find(y);

    //     if(rootX != rootY) {
    //         for(int i=0; i<root.length; i++) {
    //             if(root[i] == rootY) {
    //                 root[i] = rootX;
    //             }
    //         }
    //     }
    // }

    // Quick Union
    public int find(int x) {
        if(root[x] == x) {
            return x;
        }

        return root[x] = find(root[x]);
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if(rootX != rootY) {
            root[rootY] = rootX;
        }
    }

    public boolean connected(int x, int y) {
         return root[x] == root[y];
    }

    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(10);

        ds.union(0, 1);
        ds.union(0, 2);
        ds.union(1, 3);
        ds.union(4, 8);
        ds.union(5, 6);
        ds.union(5, 7);

        System.out.println(ds.connected(0, 3));
        System.out.println(ds.connected(4, 8));
        System.out.println(ds.connected(7, 8));
    }
}
