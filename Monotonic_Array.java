import java.util.*;
public class Monotonic_Array {
    public static boolean isMonotonic(ArrayList<Integer>list){
        if(list.size() <= 2)
            return true;

        boolean up = true, down = false;

        for(int i=0; i<list.size(); i++){
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
        ArrayList<Integer>list = new ArrayList<>(List.of(1,2,2,3));

    }
}
