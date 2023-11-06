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
                int numberOfLine = scanner.nextInt();
                System.out.println(" ");
                printString(numberOfLine, Line);
            } else if (switchcase == 2) {
                System.out.println(" ");
                //Этот фрагмент кода я буду часто копировать и правильнее было бы вписать его в функцию с возвратом
                //Но мы вроде не проходили return, по этому я не стал
                System.out.println(" Введите длину массива");
                int masLen = scanner.nextInt();
                int[] dataToSum = new int[masLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < dataToSum.length; i++){
                    dataToSum[i] = scanner.nextInt();
                }
                summationMas(dataToSum);
            } else if (switchcase == 3) {
                System.out.println(" ");
                System.out.println(" Введите длину массива ");
                int arrayLen = scanner.nextInt();
                System.out.println(" Каким числом хотите заполнить ");
                int fillMas = scanner.nextInt();
                int[] array = new int[arrayLen];
                fillArray(array, fillMas);
            } else if (switchcase == 4) {
                System.out.println(" ");
                System.out.println(" Введите длину массива ");
                int masLen = scanner.nextInt();
                int[] arrayToBoost = new int[masLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < arrayToBoost.length; i++){
                    arrayToBoost[i] = scanner.nextInt();
                }
                System.out.println(" На какое число хотите увеличить ");
                int arrayPlus = scanner.nextInt();
                arrayPlus(arrayToBoost, arrayPlus);
            } else if (switchcase == 5) {
                System.out.println(" ");
                System.out.println(" Введите длину массива (для корректной работы число должно быть четным)");
                int masLen = scanner.nextInt();
                System.out.println(masLen);
                int[] arrFindMax = new int[masLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < arrFindMax.length; i++){
                    arrFindMax[i] = scanner.nextInt();
                }
                findMax(arrFindMax);
            } else if (switchcase == 6) {
                System.out.println(" ");
                //Я тут столкнулся с проблемой. Не понимаю как проверить существует ли элемент массива
                //Тогда я бы смог задавать им произвольную длину как в прошлых заданиях
                int[] a = {1,1,1};
                int[] b = {2,3,2,3};
                int[] c = {3,4,3,4,3};
                sumArray(a, b, c);

            } else if (switchcase == 7) {
                System.out.println(" ");
                System.out.println(" Введите длину массива ");
                int masLen = scanner.nextInt();
                int[] arrayToFind = new int[masLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < arrayToFind.length; i++){
                    arrayToFind[i] = scanner.nextInt();
                }
                findDot(arrayToFind);
            } else if (switchcase == 8) {
                System.out.println(" Введите длину массива ");
                int masLen = scanner.nextInt();
                int[] arrAn = new int[masLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < arrAn.length; i++){
                    arrAn[i] = scanner.nextInt();
                }
                System.out.println("1 - Проверить на рост\n2 - Проверить на убывание ");
                int isAscendingOrder  = scanner.nextInt();
                if (isAscendingOrder  == 1){
                    arrUp(arrAn);
                } else {
                    arrDown(arrAn);
                }
            } else if (switchcase == 9) {
                System.out.println(" ");
                System.out.println(" Введите длину массива ");
                int masLen = scanner.nextInt();
                int[] masToRev = new int[masLen];
                System.out.println(" Заполните массив данными");
                for (int i = 0; i < masToRev.length; i++){
                    masToRev[i] = scanner.nextInt();
                }
                arrReverse(masToRev);
            }
            if (switchcase == 0){
                break;
            }
        }

    }

    public static void printString(int a, String string){

        for (int i = 0; i < a; i++){
            System.out.println(string);
        }
    }
    public static void summationMas (int[] dataToSum){
        int masSum = 0;
        for (int i = 0; i < dataToSum.length; i++){
            if (dataToSum[i] > 5){
                masSum += dataToSum[i];
            }
        }
        System.out.println("Сумма чисел > 5 = " + masSum);
    }
    public static void fillArray (int[] array, int fillMas){
        System.out.println(" ");
        for (int i = 0; i < array.length; i++){
            array[i] = fillMas;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void arrayPlus (int[] arrayToBoost, int varToPlus){
        System.out.println(" ");
        for (int i = 0; i < arrayToBoost.length; i++){
            arrayToBoost[i] += varToPlus;
        }
        System.out.println(Arrays.toString(arrayToBoost));
    }
    public static void findMax (int[] arrFindMax){
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < arrFindMax.length; i++){
            if (i < arrFindMax.length / 2){
                firstHalf += arrFindMax[i];
            } else {
                secondHalf += arrFindMax[i];
            }
        }
        if (firstHalf > secondHalf){
            System.out.println("Первая половина больше");
        } else if (firstHalf < secondHalf) {
            System.out.println("Вторая половина больше");
        } else {
            System.out.println("Обе половины одинакового размера");
        }
    }
    public static void sumArray(int[] a, int[] b, int[] c){
        if (a.length > b.length){
            for (int i = 0; i < b.length; i++) {
                b[i] += a[i];
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                b[i] += a[i];
            }
        }
        if (b.length > c.length){
            for (int i = 0; i < c.length; i++) {
                b[i] += c[i];
            }
        } else {
            for (int i = 0; i < b.length; i++) {
                b[i] += c[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
    public static void findDot(int[] arrayToFind){
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arrayToFind.length; i++){
            rightSum += arrayToFind[i];
        }
        for (int i = 0; i < arrayToFind.length; i++){
            if (rightSum == leftSum){
                System.out.println("Точка Равенства сумм левой и правой части находится между " + arrayToFind[i-1] + " и " + arrayToFind[i]);
                break;
            } else if (leftSum > rightSum) {
                System.out.println("Такой точки нет");
                break;
            } else {
                leftSum += arrayToFind[i];
                rightSum -= arrayToFind[i];
            }
        }

    }
    public static void arrUp(int[] arrAn){
        boolean flag = true;
        int brP = 0;
        for (int i = 0; i < arrAn.length - 1; i++){
            if (arrAn[i] >= arrAn[i+1]){
                flag = false;
                brP = i;
            }
        }
        if (flag){
            System.out.println("Массив всегда растёт");
        } else {
            System.out.println("Массив растет не всегда. Рост нарушается в точке с номером " + brP);
        }
    }
    public static void arrDown(int[] arrAn){
        boolean flag = true;
        int brP = 0;
        for (int i = 0; i < arrAn.length - 1; i++){
            if (arrAn[i] <= arrAn[i+1]){
                flag = false;
                brP = i;
            }
        }
        if (flag){
            System.out.println("Массив всегда убывает");
        } else {
            System.out.println("Массив убывает не всегда. Рост нарушается в точке с номером " + brP);
        }
    }
    public static void arrReverse(int[] masToRev){
        int swap = 0;
        for (int i = 0; i < masToRev.length/2; i++){
            swap = masToRev[i];
            masToRev[i] = masToRev[masToRev.length-(i+1)];
            masToRev[masToRev.length-(i+1)] = swap;
        }
        System.out.println(Arrays.toString(masToRev));
    }
}
