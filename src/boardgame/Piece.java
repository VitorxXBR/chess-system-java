package boardgame;

public class Piece {
	
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
	
	
	
	
	
}
