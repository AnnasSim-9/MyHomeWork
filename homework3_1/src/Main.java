import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book  B = new Book();
        Reader R = new Reader();



        // получаем список взятых книг, т.е. заполненые формуляры из 10 разрешенных
        // методы в зависимости от входящего параметра
        //R.printStatus();
        R.printStatus(R.nameuser);
        R.takeBook(R.nameuser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Читатель сдает книгу: ");
        String nameBook = scanner.nextLine();
        System.out.println(R.returnBook(nameBook));


    }
}