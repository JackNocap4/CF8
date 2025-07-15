package gr.aueb.cf.ch12;

public class ProductMain {

    public static void main(String[] args) {

        Product milk = new Product(1L, "Milk", "nice milk", 15, 200, true);

        milk.setPrice(90);

        System.out.println("Id: " + milk.getId());
        System.out.println("Name: " + milk.getName());
        System.out.println("Description: " + milk.getDescription());
        System.out.println("Price: " + milk.getPrice());
        System.out.println("Quantity: " + milk.getQuantity());
        System.out.println("In Stock: " + milk.getInStock());
    }

}
