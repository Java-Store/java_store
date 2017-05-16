package JavaStore;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.Scanner;
import java.util.*;
import java.text.*;


/**
 * Created by DelMonroe on 5/15/17.
 */
public class myStore {
    public static void main(String[] args) {
        String sales = "";
        float price = 0;
        int quantity = 0;

        onlyMenu();
        int option = getOption();
        showMenu(option, sales, price, quantity);


    }


    public static void onlyMenu() {
        System.out.println("======= Store Menu ======");
        System.out.println("1) Sale\n");
        System.out.println("2) Print Receipt\n");
        System.out.println("3) Exit\n");

    }


    public static void showMenu(Integer option, String sales, Float price, Integer quantity ) {
        Scanner input = new Scanner(System.in);


        do {
            if (option == 1) {

                sales += Sale();
                quantity += getQuantity();
                input.nextLine();
                price += Price(quantity);


                System.out.println("Do you want to enter another item (y/n)?");
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                   continue;
                }
                onlyMenu();
                int option2 = getOption();
                showMenu(option2, sales, price, quantity);
                break;

            } else if (option == 2) {
                printReceipt(getName().toUpperCase(), sales, quantity, price);
                System.out.println("\n");
                getdateTime();
                onlyMenu();


            } else if (option == 3) {
                exitMenu();
            }
        } while (option != 3 );

    }


    public static String Sale() {
        Scanner input = new Scanner(System.in);
        String item;

        System.out.println("What Item do you want?");
        item = input.nextLine();
        return item;
    }


    public static float Price(Integer quantity) {
        float price = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Price");
        price = input.nextFloat();
        float prices = price * quantity;

        return prices;
    }


    public static int getQuantity() {
        int itemQuantity = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many would you like today?");
        itemQuantity = input.nextInt();

        return itemQuantity;
    }

    public static void getdateTime() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd' - 'hh:mm:ss a zz");
        System.out.println(ft.format(date));
    }

    public static void printReceipt (String name, String sale, int quantity, float price) {
        System.out.printf("Name: %s \nSale: %s(%d), \nPrice: $%.2f", name, sale, quantity, price);

    }


    public static String getName() {
        Scanner input = new Scanner(System.in);
        String flname;

        do {
            System.out.println("Please enter your name: ");
            flname = input.nextLine();

        } while (flname.isEmpty());

        return flname;
    }

    public static void exitMenu() {
        System.exit(0);

    }

    public static int getOption () {
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.nextLine();
        return option;
    }


}
