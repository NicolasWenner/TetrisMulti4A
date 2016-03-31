package fr.esiea.pwd.tetris.tetriscore;

import fr.esiea.pwd.tetris.board.BoardGame;
import fr.esiea.pwd.tetris.graphics.Printer;
import fr.esiea.pwd.tetris.inputreader.InputReader;
import fr.esiea.pwd.tetris.movement.Movement;

public class TetrisCore {
	
	private static final InputReader reader = new InputReader();
	private static final Printer gamePrinter = new Printer();
	private static final BoardGame board = new BoardGame();
	
	public void run() {
		while (board.isNotLost()) {
			List<Movement> movements = reader.getMovement();
			board.apply(movements);
			gamePrinter.print();
		}
	}

	

}
