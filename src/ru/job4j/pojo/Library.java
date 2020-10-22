package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
    Book kolobok = new Book("Колобок", 10);
    Book buratino = new Book("Буратино", 125);
    Book cleanCode = new Book("Clean code", 464);
    Book thinkingInJava = new Book("Thinking in Java", 1168);

    Book[] books = new Book[4];
        books[0] = kolobok;
        books[1] = buratino;
        books[2] = cleanCode;
        books[3] = thinkingInJava;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " Количество страниц - " + bk.getPages());
        }
        System.out.println("Replace kolobok to thinkingInJava.");
        Book poket = books[0];
        books[0] = books[3];
        books[3] = poket;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " Количество страниц - " + bk.getPages());
        }
        System.out.println("Shown only book \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " Количество страниц - " + bk.getPages());
            }
        }
    }
}
