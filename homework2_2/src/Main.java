import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int m = scanner.nextInt();
        // хорошо бы записть в цикл на три ошибки, например
        if (m < 0) {
            System.out.println("Ошибка!Введите размер массива повтороно.");
            m = scanner.nextInt();
        }

        System.out.println("Введите нижний диапазон:");
        int minval = scanner.nextInt();
        System.out.println("Введите верхний диапазон:");
        int maxval = scanner.nextInt();

        if (minval >= maxval) {

            maxval = scanner.nextInt();
        }

        int[] array = new int[m];
        System.out.println("");
        for (int k = 0; k < array.length; k++) {
            array[k] = (int) ((Math.random() * (maxval - minval)) + minval);
            System.out.print(array[k] + " ");

        }

    }
}

