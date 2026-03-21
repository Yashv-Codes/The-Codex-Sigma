public class Inheritance {
    public static void main(String[] args){
        // Fish lionfish = new Fish();
        // lionfish.eat();
        // lionfish.breathe();
        // lionfish.swim();

        Dog pitbull = new Dog();
        


    }
}

// Base class
class Animal{
    String skincolor;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

// Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}

// Multilvl Inheritance
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}



