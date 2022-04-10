package com;

import java.util.Scanner;

public class Main {
    /**
     * Task 000
     * Функция для вычесления номера заданий
     */
    public static void Variant() {
        int ans, N, K, G;
        N = 11;   // порядковый номер студента по журналу
        K = 0;    // порядковый номер выполняемой задачи
        G = 211 % 3;//остаток от деления номера группы на 2
        while (K != 3) {
            K++;
            ans = (N + (K - 1) * 23) % 57 + G;
            System.out.println(K + ") = " + ans);
        }
    }

    /**
     * Task 1
     * Дана непустая строка S и целое число N (> 0).
     * Вывести строку, содержащую символы строки S, между которыми вставлено по N символов «*» (звездочка).
     */
    public static void Task12() {
        String line = "Hello world";
        final int N = 5;
        if (N > 0) {
            char[] lineArray = line.toCharArray();
            for (int i = 0; i < lineArray.length; i++) {
                for (int f = 0; f < N; f++) System.out.print("*");
                System.out.print(lineArray[i]);
            }
        }
    }

    /**
     * Task 2
     */
    public static void Task35() {

    }

    /**
     * Task 3
     */
    public static void Task1() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i != 3; i++) {
            System.out.print("\nEnter the task number: ");
            int Num = scanner.nextInt();
            switch (Num) {
                case 1:
                    System.out.println("\nTask 1");
                    Task12();
                    break;
                case 2:
                    System.out.println("\nTask 2");
                    Task35();
                    break;
                case 3:
                    System.out.println("\nTask 3");
                    Task1();
                    break;
                case 000:
                    System.out.println("\nVariant");
                    Variant();
                    break;
            }
        }
    }

}