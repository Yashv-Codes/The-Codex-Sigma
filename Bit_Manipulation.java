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
    public static void main(String[] args){
        // Bit-Wise AND
        System.out.println((5 & 6));

        // Bit-Wise OR
        System.out.println((5 | 6));

        // Bit-Wise XOR
        System.out.println((5 ^ 6));

        // Binary one's complement
        System.out.println((~0));
        System.out.println((~5));

        // Binary Left Shift
        System.out.println((5 << 2));

        // Binary Right Shift
        System.out.println((6 >> 1));

        OddorEven(4);
        OddorEven(7);
    }
}





