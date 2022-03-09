package bookmagazine;


import java.util.Scanner;

public class Main {
    public static boolean check(Book book, Book[] bookArr) {
        for (Book i : bookArr) {
            //System.out.println(i.toString());
            if (i.equals(book)) {
                return false;
            }
            //System.out.println("j");
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        Book[] bookArr = new Book[10];
        ;
        Book book1 = new Book();
        for (int i = 0; i < 10; i++) {
            bookArr[i] = book1;
        }
        while (count < 3) {
            Scanner scanner = new Scanner(System.in);
            Book book = new Book();

            System.out.println("Введите название книги: ");
            book.nameBook = scanner.nextLine();
            System.out.println("Введите год издания : ");
            book.yearPublication = scanner.nextInt();
            System.out.println("Введите цену : ");
            book.priceBook = scanner.nextInt();
            if (check(book, bookArr)) bookArr[count++] = book;
            else System.out.println("Такая книга есть!!");

        }
        System.out.println("Картотека заполнена!!");
        count = 1;
        for (Book i : bookArr) {
            System.out.printf("книга №" + count++ + ": название: %s , год издания: %d., цена - %dusd \n",
                                                               i.nameBook,i.yearPublication,i.priceBook);
        }
    }
}