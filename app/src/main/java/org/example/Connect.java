package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Connect {
    public static void main(String[] args) {
        int[][] insert = { { 0,1,1 },{ 0,2,2 },{ 1,2,5 },{ 1,3,1 },{ 2,3,8 } };
        System.out.println(new Connect().solution(4, insert));
    }

    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));
        Set<Integer> built = new HashSet<>();
        
        int total = 0;

        while (built.size() < n) {
            for (int[] island : costs) {
                if (built.contains(island[0]) != built.contains(island[1]) || built.isEmpty()) {
                    built.add(island[0]);
                    built.add(island[1]);
                    total += island[2];
                    break;
                }
            }
        }
        return total;
    }
}
