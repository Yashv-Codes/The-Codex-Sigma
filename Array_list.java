import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args){
        // ArrayList <String> lis1 = new ArrayList <> ();
        ArrayList <Integer> list = new ArrayList <> ();

        // Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Get element
        int element = list.get(2); 
        System.out.println(element);

        // Remove element
        list.remove(2);
        System.out.println(list);

        // Set element
        list.set(2, 3);
        System.out.println(list);

        // Contains element
        System.out.println(list.contains(4));
        System.out.println(list.contains(2));

        // Size of list
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}

