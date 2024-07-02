package jogoDeXadrez.chess.pieces;

import jogoDeXadrez.boardgame.Board;
import jogoDeXadrez.chess.ChessPiece;
import jogoDeXadrez.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "K";
    }
}
