package Experiment5;
//Write a program to design a class representing the information regarding digital library (books,
//tape: book & tape should be separate classes having the base class as media).The class should
//have the functionality for adding new item, issuing, deposit etc.

import java.util.ArrayList;
import java.util.List;

class Media {
    private String title;
    private boolean available;

    public Media(String title) {
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Book extends Media {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Tape extends Media {
    private double duration;

    public Tape(String title, double duration) {
        super(title);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }
}

class DigitalLibrary {
    private List<Media> items;

    public DigitalLibrary() {
        this.items = new ArrayList<>();
    }

    public void addItem(Media item) {
        items.add(item);
    }

    public void issueItem(Media item) {
        if (item.isAvailable()) {
            item.setAvailable(false);
            System.out.println("Item \"" + item.getTitle() + "\" issued.");
        } else {
            System.out.println("Item \"" + item.getTitle() + "\" is not available.");
        }
    }

    public void depositItem(Media item) {
        if (!item.isAvailable()) {
            item.setAvailable(true);
            System.out.println("Item \"" + item.getTitle() + "\" deposited.");
        } else {
            System.out.println("Item \"" + item.getTitle() + "\" is already available.");
        }
    }


}

public class _question_8 {
    public static void main(String[] args) {
        DigitalLibrary library = new DigitalLibrary();

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Python Basics", "Jane Doe");
        Tape tape1 = new Tape("Music Hits", 120.5);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(tape1);

        library.issueItem(book1);
        library.issueItem(tape1);
        library.issueItem(book2);

        library.depositItem(book1);
        library.depositItem(tape1);
        library.depositItem(book2);
    }
}
