package ru.seppa.basic.homeworks;

import java.util.Scanner;


public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Какой модуль вас интересует?\n1 - greetings\n2 - checkSign\n3 - selectColor\n" +
                    "4 - compareNumbers\n5 - addOrSubtractAndPrint\n0 - Выход");
            int switchcase = scanner.nextInt();
            System.out.println("   ");
            if (switchcase == 1) {
                greetings();
                System.out.println("\n");
            } else if (switchcase == 2) {
                System.out.println("Введите 3 числа для выполнения знака их суммы");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                checkSign(a, b, c);
            } else if (switchcase == 3) {
                System.out.println("Введите число и получите цвет");
                selectColor();
            } else if (switchcase == 4) {
                compareNumbers();
            } else if (switchcase == 5) {
                System.out.println("Введите значения двух переменных");
                int initValue = scanner.nextInt();
                int delta = scanner.nextInt();
                System.out.println("Какое действие вы хотите произвести\n1 - \n2 +");
                boolean increment;
                while (true) {
                    int PreIncrement = scanner.nextInt();
                    if (PreIncrement == 1) {
                        increment = false;
                        break;
                    } else if (PreIncrement == 2) {
                        increment = true;
                        break;
                    } else {
                        System.out.println("Некорректные данные, попробуйте снова");
                    }
                }
                addOrSubtractAndPrint(initValue, delta, increment);
            } else if (switchcase == 0) {
                break;
            } else {
                System.out.println("Вы ввели некорректные данные \nПопробуйте снова\n ");
            }
        }
    }

    public static void greetings() {
        System.out.println("hello \nWorld \nform \njava");
    }

    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Cумма отрицательная");
        }
        System.out.println("\n");
    }

    public static void selectColor() {
        Scanner scanner2 = new Scanner(System.in);
        int a = scanner2.nextInt();
        if (a <= 10) {
            System.out.println("Красный");
        } else if (a <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        System.out.println("\n");
    }

    public static void compareNumbers() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите а и b");
        int a = scanner3.nextInt();
        int b = scanner3.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println("\n");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println("Результат = " + (initValue + delta));
        } else {
            System.out.println("Результат = " + (initValue - delta));
        }
        System.out.println("\n");
    }
}
