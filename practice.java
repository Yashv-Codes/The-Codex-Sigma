import java.util.*;
public class practice{
    public static int linear_search(String menu[], String key){
        for(int i=0; i<menu.length; i++){
             if(menu[i] == key)
                return i;
        }
        return -1;
    }

   
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int nums[] = {2, 4, 6, 8, 10, 12, 14};
        String menu[] = {"noodles", "pav bhaji", "idli sambhar", "samosa", "butter paneer"};
        String key = "samosa";
        int index = linear_search(menu,key);
        if(key == -1)
            System.out.println("Key not found");
        else{
            System.out.println("Key found at index: "+linear_search(menu,key));
        }
        
        sc.close();
    }
}
    

