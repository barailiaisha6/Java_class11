package day_7;

import java.util.scanner;

public class Rectangle{
      double l;
      double b;
      double area; 
      double perimeter;

    public Rectangle(double l, double b){
        this.l = l;
        this.b = b;
        
    }

    void areaOfRectangle(){
        area = l * b;
        System.out.println("Area of rectangle is " + area);
    }

    void perimeterOfRectangle(){
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }  
}



