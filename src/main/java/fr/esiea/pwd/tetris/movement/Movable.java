package fr.esiea.pwd.tetris.movement;

import fr.esiea.pwd.tetris.board.MovementValidator;

public interface Movable {
	
		void goDown();
		void goRight();
		void goLeft();
		void turnLeft();
		void turnRight();
}
