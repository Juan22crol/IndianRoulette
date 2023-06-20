import java.io.File;
import java.util.Random;
import java.util.Scanner;

/*
 * It is extremely recommended not to run this file
 */

public class IndianRoulette {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Indian Roulette");
        System.out.println("Execute this under your responsability");
        System.out.println("Are you sure you want to proceed?");
        System.out.println("Y/N");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("Y")) {
            Random b = new Random();
            int bullet = b.nextInt(6) + 1;

            int shot = b.nextInt(6) + 1;

            File head = new File("C:/Windows/System32");

            if (bullet == shot) {
                head.delete();
                System.out.println("U dead bro");
            }
        } else{
            System.out.println("Are u afraid?");
        }
    }
}
