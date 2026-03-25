public class Abstraction {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        c1.run();

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

    class Chicken extends Horse{
        void run(){
            System.out.println("runs with chicken legs");
        }
    }



