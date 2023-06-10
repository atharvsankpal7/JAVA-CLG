package Experiment5;

import java.util.ArrayList;
import java.util.Scanner;

class ShoppingList {
    static Scanner io = new Scanner(System.in);

    static class Items {
        int codeNo;
        double price;
    }

    static void addItems(ArrayList<Items> sl) {
        Items itemTobeAdded = new Items();
        System.out.println("Enter the code number of the item -->");
        itemTobeAdded.codeNo = io.nextInt();
        System.out.println("Enter the price of the item -->");
        itemTobeAdded.price = io.nextDouble();
        sl.add(sl.size(), itemTobeAdded);
    }

    static void deleteItems(ArrayList<Items> sl) {
        System.out.println("Enter the code number that you want to remove");
        int codeNoTobeRemoved = io.nextInt();
        System.out.println(sl.removeIf(item -> item.codeNo == codeNoTobeRemoved) ? "The item was removed" : "The item was not found");
    }

    static void printItems(ArrayList<Items> sl) {
        if (sl.size() == 0) {
            System.out.println("The list is empty");
            return;
        }
        double totalAmount = 0;
        System.out.println("\tcode | price");
        for (int i = 0; i < sl.size(); i++) {
            System.out.println("\t" + sl.get(i).codeNo + " | " + sl.get(i).price);
            totalAmount += sl.get(i).price;
        }
        System.out.println("The total price of shopping list is " + totalAmount);
    }
}


public class _question_6 {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        ArrayList<ShoppingList.Items> shoppingList = new ArrayList<>();
        int a = -1;
        do {
            System.out.println("Enter the choice");
            System.out.println("1.Add Items\t2.Delete Items\t3.Print List");
            a = io.nextInt();
            switch (a) {
                case 0 -> System.out.println("The program has been terminated");
                case 1 -> ShoppingList.addItems(shoppingList);
                case 2 -> ShoppingList.deleteItems(shoppingList);
                case 3 -> ShoppingList.printItems(shoppingList);
                default -> System.out.println("Invalid Choice!!!!");
            }
        } while (a != 0);
    }

}
