import java.util.*;
public class practice_3 {
    public static void main(String args[]){
        // Code to calculate sum
        Scanner ob = new Scanner(System.in);
        Float radius = ob.nextFloat();
        // int b = ob.nextInt();
        // int sum = a+b;
        // int product = a*b;
        Float areaofcircle = 3.14f*radius*radius; /* always use f for float, beacuse java always 
        automatically takes decimal values to double */ 
        System.out.println(areaofcircle);
        ob.close();
    }
    
}



