package com.kan;

/**
 * Hello world!
 *
 */
public class App {
    private static int count = 1;

    public static void main( String[] args ) {
        System.out.println( "App.main!" );
        m1();
//        A.m1();
//        printNumberRecursivelyUpto(10000);
//        printNumberByLoopingUpto(30000);
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        m3();
    }

    private static void m3() {
        int i = 3;
        System.out.println("m3");
    }

    private static void printNumberRecursivelyUpto(int n) {
        if(count <= n) {
            System.out.println(count);
            count++;
            printNumberRecursivelyUpto(n);
        }
    }

    private static void printNumberByLoopingUpto(int n) {
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
        }
    }
}
