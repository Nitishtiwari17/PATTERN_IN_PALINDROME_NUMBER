package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int k = 9; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + i + " ");
            }

            System.out.println();
            // write your code here
        }
    }
}
