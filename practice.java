public class practice {
    public static boolean isPalindrome(int n){
        if(n < 0 || (n % 10 == 0 && n != 0))
            return false;
        int palindrome = n;
        int rev = 0;
        while(n != 0){
            int lastdigit = n % 10;
            rev = (rev*10)+lastdigit;
            n /= 10;
        }
        return palindrome == rev;
    }
    
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
       
    }
    
}
