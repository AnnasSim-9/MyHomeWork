
//Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
// Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью
public class Main {
    public static void main(String[] args) {

        int[] array = new int[4];
        String m = "";
        for (int i = 0; i < array.length; i++) {
             array[i] = (int) ((Math.random() * (99 - 10)) + 10);
            //m = m * (array[i+1] - array[i]);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] <= array[i]) {
                m = "Последовательность не возрастающая";
                break;
            } else {
                m = "Последовательность строго возрастающая";
            }
        }

        System.out.println(m);


    }
}

