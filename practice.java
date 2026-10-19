import java.util.*;
public class practice {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList <>(List.of(2, 5, 9, 3, 6));
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max = Math.max(i, max);
        }

        
    }
    
}
