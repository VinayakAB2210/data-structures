package com.vab.datastructure.utility;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(40);

        System.out.println(list);
        System.out.println(list.size());

        list.add(2, 30);
        System.out.println(list);
        System.out.println(list.size());

        list.removeIf(a -> a/10 == 4);
        System.out.println(list);
        System.out.println(list.size());

    }
    
}
