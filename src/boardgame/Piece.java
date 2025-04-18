package boardgame;

public class Piece {

	protected  Position position;
	private Board board;
	
	public Piece() {
		
	}

	public Piece(Board board) {
		this.board = board;
		position = null; // nao precisa botar pois o java ja add o padrao nulo, mas eu botei
	}

	protected Board getBoard() {
		return board;
	}

	
	
}
