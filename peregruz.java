package com.company;

public class peregruz {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum(1, 2, 3, 4, 5, 6));
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7));

    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    static int sum(int a, int b, int c, int d, int i) {
        return a + b + c + d + i;
    }
    static int sum(int a, int b, int c, int d, int i, int f) {
        return a + b + c + d + i + f;
    }
    static int sum(int a, int b, int c, int d, int i, int f, int j) {
        return a + b + c + d + i + f + j;
    }
    static int sum(int a, int b, int c, int d, int i, int f, int j, int h) {
        return a + b + c + d + i + f + j + h;
    }
}
