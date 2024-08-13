import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Billing_app {
    private Map<String, Double> productPrices;

    public Billing_app() {
        productPrices = new HashMap<>();
        productPrices.put("Diamond Ring", 5000.0);
        productPrices.put("Gold Necklace", 2000.0);
        productPrices.put("Platinum Watch", 8000.0);
        productPrices.put("Silver Bracelet", 1000.0);
    }

    public void displayProductPrices() {
        System.out.println("Product\t\tPrice");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void removeProduct(String product) {
        productPrices.remove(product);
    }

    public static void main(String[] args) {
        Billing_app blingApp = new Billing_app();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String product;
        double price;

        do {
            System.out.println("\n1. Display Product Prices");
            System.out.println("2. Add Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    blingApp.displayProductPrices();
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    scanner.nextLine(); // consume newline not consumed by nextInt()
                    product = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    price = scanner.nextDouble();
                    blingApp.addProduct(product, price);
                    break;
                case 3:
                    System.out.print("Enter product name to remove: ");
                    product = scanner.nextLine();
                    blingApp.removeProduct(product);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}