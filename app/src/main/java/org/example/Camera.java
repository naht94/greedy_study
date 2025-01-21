package org.example;

import java.util.Arrays;

public class Camera {

    public static void main(String[] args) { 
        int[][] routes = { { -20,-15 }, { -14,-5 }, { -18,-13 }, { -5,-3 } };
        System.out.println(new Camera().solution(routes));
    }
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        int answer = 0;

        int arrive = -30000;
        for (int[] route : routes) {
            if (route[0] <= arrive) continue;
            arrive = route[1];
            answer++;
        }

        return answer;
    }
}
