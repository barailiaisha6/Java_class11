package day_7;  

import java.util.scanner;

public class Program{
    public static void main(string args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length");
        double l = scanner.nextDouble();

        System.out.println("Enter the breadth");
        double b = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(l, b);

        rectangle.areaOfRectangle();
        rectangle.areaOfPerimeter();
    }
}