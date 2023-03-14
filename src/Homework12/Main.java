package Homework12;

public class Main {
    public static void main(String[] args) {
        Author kukushkin = new Author("Андрей", "Кукушкин");
        Author lermontov = new Author("Михаил", "Лермонтов");

        Book gnomikGena = new Book(kukushkin, "Приключения гнома Геннадия в лиминальных пространствах Сальвадора Дали", 2007);
        Book verse = new Book(kukushkin, "Я не Лермонтов, не Пушкин, я - блатной поэт Кукушкин!", 1992);
        Book hero = new Book(lermontov, "Герой нашего времени", 1840);
        Book borodino = new Book(lermontov, "Бородино", 1837);

        printBookInfo(gnomikGena);
        gnomikGena.setYear(2012);
        printBookInfo(gnomikGena);
        // Не по заданию ↓
        printBookInfo(borodino);
        printAuthorOfBook(verse);



    }

    public static void printBookInfo(Book book) {
        System.out.println(book.getName() + ", " + book.getAuthorName() + ", " + book.getYear());
        System.out.println(" ");
    }

    //Эксперимент над мышами ↓
    public static void printAuthorOfBook(Book book) {
        System.out.println(book.getAuthorObject().getFullName());
        System.out.println(" ");
    }
}