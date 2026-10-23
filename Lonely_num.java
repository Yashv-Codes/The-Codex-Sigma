import java.util.*;
public class Lonely_num {
    public static ArrayList<Integer> lonely(ArrayList<Integer>list){
        ArrayList<Integer>ans = new ArrayList<>();
        if(list == null || list.isEmpty())
            return ans;

        else if(list.size() == 1){
            ans.add(list.get(0));
            return ans;
        }

        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            int current = list.get(i);
            boolean islonely = true;
            if(i > 0){
                if((current - list.get(i-1)) <= 1)
                    islonely = false;
            }

            if(i < list.size()-1){
                if((list.get(i+1) - current))
            }
        }
        
    }
    
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(10,6,5,8));
        
    }
}
