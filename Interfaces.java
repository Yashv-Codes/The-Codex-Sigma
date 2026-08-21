public class Interfaces {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();

        King k = new King();
        k.moves();

        Rook r = new Rook();
        r.moves();
    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("moves in all directions and diagnols");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("moves in all directions by single step at a time");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("moves horizontally and vertically");
    }
}


