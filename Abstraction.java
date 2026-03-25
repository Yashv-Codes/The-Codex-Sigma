public class Abstraction {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eats");
        }
        abstract void walk();
    }

class Horse extends Animal{
    void walk(){
        System.out.println("walks with legs");
        }
    }
        
class Chicken extends Animal{
    void walk(){
        System.out.println("walks with chicken legs");
        }
    }
    










