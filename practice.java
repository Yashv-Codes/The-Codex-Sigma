import java.util.*;
public class practice {
    public static int mostfrequent(ArrayList<Integer>list, int key){
        int maxcount = 0, ans = 0;
        int count[] = new int[1001];
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) == key){
                int target = list.get(i+1);
                count[target]++;

                if(count[target] > maxcount){
                    maxcount = count[target];
                    ans = target;
                }
            }
            
        }
        return ans;
    }

    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>(List.of(1,100,200,1,100));
        ArrayList<Integer>list1 = new
    }
    
}
