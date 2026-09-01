public class practice {
    public static int sumofdigit(int digit){
        int sum = 0;
        digit = Math.abs(digit);
        while(digit != 0){
            sum += digit % 10;
            digit /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args){
        System.out.println("Sum of digits = "+sumofdigit(-6778));
       
    }
    
}
