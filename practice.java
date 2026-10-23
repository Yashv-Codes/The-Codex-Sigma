import java.util.*;
public class practice {
    public static boolean lonely_num(ArrayList<Integer>list){
        for(int i=0; i<list.size(); i++){
            int adj_1 = list.get(i+1), adj_2 = list.get(i-1);
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) == list.get(j))
                    return -1;
                else if(list.get(j) == adj_1 || list.get(j) == adj_2)
                    return false;
            }
        }
    }
    
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(10,6,5,8));
        
    }
}
