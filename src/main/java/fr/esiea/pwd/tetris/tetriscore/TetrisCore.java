package fr.esiea.pwd.tetris.tetriscore;

import fr.esiea.pwd.tetris.inputreader.InputReader;

public class TetrisCore {
	
	private boolean isNotLost=true;
	private static final InputReader reader = new InputReader();
	private static final Printer gamePrinter = new Printer();
	
	public TetrisCore () {
		
		
	}
	
	public void run() {
		
		reader.read();
		
		while (isNotLost) {
			
			board.apply(movement);
			gamePrinter.print;
			reader.read();			
		}
	}

	

}
