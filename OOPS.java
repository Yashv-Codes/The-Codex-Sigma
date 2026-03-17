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
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setpass(String pwd){
        password = pwd;
    }
}



