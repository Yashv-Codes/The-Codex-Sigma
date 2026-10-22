import java.util.*;
public class Pair_Sum2 {
    public static boolean pair_sum(ArrayList<Integer>list, int tar){
        int bp = -1, n = list.size();
        for(int i=0; i<n; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int left = 


    }
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>(List.of(11, 15, 6, 8, 9, 10));
    }
    
}
