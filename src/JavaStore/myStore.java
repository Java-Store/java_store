package JavaStore;

import java.util.Scanner;

/**
 * Created by DelMonroe on 5/15/17.
 */
public class myStore {
    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu () {

        Scanner scan = new Scanner(System.in);

        System.out.println("======= Store Menu ======");
        System.out.println("1) Sale\n");
        System.out.println("2) Print Receipt\n");
        System.out.println("3) Exit\n");
    }

    public static String Sale(String items) {
        System.out.println("What Item do you want?");
        return items;
    }
}
