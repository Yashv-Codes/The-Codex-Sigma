public class practice {
    public static int BintoDec(int binary){
        int decimal = 0;
        int pow = 0;
        int lastdigit = binary%10;
        while(binary!=0){
            decimal += (lastdigit*Math.pow(2,pow));
            binary /= 10;
            pow++;
        }
        return decimal;
    }
    public static void main(String[] args){
        System.out.println("Decimal = "+BintoDec(10101101));
    }
    
}
