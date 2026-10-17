public class practice {
    public static void combinations(String str, String ans, int i){
        String keypad[] = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(i);
        String letter = keypad[ch - '0'];
        for(int i=0; i<letter.length(); i++){
            
        }

    }
    
}
