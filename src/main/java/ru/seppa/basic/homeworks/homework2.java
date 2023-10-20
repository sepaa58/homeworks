package ru.seppa.basic.homeworks;


import java.util.Arrays;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Какой модуль вас интересует?\n1 - PrintString\n2 - SummationMas\n3 - FillArray\n" +
                    "4 - ArrayPlus\n5 - FindMax\n6 - SumArray\n7 - FindDot\n8 - ArrUp(down)\n9 - ArrReverse\n0 - Выход");
            int switchcase = scanner.nextInt();
            if (switchcase == 1){
                System.out.println(" ");
                System.out.println(" Введите строку");
                // я не понял как сделать ввод данных только через scanner
                // он их считывает единой строкой и я могу сделать только сначала int а потом string
                // а ввести сначала string а потом int у меня не получилось без второго сканера подскажите как правильно
                String Line = s.nextLine();
                System.out.println(" Сколько раз её вывести");
                int NumberOfLine = scanner.nextInt();
                System.out.println(" ");
                PrintString(NumberOfLine, Line);
            } else if (switchcase == 2) {
                System.out.println(" ");
                //Этот фрагмент кода я буду часто копировать и правильнее было бы вписать его в функцию с возвратом
                //Но мы вроде не проходили return, по этому я не стал
                System.out.println(" Введите длину массива");
                int MasLen = scanner.nextInt();
                int[] DataToSum = new int[MasLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < DataToSum.length; i++){
                    DataToSum[i] = scanner.nextInt();
                }
                SummationMas(DataToSum);
            } else if (switchcase == 3) {
                System.out.println(" ");
                System.out.println(" Введите длину массива ");
                int ArrayLen = scanner.nextInt();
                System.out.println(" Каким числом хотите заполнить ");
                int FillMas = scanner.nextInt();
                int[] array = new int[ArrayLen];
                FillArray(array, FillMas);
            } else if (switchcase == 4) {
                System.out.println(" ");
                System.out.println(" Введите длину массива ");
                int MasLen = scanner.nextInt();
                int[] ArrayToBoost = new int[MasLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < ArrayToBoost.length; i++){
                    ArrayToBoost[i] = scanner.nextInt();
                }
                System.out.println(" На какое число хотите увеличить ");
                int ArrayPlus = scanner.nextInt();
                ArrayPlus(ArrayToBoost, ArrayPlus);
            } else if (switchcase == 5) {
                System.out.println(" ");
                System.out.println(" Введите длину массива (для корректной работы число должно быть четным)");
                int MasLen = scanner.nextInt();
                System.out.println(MasLen);
                int[] ArrFindMax = new int[MasLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < ArrFindMax.length; i++){
                    ArrFindMax[i] = scanner.nextInt();
                }
                FindMax(ArrFindMax);
            } else if (switchcase == 6) {
                System.out.println(" ");
                //Я тут столкнулся с проблемой. Не понимаю как проверить существует ли элемент массива
                //Тогда я бы смог задавать им произвольную длину как в прошлых заданиях
                int[] a = {1,1,1};
                int[] b = {2,3,2,3};
                int[] c = {3,4,3,4,3};
                SumArray(a, b, c);

            } else if (switchcase == 7) {
                System.out.println(" ");
                System.out.println(" Введите длину массива ");
                int MasLen = scanner.nextInt();
                int[] ArrayToFind = new int[MasLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < ArrayToFind.length; i++){
                    ArrayToFind[i] = scanner.nextInt();
                }
                FindDot(ArrayToFind);
            } else if (switchcase == 8) {
                System.out.println(" Введите длину массива ");
                int MasLen = scanner.nextInt();
                int[] ArrAn = new int[MasLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < ArrAn.length; i++){
                    ArrAn[i] = scanner.nextInt();
                }
                System.out.println("1 - Проверить на рост\n2 - Проверить на убывание ");
                int WhatDoYouWant = scanner.nextInt();
                if (WhatDoYouWant == 1){
                    ArrUp(ArrAn);
                } else {
                    ArrDown(ArrAn);
                }
            } else if (switchcase == 9) {
                System.out.println(" ");
                System.out.println(" Введите длину массива ");
                int MasLen = scanner.nextInt();
                int[] MasToRev = new int[MasLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < MasToRev.length; i++){
                    MasToRev[i] = scanner.nextInt();
                }
                ArrReverse(MasToRev);
            }
            if (switchcase == 0){
                break;
            }
        }

    }

    public static void PrintString(int a, String string){

        for (int i = 0; i < a; i++){
            System.out.println(string);
        }
    }
    public static void SummationMas (int[] DataToSum){
        int MasSum = 0;
        for (int i = 0; i < DataToSum.length; i++){
            if (DataToSum[i] > 5){
                MasSum += DataToSum[i];
            }
        }
        System.out.println("Сумма чисел > 5 = " + MasSum);
    }
    public static void FillArray (int[] array, int FillMas){
        System.out.println(" ");
        for (int i = 0; i < array.length; i++){
            array[i] = FillMas;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void ArrayPlus (int[] ArrayToBoost, int VarToPlus){
        System.out.println(" ");
        for (int i = 0; i < ArrayToBoost.length; i++){
            ArrayToBoost[i] += VarToPlus;
        }
        System.out.println(Arrays.toString(ArrayToBoost));
    }
    public static void FindMax (int[] ArrFindMax){
        int FirstHalf = 0;
        int SecondHalf = 0;
        for (int i = 0; i < ArrFindMax.length; i++){
            if (i < ArrFindMax.length / 2){
                FirstHalf += ArrFindMax[i];
            } else {
                SecondHalf += ArrFindMax[i];
            }
        }
        if (FirstHalf > SecondHalf){
            System.out.println("Первая половина больше");
        } else if (FirstHalf < SecondHalf) {
            System.out.println("Вторая половина больше");
        } else {
            System.out.println("Обе половины одинакового размера");
        }
    }
    public static void SumArray(int[] a, int[] b, int[] c){
        c[0] += a[0] + b[0];
        c[1] += a[1] + b[1];
        c[2] += a[2] + b[2];
        c[3] += b[3];
        System.out.println(Arrays.toString(c));
    }
    public static void FindDot(int[] ArrayToFind){
        int LeftSum = 0;
        int RightSum = 0;
        for (int i = 0; i < ArrayToFind.length; i++){
            RightSum += ArrayToFind[i];
        }
        for (int i = 0; i < ArrayToFind.length; i++){
            if (RightSum == LeftSum){
                System.out.println("Точка Равенства сумм левой и правой части находится между " + ArrayToFind[i-1] + " и " + ArrayToFind[i]);
                break;
            } else if (LeftSum > RightSum) {
                System.out.println("Такой точки нет");
                break;
            } else {
                LeftSum += ArrayToFind[i];
                RightSum -= ArrayToFind[i];
            }
        }

    }
    public static void ArrUp(int[] ArrAn){
        boolean Flag = true;
        int BrP = 0;
        for (int i = 0; i < ArrAn.length - 1; i++){
            if (ArrAn[i] >= ArrAn[i+1]){
                Flag = false;
                BrP = i;
            }
        }
        if (Flag){
            System.out.println("Массив всегда растёт");
        } else {
            System.out.println("Массив растет не всегда. Рост нарушается в точке с номером " + BrP);
        }
    }
    public static void ArrDown(int[] ArrAn){
        boolean Flag = true;
        int BrP = 0;
        for (int i = 0; i < ArrAn.length - 1; i++){
            if (ArrAn[i] <= ArrAn[i+1]){
                Flag = false;
                BrP = i;
            }
        }
        if (Flag){
            System.out.println("Массив всегда убывает");
        } else {
            System.out.println("Массив убывает не всегда. Рост нарушается в точке с номером " + BrP);
        }
    }
    public static void ArrReverse(int[] MasToRev){
        int swap = 0;
        for (int i = 0; i < MasToRev.length/2; i++){
            swap = MasToRev[i];
            MasToRev[i] = MasToRev[MasToRev.length-(i+1)];
            MasToRev[MasToRev.length-(i+1)] = swap;
        }
        System.out.println(Arrays.toString(MasToRev));
    }
}
