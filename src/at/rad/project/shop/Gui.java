package at.rad.project.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gui {
    private List<Product> products = new ArrayList<Product>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void run() {
        while (true) {
            System.out.println("1 Show Products");
            System.out.println("2 Show Stock Value");
            System.out.println("3 Show Cars");
            System.out.println("4 Show Bikes");
            System.out.println("5 Show Planes");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;

                case 2:
                    showStockValue();
                    break;

                case 3:
                    showCars();
                    break;

                case 4:
                    showBikes();
                    break;

                case 5:
                    showPlanes();
                    break;

                default:
                    break;
            }

        }
    }

    private void showProducts() {
        System.out.println("show Products");
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
           
        }
    }

    private void showCars() {
        System.out.println("show Cars");
        for (Product product : products) {
            if (product instanceof Car) {
                System.out.println("Name: " + product.getName() + " ,Color: " + product.getColor());
            }
        }
    }
    
    private void showBikes() {
        System.out.println("show Bikes");
        for (Product product : products) {
            if (product instanceof Bike) {
                System.out.println("Name: " + product.getName() + " ,Style: " + ((Bike) product).getStyle());
            }
        }
    }   


    private void showPlanes() {
        System.out.println("show Planes");
        for (Product product : products) {
            if (product instanceof Plane) {
                System.out.println("Name: " + product.getName());// + " ,model: " + product.getModel()
            }
        }
    }   

    private void showStockValue() {
        System.out.println("show Stock Value");
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getPrice();   
            System.out.println("Total stock value: €" + totalValue);
        }
    }
}