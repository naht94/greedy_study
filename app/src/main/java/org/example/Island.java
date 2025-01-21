package org.example;

import java.util.Arrays;

public class Island {

    public static void main(String[] args) {
         int[] insert = { 70, 50, 80, 50 };
         System.out.println(new Island().solution(insert, 100));
    }

    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int index = 0;
        int dev  = 0;

        for (int i = people.length - 1; i > index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                dev++;
            } 
        }
        return people.length - dev;
    }
    
}
