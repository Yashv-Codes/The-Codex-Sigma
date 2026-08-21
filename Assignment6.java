public class Assignment6 {
    public static void swaptwonum(){
        int a = 20, b = 30;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    public static void toUppercase(){
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
        System.out.println();
    }
    public static void toLowercase(){
        for(char ch='a'; ch<='z'; ch++){
            System.out.print((char)(ch & '_'));
        }
    }
    public static void main(String[] args){
        System.out.println(1^1);
        // swaptwonum();
        toUppercase();
        toLowercase();
        
        
    }
}





