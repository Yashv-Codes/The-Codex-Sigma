public class OOPS {
    public static void main(String[] args){
        Book b = new Book();
        b.setColor("Green");
        System.out.println(b.getColor());
        b.setName("A little Progress each day");
        System.out.println(b.getName());
        b.setPages(300);
        System.out.println()
        
        // BankAcc b1 = new BankAcc();
        // b1.setPass("abc");
        // b1.setIFSC("1123408332");
        

    }
}
    class Book{
        private String color, name;
        private int pages;

        String getColor(){
            return this.color;
        }

        String getName(){
            return this.name;
        }

        int getPages(){
            return this.pages;
        }

        void setColor(String newColor){
            color = newColor;
        }
        void setName(String newName){
            name = newName;
        }
        void setPages(int newPages){
            pages = newPages;
        }
    }

    class BankAcc{
        private String password;
        private String IFSC;
        void setPass(String newPwd){
            password = newPwd;
        }
        void setIFSC(String newIFSC){
            IFSC = newIFSC;
        }
    }





