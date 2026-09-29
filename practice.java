public class practice {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.sleep();
        f.breathe();
        
        
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
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Fish{
    String color;

}



        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

