public class Friends_pairing {
    public static int totalways(int n){
        if(n==1 || n==2)
            return n;
        // Single
        int fnm1 = totalways(n-1);

        // Pair
        int fnm2 = totalways(n-2);
        int eachpair_ways = (n-1) * fnm2;

        // Totalways
        return fnm1 + eachpair_ways;
    }

    public static void main(String[] args){
        System.out.println("Total ways = "+totalways(5));
    }
}

