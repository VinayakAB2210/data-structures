package com.vab.datastructure.utility;

import java.util.HashSet;
import java.util.Set;

public class CountExcellentPairs {

	public static void main(String[] args) {
		System.out.println(countExcellentPairs(new int[] {1, 2, 3, 1}, 3));

	}
	
	public static long countExcellentPairs(int[] A, int k) {
        long cnt[] = new long[30], res = 0;
        Set<Integer> set = new HashSet<>();
        for (int a : A)
            set.add(a);
        for (int a : set)
            cnt[Integer.bitCount(a)]++;
        for (int i = 1; i < 30; ++i)
            for (int j = 1; j < 30; ++j)
                if (i + j >= k)
                    res += cnt[i] * cnt[j];
        return res;
    }

}
