package com.vab.datastructure.collections.hashing;

import java.util.HashSet;

public class UnionOfArrays {
    
    private static void printUnionOfArrays(int[] arr1, int[] arr2) {
        HashSet<Integer> unionSet = new HashSet<>();
        for(int i=0; i<arr1.length; i++) {
            unionSet.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            unionSet.add(arr2[i]);
        }

        for(Integer a : unionSet) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9};
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        printUnionOfArrays(arr1, arr2);
    }
}
