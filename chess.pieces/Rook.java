package jogoDeXadrez.chess.pieces;

import jogoDeXadrez.boardgame.Board;
import jogoDeXadrez.chess.ChessPiece;
import jogoDeXadrez.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "R";
    }
}
