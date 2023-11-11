package com.vab.datastructure.utility;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(4, 40);
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		System.out.println(map.remove(2));
		System.out.println(map.keySet());

		System.out.println("HashMap Enntries");
		for (Integer i : map.keySet()) {
			System.out.println(map.get(i));
		}

		System.out.println("Linked HashMap--------");

		Map<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
		linkedHashMap.put(4, 40);
		linkedHashMap.put(1, 10);
		linkedHashMap.put(2, 20);
		linkedHashMap.put(3, 30);
		
		System.out.println("LinkedHashMap Enntries");
		for (Integer i : linkedHashMap.keySet()) {
			System.out.println(linkedHashMap.get(i));
		}
		
		System.out.println("Tree Map--------");

		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(4, 40);
		treeMap.put(1, 10);
		treeMap.put(2, 20);
		treeMap.put(3, 30);
		
		System.out.println("TreeMap Enntries");
		for (Integer i : treeMap.keySet()) {
			System.out.println(treeMap.get(i));
		}

	}

}
