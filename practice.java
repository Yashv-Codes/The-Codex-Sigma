import java.util.*;
public class practice {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList <>(List.of(1, 2, 3, 4, 5));
        System.out.println(list);
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    
}
