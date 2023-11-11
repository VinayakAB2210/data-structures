package com.vab.datastructure.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTemp {
    public static void main(String[] args) {
        // separateOddAndEven(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        // removeDuplicate(Arrays.asList(1, 2, 3, 4, 5, 3, 3, 5, 5));
        // frequencyOfChars("abbababcdce");
        // frequencyOfElements(Arrays.asList(1, 2, 3, 4, 5, 3, 4, 5, 5));
        // sortReverseDecimals(Arrays.asList(10.21, 11.22, 1.43, 0.1234, 4.56));
        // joinString(Arrays.asList("Hello", "World", "Welcome", "to", "Java", "programming"));
        // numbersMultipleOf5(Arrays.asList(5, 2, 6, 10, 4, 15, 23, 25));
        // findMaxAndMin(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        // mergeUnSortedArrays(new int[] { 3, 6, 8, 12}, new int[] { 9, 2, 5, 7});
        // mergeUnSortedArraysWithoutDuplicates(new int[] { 3, 6, 5, 12}, new int[] { 3, 2, 5, 7});
        // findMax3AndMin3Elements(Arrays.asList(5, 2, 2, 10, 4, 15, 23, 25));
        // checkStringsAnagrams("Algorithm", "Logarithm");
        // sumOfDigitsOfInteger(56231);
        // secondLargestNumberInList(Arrays.asList(5, 2, 6, 10, 4, 15, 23, 25));
        // sortStringsBasedOnLength(Arrays.asList("abc", "a", "b", "c", "abcde", "ab", "abcd", "bcd"));
        sumAndAverageOfArray(new int[] { 3, 6, 8, 12, 4, 7});

        

    }

    public static void separateOddAndEven(List<Integer> list) {
        Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(a -> a%2 == 0));
        System.out.println("Separating Odd & even Numbers from - " + list);

        for(Entry<Boolean, List<Integer>> s : result.entrySet()) {
            if(s.getKey()) {
                System.out.println("Even Numbers");
                System.out.println(s.getValue());
            } else {
                System.out.println("Odd Numbers");
                System.out.println(s.getValue());
            }
        }
    }

    public static void removeDuplicate(List<Integer> list) {
        System.out.println("Removing duplicates from - " + list);
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        System.out.println(result); 
    }

    private static void frequencyOfChars(String string) {
        System.out.println("Frequency of characters in String - " + string);
        Map<Character, Long> result = string.chars()
                .mapToObj(c -> (char) c)
                .collect(
                    Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
       
    }

    private static void frequencyOfElements(List<Integer> list) {
        System.out.println("Frequency of elements from the list - " + list);

        Map<Integer, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
       
    }

    private static void sortReverseDecimals(List<Double> list) {
        System.out.println("Sorting decimal values in reverse order - " + list);

        List<Double> result = list.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());
        System.out.println(result);
        
    }

    private static void joinString(List<String> list) {
        System.out.println("Joining with delimiter ',', prefix '[' and suffix']' for list of strings " + list);
        String result = list.stream()
            .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(result);
       
    }

    private static void numbersMultipleOf5(List<Integer> list) {
        System.out.println("Numbers with multiple of 5 in the list - " + list);
        List<Integer> result = list.stream()
            .filter(num -> num%5 == 0)
            .collect(Collectors.toList());
        System.out.println(result);
        
    }

    private static void findMaxAndMin(List<Integer> list) {
        System.out.println("Finding max and min from the list - " +list);
        Integer max = list.stream()
            .max(Comparator.naturalOrder()).orElse(null);

        System.out.println("Max - " + max);

        Integer min = list.stream()
            .min(Comparator.naturalOrder()).orElse(null);

        System.out.println("Min - " + min);
       
    }

    private static void mergeUnSortedArrays(int[] arr1, int[] arr2) {
        System.out.println("Merging 2 arrays - ");
        for(int i: arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        for(int i: result) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }


    private static void mergeUnSortedArraysWithoutDuplicates(int[] arr1, int[] arr2) {
        System.out.println("Merging 2 arrays without duplicates - ");
        for(int i: arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();
        for(int i: result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void findMax3AndMin3Elements(List<Integer> list) {
        System.out.println("Finding min 3 and max 3 elements from the list - " + list);
        List<Integer> min3 = list.stream().sorted().distinct().limit(3).collect(Collectors.toList());
        System.out.println(min3);

        List<Integer> max3 = list.stream().sorted(Collections.reverseOrder()).distinct().limit(3).collect(Collectors.toList());
        System.out.println(max3);
    }

    private static void checkStringsAnagrams(String str1, String str2) {
        System.out.println("Checking if strings " + str1 + " & " + str2 + " are anagrams or not");
        
        String s1 = Stream.of(str1.split("")).map(s -> s.toUpperCase()).sorted().collect(Collectors.joining());
        
        System.out.println(s1);
        String s2 = Stream.of(str2.split("")).map(s -> s.toUpperCase()).sorted().collect(Collectors.joining());

        System.out.println(s2);

        if(s1.equals(s2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }

    private static void sumOfDigitsOfInteger(int num) {
        Integer result = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println("Sumf of digits of - " + num + " is " + result);
    }

    private static void secondLargestNumberInList(List<Integer> list) {
        Integer result = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(null);
        System.out.println("Second largest element in the list - " + list + " is " + result);

    }

    private static void sortStringsBasedOnLength(List<String> list) {
        // List<String> result = list.stream()
        //                             .sorted((s1, s2) -> s1.length() > s2.length() ? 1 : -1)
        //                             .collect(Collectors.toList());

        // List<String> result = list.stream()
        //                             .sorted(Comparator.comparing(String::length))
        //                             .collect(Collectors.toList());

        List<String> result = list.stream()
            .sorted(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    } else if(o1.length() > o2.length()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            })
            .collect(Collectors.toList());

        System.out.println(result);
    }


    private static void sumAndAverageOfArray(int[] arr) {
        System.out.println("Array elements ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        Integer sum = Arrays.stream(arr).sum();
        System.out.println("Sum " + sum);

        Double avg = Arrays.stream(arr).average().orElse(0);
        System.out.println("Average " + avg);

    }
    
}
