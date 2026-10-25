import java.util.*;
public class Beautiful_Arraylist {
    public static ArrayList<Integer> isBeautiful(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1); // Base Case

        while(ans.size() < n){
            ArrayList<Integer> fresh = new ArrayList<>();

            // Odd element
            for(int i=0; i<ans.size(); i++){
                int odd = 2 * ans.get(i) - 1;
                if(odd <= n)
                    fresh.add(odd);
            }

            // Even element
            for(int i=0; i<ans.size(); i++){
                int even = 2 * ans.get(i);
                if(even <= n)
                    
            }
        }
    }
    
    public static void main(String[] args){
        
}
}
