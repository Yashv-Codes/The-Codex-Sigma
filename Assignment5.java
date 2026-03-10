import java.util.*;
public class Assignment5 {
    public static String count_vowels(String str){
        StringBuilder sb = new StringBuilder("");
        Integer count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        sb.append(count.toString());
        return sb.toString();
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        // String str = sc.nextLine();
        // System.out.println("Total vowels occured: "+count_vowels(str));
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }
}


