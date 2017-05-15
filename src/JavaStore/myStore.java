package JavaStore;

import java.util.Scanner;
import java.util.Date;
/**
 * Created by DelMonroe on 5/15/17.
 */
public class myStore {
    public static void main(String[] args) {

        getName();
        showMenu();

    }

    public static void showMenu () {

        Scanner scan = new Scanner(System.in);

        System.out.println("======= Store Menu ======");
        System.out.println("1) Sale\n");
        System.out.println("2) Print Receipt\n");
        System.out.println("3) Exit\n");
    }

    public static String Sale(String item) {
        String items = " ";
        System.out.println("What Item do you want?");

        return items;
    }

    public static float Price(Float price) {
        float prices = 0;
        System.out.println("Please Enter the Price");
        return prices;
    }

    public static int getQuantity(Integer itemQuantity) {
        int itemQuantities = 0;
        return itemQuantities;
    }

    public static void getdateTime () {
        Date date = new Date();
        System.out.println(date);

    }

    public static void getName () {
        Scanner input = new Scanner(System.in);
        String fname;


        do {
            System.out.println("Please enter your name: ");
            fname = input.nextLine();

        } while (fname.isEmpty());
        System.out.println("Name:" + fname);
    }

    public static void exitMenu() {

    }
}
