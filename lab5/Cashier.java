package lab5;

import java.util.List;

public class Cashier {
	private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void printReceipt(InventoryCart cart) {
        List<Product> products = cart.getAllProducts();
        int total = 0;
        
        System.out.println("Pumpkin Shop (" + name + ")");
        for (Product product : products) {
            System.out.println("1 x " + product.getName() + " (" + product.getCode() + ") " + product.getPrice());
            total += product.getPrice();
        }
        System.out.println("--------------");
        System.out.println("Total " + total + "$");
    }
}
