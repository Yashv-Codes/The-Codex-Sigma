public class Super_keyword {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.name);

    }
    
}

class Animal{
    String name;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        // super();
        super.name = "Yash";
        System.out.println("horse constructor is called");
    }

}

