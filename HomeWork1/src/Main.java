public class Main {
    public static void main(String[] args) {
    // 1.1
        int n = 0 ; //число, записанное в переменную n

        if ( n%2 == 0 )  { 
            System.out.println("1.1 Вы ввели четное число");
        } else { System.out.println("Вы ввели нечетное число");
        }


        // 1.2.1

        int m;
        m = 1;

        if ((m < 0) || (m > 7)) {
            System.out.println("1.2.1 Введите другое число, такого дня недели не существует");
        } else if (m == 1) {
            System.out.println("1.2.1 День недели- Понедельник");
        } else if (m == 2) {
            System.out.println("1.2.1 День недели- Вторник");
        } else if (m == 3) {
            System.out.println("1.2.1 День недели- Среда");
        } else if (m == 4) {
            System.out.println("1.2.1 День недели- Четверг");
        } else if (m == 5) {
            System.out.println("1.2.1 День недели- Пятница");
        } else if (m == 6) {
            System.out.println("1.2.1 День недели- Суббота");
        } else {
            System.out.println("1.2.1 День недели- Воскресенье");
        }

        // 1.2.2

        switch (m) {
            case 1:
                System.out.println("1.2.2 День недели- Понедельник");
                break;
            case 2:
                System.out.println("1.2.2 День недели- Вторник");
                break;
            case 3:
                System.out.println("1.2.2 День недели- Среда");
                break;
            case 4:
                System.out.println("1.2.2 День недели- Четверг");
                break;
            case 5:
                System.out.println("1.2.2 День недели- Пятница");
                break;
            case 6:
                System.out.println("1.2.2 День недели- Суббота");
                break;
            case 7:
                System.out.println("1.2.2 День недели- Воскресенье");
            default:
                System.out.println("1.2.2 Введите другое число, такого дня недели не существует");
        }

        // 1.3.

        int a = 3;
        int b = 9;
        int c = 3;
        int sum = 0;

        if (a >= b || a >= c) {
            sum = sum + a;
        }
        if (b > a || b >= c) {
            sum = sum + b;
        }
        if (c > b || c > a) {
            sum = sum + c;
        }

        if (a==b & b==c ) {
            System.out.println("1.3 Три числа равны. Сумма двух из них =" + a*2);
        } else {
            System.out.println("1.3 Сумма двух наибольших чисел =" + sum);
        }



    }
}

