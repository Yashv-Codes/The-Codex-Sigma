public class practice {
    public static int BintoDec(int binary){
        int decimal = 0;
        int pow = 0;
        while(binary!=0){
            int lastdigit = binary%10;
            decimal += (lastdigit*Math.pow(2,pow));
            binary /= 10;
            pow++;
        }
        return decimal;
    }
    public static int DectoBin(int dec){
        int
    }
    public static void main(String[] args){
        System.out.println("Decimal = "+BintoDec(101));
    }
    
}
