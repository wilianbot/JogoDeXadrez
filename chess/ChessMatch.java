package jogoDeXadrez.chess;

import jogoDeXadrez.boardgame.Board;

public class ChessMatch {
    private Board board;


    // METODOS

    public ChessMatch(){
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat; // Retorna a Matriz de peça da partida de xadrez
    }    


}
