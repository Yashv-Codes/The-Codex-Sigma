public class operators {
    public static void main(String args[]){
        int a = 69, b=37;
        System.out.println("add = " + (a+b));
        System.out.println("sub = " + (a-b));
        System.out.println("mul = " + (a*b));
        System.out.println("div = " + (a/b));
        System.out.println("modulo = " + (a%b));

        // LOGICAL AND
        System.out.println(a>b && b==a);

        // LOGICAL OR
        System.out.println(a>b || b==a);

        // LOGICAL NOT
        System.out.println(a!=b);
        System.out.println(!(b>a));

        // PRE-INCREMENT OPERATOR
        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);
        
        // PRE-DECREMENT OPERATOR
        int e = 9;
        int f = --e;
        System.out.println(e);
        System.out.println(f);
    }
    
}


