package fr.esiea.pwd.tetris.tetriscore;

import fr.esiea.pwd.tetris.inputreader.InputReader;

public class TetrisCore {
	
	private static final InputReader reader = new InputReader();
	private static final Printer gamePrinter = new Printer();
	private static final 
	
	public void run() {
		
		reader.read();
		
		while (boardGame.isNotLost()) {
			List<Movement> movements = inputReader.getMovements();
			board.apply(movement);
			gamePrinter.print;
			reader.read();			
		}
	}

	

}
