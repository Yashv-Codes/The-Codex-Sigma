public class Tiling_problem {
    public static int countways(int n){ // 2 X N Floor
        if(n==0 || n==1)
            return 1;
        
        // Vertical choice
        int fm1 = countways(n-1);

        // Horizontal choice
        int fm2 = countways(n-2);

        return fm1 + fm2;
    }


public static void main(String[] args){
    System.out.println("Total ways = "+countways(4));
}
}

