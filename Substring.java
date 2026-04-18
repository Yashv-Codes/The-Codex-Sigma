public class Substring {
    public static String print(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    // Substring using recursion
    public static void printsubstr(String str, int start, int end){
        if(start == str.length())
            return;

        // Loop finished -> move to next character
        if(end > str.length()){
            printsubstr(str, start+1, start+1);
            return;
        }
        // Print current substring
        System.out.println(str.substring(start,end));

        printsubstr(str, start, end+1);
    }
    public static void main(String[] args){
        String str = "Hello World";
        // System.out.println(printsubstr(str,0,5));
        System.out.println(str.substring(0,5));

        // String fruits[] = {"apple", "mango", "banana"};
        // String largest = fruits[0];
        // for(int i=0; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        // Stringbuilder
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}



