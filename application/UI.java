package jogoDeXadrez.application;

import jogoDeXadrez.chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d f g h");
    }

    private static void printPiece(ChessPiece piece) { // Metodo para imprimir uma peça
        if (piece == null){
            System.out.print("-");
        }
        else {
            System.out.println(piece);
        }
        System.out.print(" ");
    }
}
