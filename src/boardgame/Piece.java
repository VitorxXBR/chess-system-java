package boardgame;

public abstract class Piece {
	
	//Atributos
	protected Position position;
	
	private Board board;

	//Construtor
	public Piece(Board board) {
		this.board = board;
		position = null;
		//position = null;(posição da peça inicialmente é nula)
	}

	//Getter an setters:
	
	protected Board getBoard() {
		return board;
	}
	// set Board excluido para não permitir que o tabuleiro seja alterado.
	
	
	public abstract boolean[][] possibleMoves();
	
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean [][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
