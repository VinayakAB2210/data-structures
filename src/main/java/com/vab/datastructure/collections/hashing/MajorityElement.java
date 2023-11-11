package com.vab.datastructure.collections.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    private static void findMajorityElements(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int limit = n/3;

        System.out.println("Printing majority elements");
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > limit) {
                System.out.println(entry.getKey());
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, arr[];

        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter array elemenets");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        findMajorityElements(arr, n);

        sc.close();

    }
}
