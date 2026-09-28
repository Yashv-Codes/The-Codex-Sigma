public class OOPS {
    public static void main(String[] args){
        Book b = new Book();
        b.setColor("Green");
        // b.setName("Little Progess each day");
        // b.setPages(300);
        // b.color = "Yellow";
        // System.out.println(b.color);
        // System.out.println(b.name);
        // System.out.println(b.pages);

    }
}
    class Book{
        String color, name;
        int pages;
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





