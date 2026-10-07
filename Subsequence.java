public class Subsequence {
    public static void print(String str, int i, String newStr){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(i);
        // to be part
        print(str, i+1, newStr+currchar);

        // not to be part
        print(str, i+1, newStr);
    }
    
}
