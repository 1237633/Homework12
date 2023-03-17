package Homework13;

import java.util.Objects;

public class Book {
    private Author author;
    private String name;
    private int publishingYear;

    public Book(Author author, String name, int year) {
        this.author = author;
        this.name = name;
        this.publishingYear = year;
    }

    public int getYear() {
        return this.publishingYear;
    }

    public void setYear(int newYear) {
        this.publishingYear = newYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) && name.equals(book.name);  //А нельзя сравнивать автора, как объект? Если ссылка идет на один и тот же объект, то значит автор тот же. Получается сейчас, он сравнивает автора по его внутреннему equals, который в свою очередь сравнивает атвора по имени.
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name);
    }

    @Override
    public String toString() {      //Я так понимаю, этот метод нужен для использования в процессе разработки и не подразумевает красивого оформления вывода?
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
