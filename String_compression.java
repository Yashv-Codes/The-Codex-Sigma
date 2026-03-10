public class String_compression {
    public static String tocompress(String str){
        StringBuilder sb = new StringBuilder("");
        // sb.append(str.charAt(0));
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){ // while loop is for count only.
                count++;
                i++;
            }
            sb.append(str.charAt(i)); // will print current value of i.
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "aaabbcccdd";
        System.out.println(tocompress(str));
    }
}



