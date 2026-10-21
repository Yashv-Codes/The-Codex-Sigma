import java.util.*;
public class Water_Container {
    public static int store_water(ArrayList<Integer>height){
        int max_water = 0;
        int left = 0;
        int right = height.size()-1;
        
        while(left < right){
            int ht = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int curr_water = ht * width;
            max
        }
    }
    
    public static void main(String[] args){
        ArrayList<Integer>height = new ArrayList<>(List.of(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println(store_water(height));
        
    }
}

        



