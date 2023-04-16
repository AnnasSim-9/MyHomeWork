/*
Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
Определите какой элемент является в этом массиве максимальным и сообщите его индекс

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        System.out.println("Введите мин значение массива");
        int a = scanner.nextInt();
        System.out.println("Введите макс значение массива");
        int b = scanner.nextInt();

    int[] array = new int[n];
    int index = -1;

    for (int i = 0; i < n; i++) {
        array[i] = (int) ((Math.random() * (b - a)) + a);

        //
        System.out.print(array[i] + " " );

    }
        System.out.println("");
        int value = array[0];

        for (int k = 0; k < n-1 ; k++) {
             if (value <= array[k]) {
                index = k ;
                value = array[k];
           }
        }
        System.out.println("");
        System.out.println("Максимальное значение массива " + value +" индекс "  + index);

    }
}