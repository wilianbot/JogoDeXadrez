package jogoDeXadrez.boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(){
    }

    public Piece(Board board) {
        this.board = board;
        position = null; 
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    protected Board getBoard() {
        return board;
    }
   
}
