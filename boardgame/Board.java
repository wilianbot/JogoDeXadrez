package jogoDeXadrez.boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(){
    }

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    // METODOS

    public Piece piece(int row, int column){ // Vai retornar a minha matriz pieces na linha row e na coluna column
        return pieces[row][column];
    }

    public Piece piece(Position position) { // Retornar o Pieces na posição getRow e getColumn
        return pieces[position.getRow()][position.getColumn()];
    }


    
}
