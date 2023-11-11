package com.vab.datastructure.collections.hashing;

import java.util.HashMap;

public class ItinereryFromTickets {

    private static void printItineraryFromTickets(HashMap<String, String> tickets) {
        String source = getSource(tickets);
        
        System.out.println("Itinerary");
        
        while(tickets.containsKey(source)) {
            System.out.print(source + " -> ");
            source = tickets.get(source);
        }

        System.out.print(source);
    }

    private static String getSource(HashMap<String, String> tickets) {
        for(String key : tickets.keySet()) {
            if(!tickets.containsValue(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bangalore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        printItineraryFromTickets(tickets);
    }
}
