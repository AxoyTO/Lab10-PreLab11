public class BookTest {

    public static void main(String[] args) {

        Book book1 = new Book("Houghton Mifflin Harcourt");
        Book book2 = new Book("YKY");



        book1.setTitle("Animal Farm");
        book1.setPublicationYear(1945);
        book1.setNumberOfPages(144);
        book1.setPrice(12.5);
        book1.setGenre(false);

        book1.printInformation();
        book1.predictAmountToBeSold(2);

        System.out.println("Enter information of second book:");
        book2.readInformation();
        book2.printInformation();
        book2.predictAmountToBeSold(1);

        book1.areBooksEqual(book2);
    }
}
