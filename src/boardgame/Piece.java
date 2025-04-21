package boardgame;

public abstract class Piece {

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

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0;i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
