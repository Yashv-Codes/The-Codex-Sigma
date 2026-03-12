public class ith_bit {
    public static int Get_ith(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0)
            return 0;
        else
            return 1;
    }

    public static int Set_ith(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int Clear_ith(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int Update_ith(int n, int i, int newbit){
        // if(newbit == 0){
        //     return Clear_ith(n,i);
        // }
        // else{
        //     return Set_ith(n,i);
        // }

        n = Clear_ith(n,i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    public static void main(String[] args){
        // System.out.println(Get_ith(10,2));
        // System.out.println(Set_ith(5,2));
        // System.out.println(Set_ith(6,3));
        System.out.println(Update_ith(10,2,1));
        
    }
}


