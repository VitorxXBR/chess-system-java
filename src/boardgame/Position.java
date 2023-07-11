package boardgame;

public class Position {
	
	//Atributos
	private Integer row;
	private Integer column;
	
	//Construtor: 
	
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	//Getters and Setters
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	//toString
	@Override
	public String toString() {	
		return row + ", "+column;
	}
	
	
	//Métodos: 
	
}
