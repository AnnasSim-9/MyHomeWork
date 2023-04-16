import java.util.Scanner;

/*
Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
Выведите массив на экран, после чего отсортируйте его с помощью сортировки «пузырьком» и
выведите уже отсортированный массив
*/
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

        for (int i = 0; i < n; i++) {
            array[i] = (int) ((Math.random() * (b - a)) + a);
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++ ) {
                if (array[j] > array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        System.out.println("Массив с сортировкой :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}