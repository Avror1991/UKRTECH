package com.company;


import java.util.Arrays;

public class MassIntPovtor {
    public static void main(String[] args) {
         int[] mass = new int[] {1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 9};
        Arrays.stream(mass).distinct().forEach(x -> System.out.print(x + " "));



    }
}
