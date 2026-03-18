public class OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen(); // created a object -> p1
        p1.setColor("Yellow");
        p1.setTip(5);

        BankAccount myacc = new BankAccount();
        myacc.username = "YashVerma";
        myacc.setpass("abc");
        System.out.println(myacc.username);
    }
}

class Pen{
    private String color;
    private int tip;

    // Getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    // Seters
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setpass(String pwd){
        password = pwd;
    }
}



