package com.vab.datastructure.collections.hashing;

import java.util.HashSet;

public class IntersectionOfArrays {

    private static void printIntersectionOfArrays(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            if(set.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]);
            }
        }

        System.out.println();
        System.out.println("Size of intersection size is - " + count);
    }

    public static void main(String[] args) {
        int arr1[] = { 6, 7, 3, 9};
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        printIntersectionOfArrays(arr1, arr2);
    }

}
