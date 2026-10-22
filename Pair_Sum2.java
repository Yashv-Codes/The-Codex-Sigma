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
        int left = bp+1, right = bp;
        while(left != right){
            if(list.get(left) + list.get(right) == tar)
                return true;

            else if(list.get(left) + list.get(right) < tar)
                left = (left+1) % n;

            else
                right = 
        }


    }
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>(List.of(11, 15, 6, 8, 9, 10));
    }
    
}
