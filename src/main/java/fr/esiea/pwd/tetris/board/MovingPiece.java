package fr.esiea.pwd.tetris.board;

import fr.esiea.pwd.tetris.movement.Movable;

public class MovingPiece implements Movable {
	
	private Position position;
	private Tetromino tetromino;
	
	public MovingPiece (Position position, Tetromino tetromino){
		this.position = position
		this.tetromino = tetromino
	}
	
	@Override
	public void goDown(MovementValidator movementValidator){
		
		new Position = position.getUnderposition();
		if(MovementValidator.isValid(getNewPosition(tetromino,newPosition))){
			position = new Position;
		}
		
	}
	
	@Override
	public void goRight(MovementValidator movementValidator){
		
		new Position = position.getRightposition();
		if(MovementValidator.isValid(getNewPosition(tetromino,newPosition))){
			position = new Position;
		}
		
	}

	
	@Override
	public void goLeft(MovementValidator movementValidator){
		
		new Position = position.getLeftposition();
		if(MovementValidator.isValid(getNewPosition(tetromino,newPosition))){
			position = new Position;
		}
	}
	
	
	@Override
	public void turnLeft(MovementValidator movementValidator){
		Tetromino newTetromino = tetromino.getLeftTetromino();
		if(movementValidator.isValid(getNewTetromino(newTetromino,position))){
			tetromino = newTetromino;
			
		}
		
	}
	
	@Override
	public void turnRight(MovementValidator movementValidator){
		Tetromino newTetromino = tetromino.getRightTetromino();
		if(movementValidator.isValid(getNewTetromino(newTetromino,position))){
			tetromino = newTetromino;
			
		}
		
	}

	public void goDown() {
		// TODO Auto-generated method stub
		
	}

	public void goRight() {
		// TODO Auto-generated method stub
		
	}

	public void goLeft() {
		// TODO Auto-generated method stub
		
	}

	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	public void turnRight() {
		// TODO Auto-generated method stub
		
	}
}

