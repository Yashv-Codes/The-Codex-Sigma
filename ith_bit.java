public class ith_bit {
    public static int Get_ith(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0)
            return 0;
        else
            return 1;
        }
    public static void main(String[] args){
        System.out.println(Get_ith(10,2));
    }
}

