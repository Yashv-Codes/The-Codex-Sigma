public class Floydtriangle{
    public static void main(String args[]){
        int n = 5;
        int num = 1;
        for(int line=1; line<=n; line++){
            for(int j=1; j<=line; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

