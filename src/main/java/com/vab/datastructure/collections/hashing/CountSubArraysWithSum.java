package com.vab.datastructure.collections.hashing;

import java.util.HashMap;

public class CountSubArraysWithSum {

    public static void main(String[] args) {
        int arr[] = { -2, 2, 0, 10, -2};
        int k = 8;
        int sum = 0, count = 0;

        // K - prefix sum & V - frequency
        HashMap<Integer, Integer> map =  new HashMap<>();
        map.put(0, 1);

        for(int i : arr) {
            sum += i;

            if(map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }

            if(map.containsKey(sum)) {
                map.put(sum, map.get(sum)+1);
            } else {
                map.put(sum, 1);
            }
        }

        System.out.println("Count of sub array with sum " + k + " is " + count);
        
    }
    
}
