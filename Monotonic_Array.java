import java.util.*;
public class Monotonic_Array {
    public static boolean isMonotonic(ArrayList<Integer>list){
        if(list.size() <= 2)
            return true;

        boolean up = true, down = true;

        for(int i=0; i<list.size()-1; i++){
            int current = list.get(i), next = list.get(i+1);
            if(current < next)
                down = false;

            if(current > next)
                up = false;

            if(!up && !down)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>(List.of(1,2,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(9, 5, 2, 1)); 
        ArrayList<Integer> list3 = new ArrayList<>(List.of(1, 5, 2, 4)); 
        ArrayList<Integer> list4 = new ArrayList<>(List.of(4, 4, 4, 4));

        System.out.println(isMonotonic(list));
        System.out.println(isMonotonic(list2));
        System.out.println(isMonotonic(list3));
        System.out.println(isMonotonic(list4));

    }
}
