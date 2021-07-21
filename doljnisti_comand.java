package com.company;

public class doljnisti_comand {
    public static void main(String[] args) {
        String capitan = "Jhon";
        String navigator = "James";
        String firstMate = "Mary";
        String secondMate = "Oleg";


        System.out.println(capitan(capitan));
        System.out.println(navigator(navigator));
        System.out.println(firstMate(firstMate));
        System.out.println(secondMate(secondMate));
    }

    private static String capitan(String capitan) {
        return "Капитан" + " " + capitan;
    }
    private static String navigator(String navigator) {
        return "Навигатор" + " " + navigator;
    }
    private static String firstMate(String firstMate) {
        return "Первый Помощник" + " " + firstMate;
    }
    private static String secondMate(String secondMate) {
        return "Второй Помощник" + " " + secondMate;
    }

}
