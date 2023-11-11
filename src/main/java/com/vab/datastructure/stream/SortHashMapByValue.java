package com.vab.datastructure.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 5);
        map.put("C", 7);

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());


        // Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

        //     @Override
        //     public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        //         return o1.getValue().compareTo(o2.getValue());
        //     }
        // });

        // for(Map.Entry<String, Integer> entry : list) {
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }

        Map<String, Integer> sortedMap = list.stream()
                                            .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMap);

        
    }
    
}

