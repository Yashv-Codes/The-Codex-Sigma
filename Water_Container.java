import java.util.*;
public class Water_Container {
    public static int store_water(ArrayList<Integer>height){
        int maxwater = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int width = j-i;
                int ht = Math.min(height.get(i), height.get(j));
                int curr_water = ht * width;
                maxwater = Math.max(maxwater, curr_water);
            }
        }
        return maxwater;
    }
    
    public static void main(String[] args){
        ArrayList<Integer>height = new ArrayList<>(List.of(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println(store_water(height));
        
    }
}

        



