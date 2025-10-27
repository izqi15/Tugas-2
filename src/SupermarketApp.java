import java.util.*;

class Item {
    private String name;
    private double price;
    private int quantity;

    Item(String name, double price, int quantity) {
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    /**
     *
     * @param item
     * @return
     */
    static double calculateTotal(Item item) {
        return item.getPrice() * item.getQuantity();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Cashier {
    public static final int MIN_PURCHASE_FOR_DISCOUNT = 100000;
    public static final double DISCOUNT_RATE = 0.05;
    private List<Item> cart = new ArrayList<>();
    private double discount = 0.0;

    /**
     *
     * @param name
     * @param price
     * @param quantity
     */
    public void addItem(String name, double price, int quantity) {
        cart.add(new Item(name, price, quantity));
    }

    public void printReceipt() {
        double total = 0;
        System.out.println("===== SUPERMARKET RECEIPT =====");
        for (Item i : cart) {
            double subtotal = Item.calculateTotal(i);
            System.out.println(i.getName() + " x" + i.getQuantity() + " = " + subtotal);
            total += subtotal;
        }

        if (total > MIN_PURCHASE_FOR_DISCOUNT) {
            discount = total * DISCOUNT_RATE;
            System.out.println("Discount (5%): " + discount);
        }

        double totalAfterDiscount = total - discount;
        System.out.println("Total Payment: " + totalAfterDiscount);
        System.out.println("===============================");
    }

}

public class SupermarketApp {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cashier cashier = new Cashier();

        while (true) {
            System.out.print("Enter item name (or 'done'): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            cashier.addItem(name, price, qty);
        }

        cashier.printReceipt();
        sc.close();
    }
}
