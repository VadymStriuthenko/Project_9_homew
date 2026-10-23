package Part_4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 4.2. Arrays of prices and names filled with user input
        int[] prices = new int[5];
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of pizza " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter price of pizza " + (i + 1) + ": ");
            prices[i] = Integer.parseInt(scanner.nextLine());
        }
        // 4.3. Array of pizzas filled with data from the previous arrays
        Pizza[] pizzas = new Pizza[5];
        for (int i = 0; i < 5; i++) {
            pizzas[i] = new Pizza(names[i], prices[i]);
        }
        // 4.4. Sort pizzas by price (bubble sort)
        for (int i = 0; i < pizzas.length - 1; i++) {
            for (int j = 0; j < pizzas.length - 1 - i; j++) {
                if (pizzas[j].getPrice() > pizzas[j + 1].getPrice()) {
                    Pizza temp = pizzas[j];
                    pizzas[j] = pizzas[j + 1];
                    pizzas[j + 1] = temp;
                }
            }
        }
        // 4.5. Display pizzas in sorted order
        System.out.println("Pizzas sorted by price:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getInfo());
        }
    }
}