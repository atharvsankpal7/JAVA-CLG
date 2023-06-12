package Experiment6;


import java.util.ArrayList;
import java.util.Scanner;

interface LibraryItem {

    void checkOut(int checkoutItem);

    void checkIn(int checkinItem);

    void createnewItem(int newItem);

    boolean isAvailable();
}

class Book implements LibraryItem {

    static ArrayList<Book> bookArrayList = new ArrayList<>();
    static ArrayList<Book> checkedOutBooks = new ArrayList<>();
    private boolean item = true;
    private String title;
    private String author;
    private int ISBN;
    static Scanner io = new Scanner(System.in);

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public int getISBN() {
        return ISBN;
    }


    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }


    public void checkOut(int checkoutISBN) {

        for (Book book : bookArrayList) {
            if (book.ISBN == checkoutISBN) {
                checkedOutBooks.add(book);
                bookArrayList.remove(book);
                System.out.println("The item has been checked out successfully");
                return;
            }
        }
        System.out.println("The Book is not available for the checkout");
    }


    public void checkIn(int checkinISBN) {
        for (Book book : checkedOutBooks) {
            if (book.ISBN == checkinISBN) {
                bookArrayList.add(book);
                checkedOutBooks.remove(book);
                System.out.println("The book has been checked in Thank you for returning the book");
                return;
            }
        }
        System.out.println("The book wasn't checked out please enter the rest of the information");
        createnewItem(checkinISBN);
    }

    public void createnewItem(int newISBN) {
        Book newBook = new Book();
        newBook.setISBN(newISBN);
        System.out.println("Enter the title of the book --> ");
        newBook.setTitle(io.next());
        io.nextLine();
        System.out.println("Enter the name of author --> ");
        newBook.setAuthor(io.nextLine());
        bookArrayList.add(newBook);
    }

    public void displayInfo() {
        System.out.println("Title:" + getTitle());
        System.out.println("ISBN:" + getISBN());
        System.out.println("Author:" + getAuthor());
    }

    private boolean searchByattribute(int searchISBN, String searchTitle) {
        if (searchISBN != -1) {
            for (Book book : bookArrayList) {
                if (book.ISBN == searchISBN) {
                    book.displayInfo();
                    return true;
                }
            }
        } else {
            for (Book book : bookArrayList) {
                if (searchTitle.equals(book.title)) {
                    book.displayInfo();
                    return true;
                }

            }
        }
        return false;
    }

    private boolean searchByattribute(String searchAuthor) {
        for (Book book : bookArrayList) {
            if (book.author.equals(searchAuthor)) {
                book.displayInfo();
                return true;
            }
        }
        return false;
    }


    public boolean isAvailable() {
        System.out.println("Which criteria do you want to search in ? ");
        System.out.println("1.Title\t2.Author name\t3.ISBN");
        int option = io.nextInt();
        io.nextLine();
        switch (option) {
            case 1 -> {
                System.out.println("Enter the title of the book ");
                return searchByattribute(-1, io.next());
            }
            case 2 -> {
                System.out.println("Enter the Author name of the book ");
                return searchByattribute(io.nextLine());
            }
            case 3 -> {
                System.out.println("Enter the ISBN of the book ");
                return searchByattribute(io.nextInt(), "empty Title will not be used");
            }
            default -> {
                System.out.println("Enter valid input");
                isAvailable();
            }
        }
        return false;
    }
}


class DVD implements LibraryItem {
    static ArrayList<DVD> dvdList = new ArrayList<>();
    static ArrayList<DVD> checkedOutDVDs = new ArrayList<>();
    private String title;
    private String director;
    private int releaseYear;
    private boolean itemAvailable = true;
    private static Scanner scanner = new Scanner(System.in);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void checkOut(int checkoutItem) {
        for (DVD dvd : dvdList) {
            if (dvd.getReleaseYear() == checkoutItem) {
                checkedOutDVDs.add(dvd);
                dvdList.remove(dvd);
                System.out.println("Successfully checked out Item");
                return;
            }
        }
        System.out.println("The DVD is not available for checkout.");
    }

    public void checkIn(int checkinItem) {
        for (DVD dvd : checkedOutDVDs) {
            if (dvd.getReleaseYear() == checkinItem) {
                dvdList.add(dvd);
                checkedOutDVDs.remove(dvd);
                System.out.println("The DVD has been checked in. Thank you for returning it.");
                return;
            }
        }
        System.out.println("The DVD wasn't checked out. Please enter the rest of the information.");
        createnewItem(checkinItem);
    }

    public void createnewItem(int newReleaseYear) {
        DVD newDVD = new DVD();
        newDVD.setReleaseYear(newReleaseYear);
        System.out.println("Enter the title of the DVD: ");
        newDVD.setTitle(scanner.nextLine());
        System.out.println("Enter the name of the director: ");
        newDVD.setDirector(scanner.nextLine());
        dvdList.add(newDVD);
    }

    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Release Year: " + getReleaseYear());
        System.out.println("Director: " + getDirector());
    }

    private boolean searchByAttribute(int searchReleaseYear, String searchTitle) {
        if (searchReleaseYear != -1) {
            for (DVD dvd : dvdList) {
                if (dvd.getReleaseYear() == searchReleaseYear) {
                    dvd.displayInfo();
                    return true;
                }
            }
        } else {
            for (DVD dvd : dvdList) {
                if (searchTitle.equals(dvd.getTitle())) {
                    dvd.displayInfo();
                    return true;
                }
            }
        }
        return false;
    }

    private boolean searchByAttribute(String searchDirector) {
        for (DVD dvd : dvdList) {
            if (searchDirector.equals(dvd.director)) {
                dvd.displayInfo();
                return true;
            }
        }
        return false;
    }

    public boolean isAvailable() {
        System.out.println("Which criteria do you want to search by?");
        System.out.println("1. Title\t2. Director\t3. Release Year");
        int searchOption = scanner.nextInt();
        switch (searchOption) {
            case 1 -> {
                System.out.println("Enter the title of the DVD: ");
                return searchByAttribute(-1, scanner.next());
            }
            case 2 -> {
                System.out.println("Enter the name of the director: ");
                return searchByAttribute(scanner.nextLine());
            }
            case 3 -> {
                System.out.println("Enter the release year of the DVD: ");
                return searchByAttribute(scanner.nextInt(), "empty Title will not be used");
            }
            default -> {
                System.out.println("Enter valid input.");
                isAvailable();
            }
        }
        return false;
    }
}

public class _question4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Library System!");

        addSampleBooks();
        addSampleDVDs();

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Manage Books");
            System.out.println("2. Manage DVDs");
            System.out.println("3. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); //Clear the buffer

            switch (option) {
                case 1:
                    manageBooks();
                    break;
                case 2:
                    manageDVDs();
                    break;
                case 3:
                    System.out.println("Thank you for using the Library System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void manageBooks() {
        System.out.println("\nBook Management");
        System.out.println("1. Check Out a Book");
        System.out.println("2. Check In a Book");
        System.out.println("3. Create a New Book");
        System.out.println("4. Search for Books");

        int option = scanner.nextInt();
//        scanner.nextLine(); // Consume the newline character

        switch (option) {
            case 1:
                System.out.println("Enter the ISBN of the book to check out:");
                int checkoutISBN = scanner.nextInt();
                Book.bookArrayList.get(0).checkOut(checkoutISBN);
                break;
            case 2:
                System.out.println("Enter the ISBN of the book to check in:");
                int checkinISBN = scanner.nextInt();
                Book.bookArrayList.get(0).checkIn(checkinISBN);
                break;
            case 3:
                System.out.println("Enter the ISBN of the new book:");
                int newISBN = scanner.nextInt();
                Book.bookArrayList.get(0).createnewItem(newISBN);
                break;
            case 4:
                Book.bookArrayList.get(0).isAvailable();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private static void manageDVDs() {
        System.out.println("\nDVD Management");
        System.out.println("1. Check Out a DVD");
        System.out.println("2. Check In a DVD");
        System.out.println("3. Create a New DVD");
        System.out.println("4. Search for DVDs");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (option) {
            case 1:
                System.out.println("Enter the release year of the DVD to check out:");
                int checkoutReleaseYear = scanner.nextInt();
                DVD.dvdList.get(0).checkOut(checkoutReleaseYear);
                break;
            case 2:
                System.out.println("Enter the release year of the DVD to check in:");
                int checkinReleaseYear = scanner.nextInt();
                DVD.dvdList.get(0).checkIn(checkinReleaseYear);
                break;
            case 3:
                System.out.println("Enter the release year of the new DVD:");
                int newReleaseYear = scanner.nextInt();
                DVD.dvdList.get(0).createnewItem(newReleaseYear);
                break;
            case 4:
                DVD.dvdList.get(0).isAvailable();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private static void addSampleBooks() {
        System.out.println("Adding sample books to the library...");

        Book book1 = new Book();
        book1.setISBN(123456);
        book1.setTitle("Book 1");
        book1.setAuthor("Author 1");
        Book.bookArrayList.add(book1);

        Book book2 = new Book();
        book2.setISBN(234567);
        book2.setTitle("Book 2");
        book2.setAuthor("Author 2");
        Book.bookArrayList.add(book2);

        Book book3 = new Book();
        book3.setISBN(345678);
        book3.setTitle("Book 3");
        book3.setAuthor("Author 3");
        Book.bookArrayList.add(book3);

        Book book4 = new Book();
        book4.setISBN(456789);
        book4.setTitle("Book 4");
        book4.setAuthor("Author 4");
        Book.bookArrayList.add(book4);

        Book book5 = new Book();
        book5.setISBN(567890);
        book5.setTitle("Book 5");
        book5.setAuthor("Author 5");
        Book.bookArrayList.add(book5);

        System.out.println("Sample books added successfully.");
    }

    private static void addSampleDVDs() {
        System.out.println("Adding sample DVDs to the library...");

        DVD dvd1 = new DVD();
        dvd1.setReleaseYear(2000);
        dvd1.setTitle("DVD 1");
        dvd1.setDirector("Director 1");
        DVD.dvdList.add(dvd1);

        DVD dvd2 = new DVD();
        dvd2.setReleaseYear(2001);
        dvd2.setTitle("DVD 2");
        dvd2.setDirector("Director 2");
        DVD.dvdList.add(dvd2);

        DVD dvd3 = new DVD();
        dvd3.setReleaseYear(2002);
        dvd3.setTitle("DVD 3");
        dvd3.setDirector("Director 3");
        DVD.dvdList.add(dvd3);

        DVD dvd4 = new DVD();
        dvd4.setReleaseYear(2003);
        dvd4.setTitle("DVD 4");
        dvd4.setDirector("Director 4");
        DVD.dvdList.add(dvd4);

        DVD dvd5 = new DVD();
        dvd5.setReleaseYear(2004);
        dvd5.setTitle("DVD 5");
        dvd5.setDirector("Director 5");
        DVD.dvdList.add(dvd5);

        System.out.println("Sample DVDs added successfully.");
    }

}
