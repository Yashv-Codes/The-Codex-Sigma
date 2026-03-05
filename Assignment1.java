import java.util.*;
public class Assignment1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // AVG. of numbers.
        // int a = sc.nextInt();
        // float b = sc.nextFloat();
        // Long c = sc.nextLong();
        // System.out.println((a+b+c)/2);
        
        // Area of square.
        Double side = sc.nextDouble();
        Double Area = side*side;
        System.out.println(Area);

        // GST calculate
        Float pen = sc.nextFloat();
        Float pencil = sc.nextFloat();
        Float eraser = sc.nextFloat();
        Double GST = (pen+pencil+eraser)*0.18;
        System.out.println(GST);
        sc.close();

        // OUTPUT OF CODE
        byte b =4;
        char c ='a';
        short s= 512;
        int i =1000;
        float f = 3.14f;
        double d = 56.987;
        System.out.println((f*b)+(i%c)-(d*s));
        
        

        






    }
    
}
