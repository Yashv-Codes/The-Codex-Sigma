public class BinaryStrings{
    public static void printBinaryStrings(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        // Place 0 
        printBinaryStrings(n-1, 0, str + "0");

        // Place 1 
        if(lastplace==1)
            printBinaryStrings(n-1, 0, str + "0");
    } 

    public static void main(String[] args){
        printBinaryStrings(3,0,"");
    }
}



