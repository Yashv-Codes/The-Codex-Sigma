import java.util.*;
public class Strings_basics {
    public static void printletters(String name){
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
    public static boolean ispalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static boolean comparision(String s1, String s2){
        if(s1==s2)
            System.out.println("Equal");
        else if(s1.equals(s2))
            return true;
        return false;
    }
    public static void main(String[] args){
        char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "Yash Verma";
        String str1 = new String("xyz");
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        // String name = sc.nextLine();
        // System.out.println("You entered: "+name);
        // sc.close();

        // System.out.println(str.length());

        // Concatenation
        // String str2 = str+str1;
        // System.out.println(str2); 
        // System.out.println(str2.charAt(0));

        String name = "Kisna Tailor";
        String str = "noon";
        String s1 = "tony";
        String s2 = new String("tony");
        System.out.println(comparision(s1,s2));
        
    }
}










