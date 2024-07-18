package lab1_practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1.2 กำหนดตัวแปร Product สำหรับเก็บสินค้า 5 ชนิด
        Product[] products = new Product[5];
        
        products[0] = new Product(0,"Mama",5.5);
        products[1] = new Product(10,"Lays",10.5);
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("======== Enter Products detail ========");
        for(int i = 2; i < 5; i++) {
        	System.out.println("Product code " + (i*10));
        	System.out.print("name:");
        	String name = scanner1.nextLine();
        	System.out.print("price:");
        	double price = Double.parseDouble(scanner1.nextLine());
        	products[i] = new Product((i*10),name,price); 
        }
        
        System.out.println("========List of Products========");
        for(Product product : products) {
        	System.out.println("Product code "+ product.getCode());
        	System.out.println("Name:"+product.getName()+" , Price:"+product.getPrice());
        }
        
        System.out.println("========What do you want to buy?========");
        System.out.println("Enter your product code (press -1 to exit)");
        Scanner scanner2 = new Scanner(System.in);
        double total=0;
        
        while(true) {
        	System.out.println("Product Code:");
        	int productCode = Integer.parseInt(scanner2.nextLine());
        	
        	if(productCode == -1) {
        		break;
        	}
        	Product selectedProduct = null;
            for(Product product : products) {
            	if (product.getCode() == productCode) {
            		selectedProduct = product;
            		break;
            	}
            }
            
            if (selectedProduct != null) {
            	System.out.println("Amount of " + selectedProduct.getName() + ":");
            	int amount = Integer.parseInt(scanner2.nextLine());
            	double totalPrice = amount*selectedProduct.getPrice();
            	total += totalPrice;
            }
        }
        System.out.println("You have to pay "+total+" Bath");
        scanner1.close();
        scanner2.close();
    }
}
