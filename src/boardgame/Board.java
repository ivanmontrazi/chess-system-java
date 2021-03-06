package boardgame;

public class Board {
	
	//Tabuleiro
	
	private int rows;
	private int columns;
	private Piece [] [] pieces;

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows] [columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece (int row, int column) {
		if (!positionExists(row,column)) {
			throw new BoardException("Positon not on the board");
		}
		return pieces [row] [column];
	}
	
	public Piece piece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Positon not on the board");
		}
		return pieces [position.getrow()] [position.getcolumn()];
	}
	
	public void placePiece (Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getrow()] [position.getcolumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getrow(), position.getcolumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Positon not on the board");
		}
		return piece (position) != null;
	}
	
	
}
