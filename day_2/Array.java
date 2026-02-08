package day_2;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

       System.out.println("The 5 number array are:")
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
