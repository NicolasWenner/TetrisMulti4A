package fr.esiea.pwd.tetris.board;

import java.io.IOException;
import java.util.*;

import fr.esiea.pwd.tetris.movement.Movement;

public class BoardGame implements printable {
	private boolean loose = false;
	private MovingPiece piece;
	MovementValidator movementValidator;
	
	public void applyMovements(List<Movement> movements){
		for (Movement : movement : movements){
			movement.move(movementValidator, piece);
		}
	}
}
