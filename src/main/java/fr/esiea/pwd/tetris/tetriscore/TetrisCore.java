package fr.esiea.pwd.tetris.tetriscore;

import fr.esiea.pwd.tetris.inputreader.InputReader;

public class TetrisCore {
	
	private static final InputReader reader = new InputReader();
	private static final Printer gamePrinter = new Printer();
	private static final BoardGame board = new BoardGame();
	
	public void run() {
		
		reader.read();
		
		while (boardGame.isNotLost()) {
			List<Movement> movements = InputReader.getMovements();
			board.apply(movements);
			gamePrinter.print;
			reader.read();			
		}
	}

	

}
