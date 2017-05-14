import java.util.Scanner;

public class StockItem {

    Scanner sc = new Scanner(System.in);

    private String itemName;
    private String stockCode;
    private double price;
    private int totalStock;
    private String answer;

    public int getStock() {
        return totalStock;
    }

    public void setItemName(String newName) {
        this.itemName = newName;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void incrementStock() {
        System.out.println("Would you like to add more items: ");
        answer = sc.next();
        if (answer.equals("Y")) {
            System.out.println("Enter the number of the new items to add:");
            totalStock += sc.nextInt();
        }
    }

    public double calculateTotalPrice() {
        double totalValue = price * totalStock;
        return totalValue;
    }


    public void readInfo(int a) {
        if (a == 1) {
            System.out.println("Enter the first item name:");
            itemName = sc.nextLine();
            System.out.println("Enter the stock code of the first item:");
            stockCode = sc.next();
            System.out.println("Enter the total number of the first item:");
            totalStock = sc.nextInt();
            System.out.println("Enter the price per item:");
            price = sc.nextDouble();
            incrementStock();
            System.out.println("You have " + totalStock + " items of " + itemName + " (code:" + stockCode + ")");
            System.out.println("Total value of the first item: " + calculateTotalPrice());
        } else if (a == 2){
            System.out.println("Enter the second item name:");
            itemName = sc.nextLine();
            System.out.println("Enter the stock code of the second item:");
            stockCode = sc.next();
            System.out.println("Enter the total number of the second item:");
            totalStock = sc.nextInt();
            System.out.println("Enter the price per item:");
            price = sc.nextDouble();
            incrementStock();
            System.out.println("You have " + totalStock + " items of " + itemName + " (code:" + stockCode + ")");
            System.out.println("Total value of the second item: " + calculateTotalPrice());
        }
    }
}
