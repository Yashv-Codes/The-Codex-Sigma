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
    Animal(){
        System.out.println("animal constructor is called");
    }
    void eat(){
        System.out.println("eats");
        }
        abstract void walk();
    }

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called");
    }
    void walk(){
        System.out.println("walks with legs");
        }
    }
        
class Chicken extends Animal{
    Chicken(){
        System.out.println("chicken constructor is called");
    }
    void walk(){
        System.out.println("walks with chicken legs");
        }
    }
    











