public class statements {
    public static void main(String args[]){
        int i;
        // while(i<=n){
        //     if( i == 4){
        //         break;
        //     }
        //        System.out.println("Hi");
        //        i++;
        //     }
         for(i=1;i<=20;i = i+2){
            if(i%10==0)
                continue;
            System.out.println(i);
        }
    }
}
