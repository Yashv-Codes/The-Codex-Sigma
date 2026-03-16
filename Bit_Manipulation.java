public class Bit_Manipulation{
    public static void OddorEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("It's even");
        }
        else{
            System.out.println("It's odd");
        }
    }
    public static boolean isPowerofTwo(int n){
        if(n==0)
            return false;
        else if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
    public static int countsetbits(int n){
        int count = 0;
        while(n>0){ // check our LSB
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastexpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){ // checks LSB
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static long modExp(long a, long n, long m){
        long ans = 1;
        while(n>0){
            if((n&1)!=0)
                ans = (ans*a)%m;
            a = (a*a)%m;
            n = n>>1;
        }
        return ans;
    }
    
    public static void main(String[] args){
        // Bit-Wise AND
        // System.out.println((5 & 6));

        // // Bit-Wise OR
        // System.out.println((5 | 6));

        // // Bit-Wise XOR
        // System.out.println((5 ^ 6));

        // // Binary one's complement
        // System.out.println((~0));
        // System.out.println((~5));

        // // Binary Left Shift
        // System.out.println((5 << 2));

        // // Binary Right Shift
        // System.out.println((6 >> 1));

        // OddorEven(4);
        // OddorEven(7);

        // System.out.println(isPowerofTwo(0));
        // System.out.println(isPowerofTwo(16));

        // System.out.println(countsetbits(15));
        // System.out.println(fastexpo(5,3));

        System.out.println(modExp(34,7,3));


    }
}








