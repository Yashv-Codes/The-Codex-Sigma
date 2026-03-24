public class Polymorphism {
    public static void main(String[] args){
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(4,5));
        // System.out.println(calc.sum((float)5.6,(float)8.9));
        // System.out.println(calc.sum(7,8,9));

        Deer d1 = new Deer();
        d1.eat();
    }
}

// Method Overloading
class Calculator{
    int sum(int a, int b){
            return a+b;
        }

        float sum(float a, float b){
            return a+b;
        }

        // double subtract(double a, double b){
        //     return a - b;
        // }

        int sum(int a, int b, int c){
            return a+b+c;
        }
    }

// Method Overriding
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}



        
    
    

