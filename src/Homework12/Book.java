package Homework12;

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

    public String getAuthorName() {
        return this.author.getFullName();
    }

    public Author getAuthorObject() {
        return this.author;
    }

}
