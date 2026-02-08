package day_3;
import java.util.Scanner;

public class User{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to make a list in array:");

        String name[] = new String[10];

        for(int i=0; i<name.length; i++)
        {
            name[i] =  input.nextLine();
        }

         System.out.println("The 10 number value in array are:")
        for (int i=1; i<name.length; i++)
        {
            System.out.println(name[i]);
        }
    }
}