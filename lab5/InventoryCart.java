package lab5;

import java.util.ArrayList;
import java.util.List;

public class InventoryCart {
	private int capacity;
    private List<Product> products;

    public InventoryCart(int capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (products.size() < capacity) {
            products.add(product);
        } else {
            System.out.println("Cart is full!");
        }
    }

    public Product getProduct() {
        if (products.size() > 0) {
            return products.remove(products.size() - 1);
        } else {
            return null;
        }
    }

    public List<Product> getAllProducts() {
        List<Product> allProducts = new ArrayList<>(products);
        products.clear();
        return allProducts;
    }
}
