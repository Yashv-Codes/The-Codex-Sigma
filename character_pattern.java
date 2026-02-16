public class character_pattern {
    public static void main(String args[]){
        int n = 4;
    //     char ch = 'A';
    //     for(int line=1; line<=n; line++){
    //         for(int chars=1; chars<=line; chars++){
    //             System.out.print(ch);
    //             ch++;
    //         }
    //         System.out.println();
    //     }

    // ANOTHER SIMILAR PATTERN
     for(int line=1; line<=n; line++){
            for(char ch='A'; ch<'A'+line; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

    
    

