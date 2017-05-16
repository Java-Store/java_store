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
        onlyMenu();


    }

    public static void onlyMenu() {
        System.out.println("======= Store Menu ======");
        System.out.println("1) Sale\n");
        System.out.println("2) Print Receipt\n");
        System.out.println("3) Exit\n");

        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        showMenu(selection);
    }


    public static int showMenu(Integer option) {
        String sales = "";
        String answer;
        float price = 0;
        int quant = 0;

        Scanner input = new Scanner(System.in);

        /*System.out.println("======= Store Menu ======");
        System.out.println("1) Sale\n");
        System.out.println("2) Print Receipt\n");
        System.out.println("3) Exit\n");*/

        do {
            if (option == 1) {

                sales += Sale() + ", ";
                quant += getQuantity();
                price += Price(quant);


                System.out.println("Do you want to enter another item (y/n)?");
                answer = input.next();
                if (answer.equalsIgnoreCase("y")) {
                    continue;
                }
                onlyMenu();

            } else if (option == 2) {
                printReceipt(getName(), displayData(sales), displayData(quant), displayData(price));
                System.out.println("\n");
                getdateTime();
                onlyMenu();


            } else if (option == 3) {
                exitMenu();
            }
        } while (option != 3 );
        return option;
    }


    public static String Sale() {
        Scanner input = new Scanner(System.in);
        String item = "";

        System.out.println("What Item do you want?");
        item += input.nextLine();
        return item;
    }


    public static float Price(Integer quantity) {
        float price = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Price");
        price += input.nextFloat();
        float prices = price * quantity;

        return prices;
    }

    public static int getQuantity() {
        int itemQuantity = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many would you like today?");
        itemQuantity += input.nextInt();
//        showMenu();
        return itemQuantity;
    }

    public static void getdateTime() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd' - 'hh:mm:ss a zz");
        System.out.println(ft.format(date));
    }

    public static void printReceipt (String name, String sale, int quantity, float price) {
        System.out.printf("Name: %s \nSale: %s\nQuantity: %d\nPrice: $%.2f", name, sale, quantity, price);

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


    /* ====== Overloaded Functions ====== */

    public static String displayData(String sales) {
        return sales;
    }

    public static Integer displayData(Integer quantity) {
        return quantity;
    }

    public static Float displayData(Float price) {
        return price;
    }


}
