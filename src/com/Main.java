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
        String s = "Hello world";
        final int N = 5;
        if (N > 0) {
            String star = "";
            for (int f = 0; f < N; f++) {
                star += "*";
            }
            s = s.replace("", star);
            System.out.println(s.substring(N, s.length() - N));
        }
    }

    /**
     * Task 2
     * Даны строки S и S0. Удалить из строки S все подстроки, совпадающие с S0.
     * Если совпадающих подстрок нет, то вывести строку S без изменений.
     */
    public static void Task35() {
        final String S = "Hello world";
        final String S0 = "llo";
        String ans = S.replaceAll(S0, "");
        System.out.print(ans);
    }

    /**
     * Task 3
     * Дан символ C.
     * Вывести его код (т. е. номер в кодовой таблице).
     */
    public static void Task1() {
        final char C = '2';
        System.out.println((int) C);
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