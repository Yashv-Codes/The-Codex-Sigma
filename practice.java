public class practice {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat(); b.play();
        
    }
}
interface Herbivore{
    void play();
}
interface Carnivore{
    void eat();
}
class Bear implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("Bear is non-vegetarian");
    }
    public void play(){
        System.out.println("Bear plays with ball");
    }
}





        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

