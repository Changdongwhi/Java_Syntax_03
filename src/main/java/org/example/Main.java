package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("x"); // 출력 : x
        System.out.println(x); // 출력 : 10
        System.out.println("x" + x); // 출력 : x10
        System.out.println("x : " + x); // 출력 : x : 10
        System.out.println("x : " + x * 10); // 출력 : x : 100
        System.out.println("x : " + x + 10); // 출력 : x : 1010
        System.out.println("x : " + (x + 10)); // 출력 : x : 20
    }
}