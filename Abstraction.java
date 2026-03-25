public class Abstraction {
    public static void main(String[] args){
        

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

}

