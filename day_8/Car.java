//Create a class `Car` with a parameterized constructor (model, year). Print the values

package day_8;

public class Car{
    String model;
    int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    public static void main (String []args){
    Car car = new Car("Toyota", 2020);
    System.out.println("Model is: " + car.model);
    System.out.println("Year is: " + car.year);
}
 
}
    