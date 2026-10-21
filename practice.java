import java.util.*;
public class practice {
    public static boolean pair_sum(ArrayList<Integer>list, int tar){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j) == tar)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(pair_sum(list, 5));
    }
}
