import java.util.*;
public class Advanced_patterns {
    public static void zero_one_pattern(int n){
        for(int line=1; line<=n; line++){
            for(int num=1; num<=line; num++){
                if((line+num)%2==0)
                    System.out.print("1"+ " ");
                else
                    System.out.print("0"+ " ");
                }
                System.out.println();
            }
        }
    public static void Butterfly_pattern(int n){
        // Upper half
        int M = 6;
        for(int line=1; line<=n; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*"+" ");
            }
            // Spaces
            for(int space=1; space<=M; space++){
                System.out.print(" "+ " ");
            }
            M -= 2;
            // Again stars
            for(int star=1; star<=line; star++){
                System.out.print("*"+" ");
            }
            System.out.println(); // next line
        }
        // Second Half
        int K = 0;
        for (int line=n; line>=1; line--){
            for(int star=1; star<=line; star++){
                System.out.print("*"+ " ");
            }
            // Spaces
            for(int space=1; space<=K; space++){
                System.out.print(" "+" ");
            }
            K += 2;
            // Again Stars
            for(int star=1; star<=line; star++){
                System.out.print("*"+" ");
            }
            System.out.println(); // for next line
        }
    }
    public static void Solid_rhombus(int n){
        int 


    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        Butterfly_pattern(n);
        sc.close();
    }
}






