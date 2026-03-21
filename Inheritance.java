public class Inheritance {
    public static void main(String[] args){
        Fish lionfish = new Fish();
        lionfish.eat();
        lionfish.swim();

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


