package fr.esiea.pwd.tetris.board;

import java.io.IOException;
import java.util.*;

import fr.esiea.pwd.tetris.movement.Movement;

public class BoardGame implements printable {
	private boolean loose = false;
	private MovingPiece piece;
	MovementValidator movementValidator;
	
	public static int width = 10;
	public static int height = 21;
	public boolean board[][] = new boolean[height][width];
	
	public BoardGame(){
		int i,j;
		for(j = 0 ; j < width ; j++){
			board[0][j] = true;
		}
		for(i = 1 ; i < height ; i++){
			for(j = 0 ; j < width ; j++){
				board[i][j] = false;
			}
		}
	}
	
	public void applyMovements(ArrayList<Movement> movements){
		for (Movement movement : movements){
			movement.move(movementValidator, piece);
		}
	}
}
