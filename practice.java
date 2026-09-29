public class practice {
    public static void main(String[] args) {
        // Fish f = new Fish();
        // f.sleep();
        // f.breathe();
        Mammal m = new Mammal();
        m.eat();
        m.swim();
        m.breathe();
        
        
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void sleep(){
        System.out.println("sleeps");
    }

}
class Fish{
    void eat(){
        System.out.println("eats");
    }
    void swim(){
        System.out.println("swims");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Fish{
    String color;
    void eat(){
        System.out.println("eats");
    }

}



        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

