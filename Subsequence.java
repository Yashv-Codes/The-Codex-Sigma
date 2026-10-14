public class Subsequence {
    public static void print(String str, String newStr, int i){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(i);
        // to be part
        print(str, newStr+currchar, i+1);

        // not to be part
        print(str, i+1, newStr);
    }

    public static void main(String[] args){
        print("abc",0,"");
    }
    
}
