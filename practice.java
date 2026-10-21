import java.util.*;
public class practice {
    public static boolean pair_sum2(ArrayList<Integer>list, int tar){
        int left = 0, right = list.size()-1;
        while(left != right){
            if(list.get(left) + list.get(right) == tar)
                return true;

            else if(list.get(left) + list.get(right) < tar)
                left++;

            else
                right--;
        }
        return false;
    }
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(pair_sum2(list, 5));
        
    }
}
