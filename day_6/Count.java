package day_6;

public class Count{
    public static void main(String []args){
        int count = 1;
        for( int i = 1; count < 20; i++){
            if (i % 2 !=0){
              System.out.println(i); 
              count++;
            }
        }
    }
}