package com.company;

import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        System.out.println ("Введите 7, 3 или 2: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            switch (i) {
                case (7) -> System.out.println("Вы ввели 7");
                case (3) -> System.out.println("Вы ввели 3");
                case (2) -> System.out.println("Вы ввели 2");
                default -> System.out.println("Вы ввели другую цифру!"); /*если ничего не нужно делать, то просто комментируем эту строку*/
            }
        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
