import java.security.KeyStore;
import java.util.Date;
import java.util.Scanner;

public class Reader {
    String nameuser;
    int numticket;
    String department;
    String birthday; // потом посмотреть формат
    String phone;
    String[] arrbook;


    public Reader() {
        nameuser = "Иванова С.С.";
        numticket = 23453;
        department = "Всемирная литература";
        birthday = "05/10/1999";
        phone = "+375291234567";
        arrbook = new String[10];
        arrbook[0] = "Маленький принц";
        arrbook[1] = "Мастер и Маргарита";
        arrbook[2] = "Война и мир";
        arrbook[3] = "Фауст";
        // что-то  пока только так пустые значения...
        arrbook[4] = null;
        arrbook[5] = null;
        arrbook[6] = null;
        arrbook[7] = null;
        arrbook[8] = null;
        arrbook[9] = null;
    }

    void printStatus() {
        String books = "";
        int m = 0;
        for (int i = 0; i < arrbook.length; i++) {
            if (arrbook[i] != null) {
                books = books + arrbook[i] + "; ";
                m = m + 1;
            }
        }
        System.out.println("Читатель " + "взял(а) " + m + " книг(и): " + books);
    }

    void printStatus(String nameuser) {
        String books = "";
        int m = 0;
        for (int i = 0; i < arrbook.length; i++) {
            if (arrbook[i] != null) {
                books = books + arrbook[i] + "; ";
                m = m + 1;
            }
        }
        System.out.println(nameuser + "взял(а) " + m + " книг(и): " + books);
    }

    void takeBook() {
        System.out.println("Читателю не выдали книгу!");
    }

    void takeBook(String nameuser) {
        Book B = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Наименование книги");
        String name = scanner.nextLine();
        System.out.println("Автор книги");
        String authorname = scanner.nextLine();
        System.out.println("Отзыв/Содержание");
        String text = scanner.nextLine();
        String booknew = "";
        B.name = name;
        B.authorname = authorname;
        B.text = text;

        for (int i = 0; i < arrbook.length; i++) {
            if (arrbook[i] == null) {
                booknew = booknew + B.name + " " + B.authorname + "  " + B.text;
                arrbook[i] = booknew;
                System.out.println(nameuser + " взял(а) книгу  " + booknew);
                return;
            }
        }
    }

        String returnBook() {
        String outbook  = "Не определена книга";
        return outbook;
    }

        String returnBook(String nameBook) {
            String outbook = null;
            for (int i = 0; i < arrbook.length; i++ ) {
                if (nameBook.equals(arrbook[i])) {
                    outbook = nameuser + " вернул(а) книгу " + arrbook[i];
                    arrbook[i] = null;
                    return outbook;
                } else {
                    outbook = nameuser + " не хранит книгу  " + nameBook;
                }
            }
            return outbook;
        }



}








