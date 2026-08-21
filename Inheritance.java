public class Inheritance {
    public static void main(String[] args){
        // Fish lionfish = new Fish();
        // lionfish.eat();
        // lionfish.breathe();
        // lionfish.swim();

        // Dog pitbull = new Dog();
        // pitbull.legs = 4;
        // pitbull.eat();
        // pitbull.breed = "brown";
        // System.out.println(pitbull.legs);
        // System.out.println(pitbull.breed);
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

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims in water");
//     }
// }

// Multilvl Inheritance

// class Mammal extends Animal{
//     int legs;
// }

class Dog extends Mammal{
    String breed;
}

// Hierarchial Inheritance
class Mammal extends Animal{
    void walk(){
    System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}





