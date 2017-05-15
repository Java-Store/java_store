package JavaStore;

import java.util.Scanner;
import java.util.Date;

/**
 * Created by DelMonroe on 5/15/17.
 */
public class myStore {
    public static void main(String[] args) {


        showMenu();

    }

    public static void showMenu() {
        String name = "";
        String sales = "";
        String answer = "";
        float price = 0;
        int quant = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("======= Store Menu ======");
        System.out.println("1) Sale\n");
        System.out.println("2) Print Receipt\n");
        System.out.println("3) Exit\n");


        int selection = input.nextInt();

        if (selection == 1) {
            do {
                name = getName();
                sales = Sale();
                price = Price();
                quant = getQuantity();
                System.out.println("Do you want to enter another item (y/n)?");
                answer = input.next();
                showMenu();

            } while (answer.equalsIgnoreCase("y"));

        } else if (selection == 2) {
            getReceipt(name, sales, price, quant);


        } else if (selection == 3) {
            exitMenu();

        }

    }

    public static String Sale() {
        Scanner input = new Scanner(System.in);
        String items = "";

        System.out.println("What Item do you want?");
        items += input.nextLine();
        return items;
    }

    public static float Price() {
        float prices = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Price");
        prices += input.nextFloat();

        return prices;
    }

    public static int getQuantity() {
        int itemQuantities = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many would you like today?");
        itemQuantities += input.nextInt();
        return itemQuantities;
    }

    public static void getdateTime() {
        Date date = new Date();
        System.out.println(date);
    }

    public static String getReceipt (String sale, String quantitiy, String price, String name, String dateTime) {
        System.out.printf("Name: "%s, "Date: " %s, "Sale: " %s, "Quantity: " %s, "Price: $" %s, name, dateTime, sale, quantitiy, price);

    }

    public static String getName() {
        Scanner input = new Scanner(System.in);
        String fname;

        do {
            System.out.println("Please enter your name: ");
            fname = input.nextLine();

        } while (fname.isEmpty());
        return fname;
    }

    public static void exitMenu() {
        System.exit(0);

    }
}
