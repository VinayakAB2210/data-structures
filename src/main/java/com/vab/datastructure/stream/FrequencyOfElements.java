package com.vab.datastructure.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "B", "C", "A");

        // Method - 1
        // Set<String> set = new HashSet<>(list);

        // for(String s : set) {
        //     System.out.println(s + " -> " + Collections.frequency(list, s));
        // }


        // Method - 2
        // HashMap<String, Integer> map = new HashMap<>();

        // for(String s : list) {
        //     if(map.containsKey(s)) {
        //         map.put(s, map.get(s)+1);
        //     } else {
        //         map.put(s, 1); 
        //     }
        // }

        // System.out.println(map);

        // Method - 3
        Map<String, Long> s = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(s);


    }
}
