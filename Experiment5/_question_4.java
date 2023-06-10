package Experiment5;

import java.util.Scanner;

class Item {
    int itemNo;
    String name;
    double itemPrice;

    void setData(int i, String n, double ip) {
        itemNo = i;
        name = n;
        itemPrice = ip;
    }

    void getData() {
        System.out.println("The item number of item is " + itemNo);
        System.out.println("The Price of the item is " + name);
        System.out.println("The original price was " + itemPrice);
    }
}

class DiscountedItem extends Item {
    int discountPercent;

    void setDiscountPercent(int dp) {
        discountPercent = dp;
    }

    void getData() {
        super.getData();
        itemPrice -= itemPrice * ((discountPercent) / (double) 100);
        System.out.println("The price after discount is " + itemPrice);
        System.out.println();
    }

}

public class _question_4 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("******For Customer******");
        System.out.println("Enter the number of items purchased --> ");
        DiscountedItem[] itemArr = new DiscountedItem[(io.nextInt())];
        for (int i = 0; i < itemArr.length; i++) {
            itemArr[i] = new DiscountedItem();
            System.out.println("Enter the item number, name, price of the item for index number-->" + (i + 1));
            itemArr[i].setData(io.nextInt(), io.next(), io.nextDouble());
        }
        System.out.println("******For Cashier******");
        for (int i = 0; i < itemArr.length; i++) {
            System.out.println("Enter the discount for item number " + itemArr[i].itemNo);
            itemArr[i].setDiscountPercent(io.nextInt());
        }
        System.out.println("Printing Receipt...........");
        for (int i = 0; i < itemArr.length; i++) {
            itemArr[i].getData();
        }
    }

}
