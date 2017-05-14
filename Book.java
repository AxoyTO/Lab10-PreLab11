import java.util.Scanner;

public class Book {

    Scanner sc = new Scanner(System.in);

    private String publisher;
    private String title;
    private int publicationYear;
    private int numberOfPages;
    private double price;
    private boolean genre; //TRUE FOR DRAMA - FALSE FOR FICTION
    private int ageOfBook;
    public double foreignAmount;
    public double nationalAmount;


    public void readInformation() {
        System.out.println("Title: ");
        title = sc.nextLine();
        System.out.println("Publication year: ");
        publicationYear = sc.nextInt();
        System.out.println("Number of pages: ");
        numberOfPages = sc.nextInt();
        System.out.println("Price: ");
        price = sc.nextDouble();
        System.out.println("Genre (Drama/Fiction): ");
        String del = sc.next();
        if (del.equals("Drama")) {
            genre = true;
        }
        else if (del.equals("Fiction")) {
            genre = false;
        }
    }

    public int predictAmountToBeSold(int choice) {

        ageOfBook = (2017 - publicationYear);
        if (choice == 1) {
            if (!genre) {
                nationalAmount = (numberOfPages * 100) - (price * 10) + (ageOfBook * 100) + 10000;
                System.out.println("This book will sell about " + nationalAmount + " units.\n");
            } else {
                nationalAmount = (numberOfPages * 100) - (price * 10) + (ageOfBook * 100);
                System.out.println("This book will sell about " + nationalAmount + " units.\n");
            }
        } else if (choice == 2) {
            if (genre) {
                foreignAmount = (numberOfPages * 1000) - (price * 100) + (ageOfBook * 1000) - 1000;
                System.out.println("This book will sell about " + foreignAmount + " units.\n");
            } else {
                foreignAmount = (numberOfPages * 1000) - (price * 100) + (ageOfBook * 1000);
                System.out.println("This book will sell about " + foreignAmount + " units.\n");
            }
        }
        return choice;
    }

    public void printInformation() {
        if (!genre) {
            System.out.println("\"" + this.title + "\"" + " is a fictional book published in " +
                    (publicationYear) + " by " + publisher + ". " + numberOfPages +
                    " pages long book is on sale for " + price + " TL. \n");
        } else {
            System.out.println("\"" + this.title + "\"" + " is a drama book published in " +
                    (publicationYear) + " by " + publisher + ". " + numberOfPages +
                    " pages long book is on sale for " + price + " TL. \n");
        }
    }

    public boolean areBooksEqual(Book book1) {

        if (!book1.title.equals(this.title) ||
                book1.publicationYear != this.publicationYear ||
                book1.numberOfPages != this.numberOfPages ||
                book1.price != this.price ||
                !book1.genre == this.genre) {
            System.out.println("These books do not have same features.");
            return false;
        } else {
            System.out.println("These books have same features.");
            return true;
        }
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isGenre() {
        return genre;
    }

    public void setGenre(boolean genre) {
        this.genre = genre;
    }

    public Book(String publisher) {
        this.publisher = publisher;
        this.title = title;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.genre = genre;

    }
}
